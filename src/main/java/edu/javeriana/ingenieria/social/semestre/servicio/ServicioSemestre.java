package edu.javeriana.ingenieria.social.semestre.servicio;

import edu.javeriana.ingenieria.social.semestre.dominio.Semestre;
import edu.javeriana.ingenieria.social.semestre.repositorio.RepositorioSemestre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioSemestre {
    @Autowired
    private RepositorioSemestre repositorio;

    public List<Semestre> obtenerSemestres(){
        return repositorio.findAll();
    }

    public Semestre obtenerSemestre(String codigo){
        return repositorio.findOneByCodigo(codigo);
    }

    public boolean semestreExiste(String codigo){
        return repositorio.existsByCodigo(codigo);
    }
}
