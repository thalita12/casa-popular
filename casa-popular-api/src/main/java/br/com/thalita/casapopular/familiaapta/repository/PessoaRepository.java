package br.com.thalita.casapopular.familiaapta.repository;

import br.com.thalita.casapopular.familiaapta.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
