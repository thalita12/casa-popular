package br.com.thalita.casapopular.familia.repository;

import br.com.thalita.casapopular.familia.entity.Familia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamiliaRepository extends JpaRepository<Familia, Long> {

}
