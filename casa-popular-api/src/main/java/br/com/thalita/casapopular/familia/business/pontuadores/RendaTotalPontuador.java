package br.com.thalita.casapopular.familia.business.pontuadores;

import br.com.thalita.casapopular.familia.entity.Familia;
import br.com.thalita.casapopular.familia.entity.Pessoa;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

@Component
public class RendaTotalPontuador implements Pontuador{

    @Override
    public Integer gerarPontuacao(Familia familia) {
        BigDecimal rendaTotal = calcularRendaTotal(familia.getPessoas());

        if (rendaTotal.compareTo(BigDecimal.valueOf(900)) <= 0) {
            return 5;
        } else if (rendaTotal.compareTo(BigDecimal.valueOf(901)) >= 0 && rendaTotal.compareTo(BigDecimal.valueOf(1500)) <= 0) {
            return 3;
        } else if (rendaTotal.compareTo(BigDecimal.valueOf(1501)) >= 0 && rendaTotal.compareTo(BigDecimal.valueOf(2000)) <= 0) {
            return 1;
        }

        return 0;
    }

    private BigDecimal calcularRendaTotal(List<Pessoa> pessoas) {
        BigDecimal rendaTotal = BigDecimal.ZERO;

        for (Pessoa pessoa : pessoas) {
            if (Objects.nonNull(pessoa.getValorRenda())) {
                rendaTotal = rendaTotal.add(pessoa.getValorRenda());
            }
        }

        return rendaTotal;
    }

}
