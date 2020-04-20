package br.com.thalita.casapopular.familia.business;

import br.com.thalita.casapopular.familia.business.pontuadores.Pontuador;
import br.com.thalita.casapopular.familia.entity.Familia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

@Component
public class PontuadorBO {

    @Autowired
    private List<Pontuador> pontuadores;

    public List<Familia> calcularPontos(List<Familia> familias) {
        familias.forEach(this::calcularPontoFamilia);

        return familias;
    }

    private void calcularPontoFamilia(Familia familia) {
        AtomicReference<Integer> pontos = new AtomicReference<>(0);
        AtomicReference<Integer> criteriosAtendidos = new AtomicReference<>(0);

        pontuadores.forEach(pontuador -> {
            Integer ponto = pontuador.gerarPontuacao(familia);
            if (Objects.nonNull(ponto)) {
                pontos.updateAndGet(v -> v + ponto);
                criteriosAtendidos.getAndSet(criteriosAtendidos.get() + 1);
            }
        });

        familia.setPontos(pontos.get());
        familia.setCriteriosAtendidos(criteriosAtendidos.get());
    }

}
