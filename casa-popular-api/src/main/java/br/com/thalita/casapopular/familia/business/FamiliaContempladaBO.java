package br.com.thalita.casapopular.familia.business;

import br.com.thalita.casapopular.familia.entity.Familia;
import br.com.thalita.casapopular.familia.repository.FamiliaRepository;
import br.com.thalita.casapopular.familia.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class FamiliaContempladaBO {

    @Autowired
    private FamiliaRepository familiaRepository;

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private PontuadorBO pontuadorBO;

    /*
    * Método que trás todas as famílias contempladas pela data de seleção e retorna uma lista ordenada pela pontuação em ordem descrscente
     */
    public List<Familia> buscarTodas() {
        List<Familia> todasFamilias = buscarFamilias();

        List<Familia> familiasAptas = filtarFamiliasContempladas(todasFamilias);

        return calcularPontuacao(familiasAptas)
            .stream()
            .sorted(Comparator.comparingInt(Familia::getPontos).reversed())
            .collect(Collectors.toList());
    }

    private List<Familia> buscarFamilias() {
        List<Familia> familias = familiaRepository.findAll();

        familias.stream().forEach(familia -> {
            familia.setPessoas(pessoaRepository.findByFamilia_Id(familia.getId()));
        });

        return familias;
    }

    private List<Familia> filtarFamiliasContempladas(List<Familia> familias) {
        return familias
                .stream()
                .filter(familia -> Objects.nonNull(familia.getDataDeSelecao()))
                .collect(Collectors.toList());
    }

    private List<Familia> calcularPontuacao(List<Familia> familias) {
        return pontuadorBO.calcularPontos(familias);
    }

}
