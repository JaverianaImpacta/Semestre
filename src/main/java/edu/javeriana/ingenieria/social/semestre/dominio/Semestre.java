package edu.javeriana.ingenieria.social.semestre.dominio;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Entity
@Getter
@Setter
public class Semestre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String codigo;
    private Integer año, periodo;
    @Column(name="fecha_inicio")
    private Date fechaInicio;
    @Column(name="fecha_final")
    private Date fechaFinal;
}
