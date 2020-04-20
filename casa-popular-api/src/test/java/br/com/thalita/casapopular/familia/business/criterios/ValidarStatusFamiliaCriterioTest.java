package br.com.thalita.casapopular.familia.business.criterios;

import br.com.thalita.casapopular.familia.entity.Familia;
import org.junit.Assert;
import org.junit.Test;

public class ValidarStatusFamiliaCriterioTest {

    @Test
    public void familiaComCadastroValidoTest() {
        ValidarStatusFamiliaCriterio validarStatusFamiliaCriterio = new ValidarStatusFamiliaCriterio();

        Familia familia = new Familia();
        familia.setStatus(Familia.Status.CADASTRO_VALIDO);

        Assert.assertTrue(validarStatusFamiliaCriterio.validarCriterio(familia));
    }

    @Test
    public void familiaComCadastroIncompletoTest() {
        ValidarStatusFamiliaCriterio validarStatusFamiliaCriterio = new ValidarStatusFamiliaCriterio();

        Familia familia = new Familia();
        familia.setStatus(Familia.Status.CADASTRO_INCOMPLETO);

        Assert.assertFalse(validarStatusFamiliaCriterio.validarCriterio(familia));
    }

    @Test
    public void familiaSelecionadaEmOutroProcessoTest() {
        ValidarStatusFamiliaCriterio validarStatusFamiliaCriterio = new ValidarStatusFamiliaCriterio();

        Familia familia = new Familia();
        familia.setStatus(Familia.Status.OUTRO_PROCESSO_SELECAO);

        Assert.assertFalse(validarStatusFamiliaCriterio.validarCriterio(familia));
    }

    @Test
    public void familiaPossuiUmaCasaTest() {
        ValidarStatusFamiliaCriterio validarStatusFamiliaCriterio = new ValidarStatusFamiliaCriterio();

        Familia familia = new Familia();
        familia.setStatus(Familia.Status.POSSUI_CASA);

        Assert.assertFalse(validarStatusFamiliaCriterio.validarCriterio(familia));
    }

    @Test
    public void familiaPossuiStatusInvalidoTest() {
        ValidarStatusFamiliaCriterio validarStatusFamiliaCriterio = new ValidarStatusFamiliaCriterio();

        Familia familia = new Familia();
        familia.setStatus(null);

        Assert.assertFalse(validarStatusFamiliaCriterio.validarCriterio(familia));
    }

}
