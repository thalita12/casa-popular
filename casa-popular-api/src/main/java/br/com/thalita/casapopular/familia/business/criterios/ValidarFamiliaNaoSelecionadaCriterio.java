package br.com.thalita.casapopular.familia.business.criterios;

import br.com.thalita.casapopular.familia.entity.Familia;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class ValidarFamiliaNaoSelecionadaCriterio implements Criterio {

    @Override
    public Boolean validarCriterio(Familia familia) {
        return Objects.isNull(familia.getDataDeSelecao());
    }

}
