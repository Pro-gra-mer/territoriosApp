package org.territorios.backend.entities;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "territorios")
public class Territorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "pueblo_id", nullable = false) // Clave foránea en la BD
    private Pueblo pueblo;

    private String nombre;

    private String imagenUrl;

    private LocalDate fechaEntrega;

    private LocalDate fechaDevolucion;

    public Territorio(){}

    public Territorio(Pueblo pueblo, String nombre, String imagenUrl, LocalDate fechaEntrega, LocalDate fechaDevolucion) {
        this.pueblo=pueblo;
        this.nombre = nombre;
        this.imagenUrl = imagenUrl;
        this.fechaEntrega = fechaEntrega;
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagenUrl;
    }

    public void setImagen(String imagen) {
        this.imagenUrl = imagen;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}
