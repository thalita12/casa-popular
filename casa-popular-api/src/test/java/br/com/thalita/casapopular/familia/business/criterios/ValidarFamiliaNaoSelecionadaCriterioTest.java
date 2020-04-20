package br.com.thalita.casapopular.familia.business.criterios;

import br.com.thalita.casapopular.familia.entity.Familia;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class ValidarFamiliaNaoSelecionadaCriterioTest {

    @Test
    public void familiaNaoSelecionadaTest() {
        ValidarFamiliaNaoSelecionadaCriterio validarFamiliaNaoSelecionadaCriterio = new ValidarFamiliaNaoSelecionadaCriterio();

        Familia familia = new Familia();

        Assert.assertTrue(validarFamiliaNaoSelecionadaCriterio.validarCriterio(familia));
    }

    @Test
    public void familiaSelecionadaTest() {
        ValidarFamiliaNaoSelecionadaCriterio validarFamiliaNaoSelecionadaCriterio = new ValidarFamiliaNaoSelecionadaCriterio();

        Familia familia = new Familia();
        familia.setDataDeSelecao(LocalDateTime.now());

        Assert.assertFalse(validarFamiliaNaoSelecionadaCriterio.validarCriterio(familia));
    }

}
