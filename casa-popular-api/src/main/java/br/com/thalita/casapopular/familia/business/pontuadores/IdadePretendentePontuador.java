package br.com.thalita.casapopular.familia.business.pontuadores;

import br.com.thalita.casapopular.familia.entity.Familia;
import br.com.thalita.casapopular.familia.entity.Pessoa;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Objects;

@Component
public class IdadePretendentePontuador implements Pontuador{

    @Override
    public Integer gerarPontuacao(Familia familia) {
        LocalDateTime dataNascimentoPretendente = encontrarDataNascimentoDoPretendente(familia.getPessoas());

        Integer idadePretendente = calcularIdade(dataNascimentoPretendente);

        if (idadePretendente >= 45) {
            return 3;
        } else if (idadePretendente >= 30) {
            return 2;
        }

        return 1;
    }

    private LocalDateTime encontrarDataNascimentoDoPretendente(List<Pessoa> pessoas) {
        for (Pessoa pessoa : pessoas) {
            if (Objects.nonNull(pessoa.getTipo()) && pessoa.getTipo().equals(Pessoa.Tipo.PRETENDENTE) && Objects.nonNull(pessoa.getDataDeNascimento())) {
                return pessoa.getDataDeNascimento();
            }
        }

        return null;
    }

    private Integer calcularIdade(LocalDateTime dataNascimento) {
        LocalDateTime now = LocalDateTime.now();

        return (int) ChronoUnit.YEARS.between(dataNascimento, now);
    }

}
