package br.com.thalita.casapopular.familiaapta.repository;

import br.com.thalita.casapopular.familiaapta.entity.Familia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FamiliaRepository extends JpaRepository<Familia, Long> {

    @Query("select fa_id from tb_familia where ...")
    List<Familia>
}
