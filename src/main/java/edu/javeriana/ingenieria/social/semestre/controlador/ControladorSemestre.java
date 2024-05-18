package edu.javeriana.ingenieria.social.semestre.controlador;

import edu.javeriana.ingenieria.social.semestre.dominio.Semestre;
import edu.javeriana.ingenieria.social.semestre.servicio.ServicioSemestre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/semestres")
@CrossOrigin(origins="http://localhost:4200")
public class ControladorSemestre {
    @Autowired
    private ServicioSemestre servicio;

    @GetMapping("listar")
    public List<Semestre> obtenerSemestres(){
        return servicio.obtenerSemestres();
    }

    @GetMapping("obtener")
    public ResponseEntity<Semestre> obtenerSemestre(@RequestParam String codigo){
        if(codigo == null || codigo.isEmpty()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        if(!servicio.semestreExiste(codigo)){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(servicio.obtenerSemestre(codigo), HttpStatus.OK);
    }
}
