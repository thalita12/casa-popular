package br.com.thalita.casapopular.familiaapta.repository;

import br.com.thalita.casapopular.familiaapta.entity.Familia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FamiliaRepository extends JpaRepository<Familia, Long> {

    @Query("SELECT fa FROM Familia fa JOIN fa.pessoas")
    List<Familia> buscarTodasComPessoas();
}
