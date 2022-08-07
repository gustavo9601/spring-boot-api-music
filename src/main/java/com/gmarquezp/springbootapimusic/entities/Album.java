package com.gmarquezp.springbootapimusic.entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "albums")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date lanzado;
    private Double precio;
    private String genero;

    @OneToOne // un album tiene un detalle
    @JoinColumn(name = "detalle_id") // llave foranea en esta tabla para relacionar las tablas
    private Detalle detalle;


    // mappedBy = "album" // nombre del atributo en la clase que se relaciona
    @Transient
    @OneToMany(mappedBy = "album", fetch = FetchType.EAGER) // un album tiene muchos horarios
    private List<Horario> horarios;

    public Album() {
    }

    public Album(Long id, String titulo, Date lanzado, Double precio, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.lanzado = lanzado;
        this.precio = precio;
        this.genero = genero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getLanzado() {
        return lanzado;
    }

    public void setLanzado(Date lanzado) {
        this.lanzado = lanzado;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Detalle getDetalle() {
        return detalle;
    }

    public void setDetalle(Detalle detalle) {
        this.detalle = detalle;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", lanzado=" + lanzado +
                ", precio=" + precio +
                ", genero='" + genero + '\'' +
                ", detalle='" + this.detalle + '\'' +
                '}';
    }
}
