package edu.javeriana.ingenieria.social.semestre.repositorio;

import edu.javeriana.ingenieria.social.semestre.dominio.Semestre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioSemestre extends JpaRepository<Semestre, Integer> {
    Semestre findOneByCodigo(String codigo);

    boolean existsByCodigo(String codigo);
}
