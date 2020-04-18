package br.com.thalita.casapopular.familiaapta.business;

import br.com.thalita.casapopular.familiaapta.entity.Familia;
import br.com.thalita.casapopular.familiaapta.repository.FamiliaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class FamiliaAptaBO {

    @Autowired
    private FamiliaRepository familiaRepository;

    public List<Familia> listar() {
        List<Familia> familias = familiaRepository.findAll();

        return familias
            .stream()
            .filter(Familia::apta)
            .sorted(Comparator.comparingInt(Familia::pontuacao).reversed())
            .collect(Collectors.toList());
    }
}
