package br.com.thalita.casapopular.familia.repository;

import br.com.thalita.casapopular.familia.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    List<Pessoa> findByFamilia_Id(Long familiaId);

}
