package br.com.thalita.casapopular.familia.business.pontuadores;

import br.com.thalita.casapopular.familia.entity.Familia;
import br.com.thalita.casapopular.familia.entity.Pessoa;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IdadeDependentePontuadorTest {

    @Test
    public void familiaSemDependentes() {
        IdadeDependentePontuador idadeDependentePontuador = new IdadeDependentePontuador();

        Familia familia = new Familia();
        familia.setPessoas(Collections.singletonList(
                Pessoa.builder()
                        .id(1L)
                        .tipo(Pessoa.Tipo.PRETENDENTE)
                        .build()
        ));

        Assert.assertEquals(idadeDependentePontuador.gerarPontuacao(familia), Integer.valueOf(0));
    }

    @Test
    public void familiaUmDependenteMenorDeIdade() {
        IdadeDependentePontuador idadeDependentePontuador = new IdadeDependentePontuador();

        Familia familia = new Familia();

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(
                Pessoa.builder()
                        .id(1L)
                        .nome("joao")
                        .tipo(Pessoa.Tipo.DEPENDENTE)
                        .dataDeNascimento(LocalDateTime.now())
                        .build()
        );
        pessoas.add(
                Pessoa.builder()
                        .id(2L)
                        .nome("catarina")
                        .tipo(Pessoa.Tipo.DEPENDENTE)
                        .dataDeNascimento(LocalDateTime.now().withYear(1992).withMonth(Month.SEPTEMBER.getValue()).withDayOfMonth(9))
                        .build()
        );
        familia.setPessoas(pessoas);

        Assert.assertEquals(idadeDependentePontuador.gerarPontuacao(familia), Integer.valueOf(2));
    }

    @Test
    public void familiaComMuitosDependentesMenoresDeIdade() {
        IdadeDependentePontuador idadeDependentePontuador = new IdadeDependentePontuador();

        Familia familia = new Familia();

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(
                Pessoa.builder()
                        .id(1L)
                        .nome("João Pereira")
                        .tipo(Pessoa.Tipo.DEPENDENTE)
                        .dataDeNascimento(LocalDateTime.now())
                        .build()
        );
        pessoas.add(
                Pessoa.builder()
                        .id(2L)
                        .nome("Catarina Pereira")
                        .tipo(Pessoa.Tipo.DEPENDENTE)
                        .dataDeNascimento(LocalDateTime.now().withYear(1992).withMonth(Month.SEPTEMBER.getValue()).withDayOfMonth(9))
                        .build()
        );
        pessoas.add(
                Pessoa.builder()
                        .id(3L)
                        .nome("Miguel Pereira")
                        .tipo(Pessoa.Tipo.DEPENDENTE)
                        .dataDeNascimento(LocalDateTime.now())
                        .build()
        );
        pessoas.add(
                Pessoa.builder()
                        .id(4L)
                        .nome("Silvio Santos Pereira")
                        .tipo(Pessoa.Tipo.DEPENDENTE)
                        .dataDeNascimento(LocalDateTime.now())
                        .build()
        );
        pessoas.add(
                Pessoa.builder()
                        .id(5L)
                        .nome("Fausto Silva Pereira")
                        .tipo(Pessoa.Tipo.DEPENDENTE)
                        .dataDeNascimento(LocalDateTime.now())
                        .build()
        );
        familia.setPessoas(pessoas);

        Assert.assertEquals(idadeDependentePontuador.gerarPontuacao(familia), Integer.valueOf(3));
    }

}
