package br.com.thalita.casapopular.familia.business.pontuadores;

import br.com.thalita.casapopular.familia.entity.Familia;
import br.com.thalita.casapopular.familia.entity.Pessoa;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Objects;

@Component
public class IdadeDependentePontuador implements Pontuador{

    @Override
    public Integer gerarPontuacao(Familia familia) {
        Integer quantidadeDeDependentesMenoresDeIdade = encontrarQuantidadeDeDependentesMenoresDeIdade(familia.getPessoas());

        if (quantidadeDeDependentesMenoresDeIdade >= 3) {
            return 3;
        } else if (quantidadeDeDependentesMenoresDeIdade >= 1) {
            return 2;
        }

        return 0;
    }

    private Integer encontrarQuantidadeDeDependentesMenoresDeIdade(List<Pessoa> pessoas) {
        Integer totalDependentes = 0;

        for (Pessoa pessoa : pessoas) {
            if (Objects.nonNull(pessoa.getTipo()) && pessoa.getTipo().equals(Pessoa.Tipo.DEPENDENTE) && Objects.nonNull(pessoa.getDataDeNascimento())) {
                if (calcularIdade(pessoa.getDataDeNascimento()) <= 18) {
                    totalDependentes++;
                }
            }
        }

        return totalDependentes;
    }

    private Integer calcularIdade(LocalDateTime dataNascimento) {
        LocalDateTime now = LocalDateTime.now();

        return (int) ChronoUnit.YEARS.between(dataNascimento, now);
    }
}
