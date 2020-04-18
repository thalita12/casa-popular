package br.com.thalita.casapopular.familiaapta.business;

import br.com.thalita.casapopular.familiaapta.entity.Familia;
import br.com.thalita.casapopular.familiaapta.repository.FamiliaRepository;
import br.com.thalita.casapopular.familiaapta.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class FamiliaAptaBO {

    @Autowired
    private FamiliaRepository familiaRepository;

    @Autowired
    private PessoaRepository pessoaRepository;

    /*
    * Método que traz todas as famílias aptas para participar do governo e retorna uma lista ordenada pela pontuação em ordem descrscente
     */
    public List<Familia> buscarTodas() {
        List<Familia> familias = familiaRepository.buscarTodasComPessoas();

        return familias;
//            .stream()
//            .filter(Familia::apta)
//            .sorted(Comparator.comparingInt(Familia::pontuacao).reversed())
//            .collect(Collectors.toList());
    }

}
