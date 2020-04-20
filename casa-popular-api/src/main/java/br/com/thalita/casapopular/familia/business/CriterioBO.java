package br.com.thalita.casapopular.familia.business;

import br.com.thalita.casapopular.familia.business.criterios.Criterio;
import br.com.thalita.casapopular.familia.entity.Familia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

@Component
public class CriterioBO {

    @Autowired
    private List<Criterio> criterios;

    public List<Familia> validarCriterios(List<Familia> familias) {
        familias.forEach(this::calcularPontoFamilia);

        return familias
                .stream()
                .filter(Familia::getApta)
                .collect(Collectors.toList());
    }

    private void calcularPontoFamilia(Familia familia) {
        AtomicReference<Boolean> atendeTodosOsCriterios = new AtomicReference<>(Boolean.TRUE);

        criterios.forEach(pontuador -> {
            Boolean criterioAtendido = pontuador.validarCriterio(familia);
            if (!criterioAtendido) {
                atendeTodosOsCriterios.set(Boolean.TRUE);
            }
        });

        familia.setApta(atendeTodosOsCriterios.get());
    }

}
