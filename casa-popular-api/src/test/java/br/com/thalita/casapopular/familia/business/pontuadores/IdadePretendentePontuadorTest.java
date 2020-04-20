package br.com.thalita.casapopular.familia.business.pontuadores;

import br.com.thalita.casapopular.familia.entity.Familia;
import br.com.thalita.casapopular.familia.entity.Pessoa;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Collections;

public class IdadePretendentePontuadorTest {

    @Test
    public void pretendenteComIdadeAcimaDe45Anos() {
        IdadePretendentePontuador idadePretendentePontuador = new IdadePretendentePontuador();

        Familia familia = new Familia();

        familia.setPessoas(Collections.singletonList(
                Pessoa.builder()
                        .id(1L)
                        .tipo(Pessoa.Tipo.PRETENDENTE)
                        .dataDeNascimento(LocalDateTime.now().withYear(1970).withMonth(Month.SEPTEMBER.getValue()).withDayOfMonth(9))
                        .build()
        ));

        Assert.assertEquals(idadePretendentePontuador.gerarPontuacao(familia), Integer.valueOf(3));
    }

    @Test
    public void pretendenteComIdadeDe30Anos() {
        IdadePretendentePontuador idadePretendentePontuador = new IdadePretendentePontuador();

        Familia familia = new Familia();

        familia.setPessoas(Collections.singletonList(
                Pessoa.builder()
                        .id(1L)
                        .tipo(Pessoa.Tipo.PRETENDENTE)
                        .dataDeNascimento(LocalDateTime.now().withYear(1989).withMonth(Month.SEPTEMBER.getValue()).withDayOfMonth(9))
                        .build()
        ));

        Assert.assertEquals(idadePretendentePontuador.gerarPontuacao(familia), Integer.valueOf(2));
    }

    @Test
    public void pretendenteComIdadeAbaixoDe30Anos() {
        IdadePretendentePontuador idadePretendentePontuador = new IdadePretendentePontuador();

        Familia familia = new Familia();

        familia.setPessoas(Collections.singletonList(
                Pessoa.builder()
                        .id(1L)
                        .tipo(Pessoa.Tipo.PRETENDENTE)
                        .dataDeNascimento(LocalDateTime.now().withYear(1990).withMonth(Month.SEPTEMBER.getValue()).withDayOfMonth(9))
                        .build()
        ));

        Assert.assertEquals(idadePretendentePontuador.gerarPontuacao(familia), Integer.valueOf(1));
    }

}
