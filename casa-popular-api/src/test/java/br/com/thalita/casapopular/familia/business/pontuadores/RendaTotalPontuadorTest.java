package br.com.thalita.casapopular.familia.business.pontuadores;

import br.com.thalita.casapopular.familia.entity.Familia;
import br.com.thalita.casapopular.familia.entity.Pessoa;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RendaTotalPontuadorTest {

    @Test
    public void rendaTotalAte900Reais() {
        RendaTotalPontuador rendaTotalPontuador = new RendaTotalPontuador();

        Familia familia = new Familia();

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(
                Pessoa.builder()
                        .id(1L)
                        .nome("Anita Silva")
                        .tipo(Pessoa.Tipo.PRETENDENTE)
                        .valorRenda(BigDecimal.valueOf(900))
                        .build()
        );

        pessoas.add(
                Pessoa.builder()
                        .id(2L)
                        .nome("Fernando Silva")
                        .tipo(Pessoa.Tipo.CONJUGE)
                       .valorRenda(BigDecimal.valueOf(0))
                        .build()
        );

        familia.setPessoas(pessoas);

        Assert.assertEquals(rendaTotalPontuador.gerarPontuacao(familia), Integer.valueOf(5));
    }

    @Test
    public void rendaTotalAte1500Reais() {
        RendaTotalPontuador rendaTotalPontuador = new RendaTotalPontuador();

        Familia familia = new Familia();

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(
                Pessoa.builder()
                        .id(1L)
                        .nome("Anita Silva")
                        .tipo(Pessoa.Tipo.PRETENDENTE)
                        .valorRenda(BigDecimal.valueOf(1000))
                        .build()
        );

        pessoas.add(
                Pessoa.builder()
                        .id(2L)
                        .nome("Fernando Silva")
                        .tipo(Pessoa.Tipo.CONJUGE)
                       .valorRenda(BigDecimal.valueOf(500))
                        .build()
        );

        familia.setPessoas(pessoas);

        Assert.assertEquals(rendaTotalPontuador.gerarPontuacao(familia), Integer.valueOf(3));
    }

    @Test
    public void rendaTotalAte2000Reais() {
        RendaTotalPontuador rendaTotalPontuador = new RendaTotalPontuador();

        Familia familia = new Familia();

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(
                Pessoa.builder()
                        .id(1L)
                        .nome("Anita Silva")
                        .tipo(Pessoa.Tipo.PRETENDENTE)
                        .valorRenda(BigDecimal.valueOf(1000))
                        .build()
        );

        pessoas.add(
                Pessoa.builder()
                        .id(2L)
                        .nome("Fernando Silva")
                        .tipo(Pessoa.Tipo.CONJUGE)
                        .valorRenda(BigDecimal.valueOf(999))
                        .build()
        );

        familia.setPessoas(pessoas);

        Assert.assertEquals(rendaTotalPontuador.gerarPontuacao(familia), Integer.valueOf(1));
    }

    @Test
    public void rendaTotalAcimaDe2000Reais() {
        RendaTotalPontuador rendaTotalPontuador = new RendaTotalPontuador();

        Familia familia = new Familia();

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(
                Pessoa.builder()
                        .id(1L)
                        .nome("Anita Silva")
                        .tipo(Pessoa.Tipo.PRETENDENTE)
                        .valorRenda(BigDecimal.valueOf(1000))
                        .build()
        );

        pessoas.add(
                Pessoa.builder()
                        .id(2L)
                        .nome("Fernando Silva")
                        .tipo(Pessoa.Tipo.CONJUGE)
                        .valorRenda(BigDecimal.valueOf(1005))
                        .build()
        );

        familia.setPessoas(pessoas);

        Assert.assertEquals(rendaTotalPontuador.gerarPontuacao(familia), Integer.valueOf(0));
    }

}
