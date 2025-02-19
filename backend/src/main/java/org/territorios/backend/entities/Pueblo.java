package org.territorios.backend.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "pueblos")
public class Pueblo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String nombre;

    private int numTerritorios;

    @OneToMany(mappedBy = "pueblo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Territorio> territorios; // TODO: Relación con Territorio


    public Pueblo(){}

    public Pueblo(String nombre, int numTerritorios){
        this.nombre=nombre;
        this.numTerritorios=numTerritorios;
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

    public int getNumTerritorios() {
        return numTerritorios;
    }

    public void setNumTerritorios(int numTerritorios) {
        this.numTerritorios = numTerritorios;
    }

    @Override
    public String toString() {
        return "Pueblo{" +
                "nombre='" + nombre + '\'' +
                ", numTerritorios=" + numTerritorios +
                '}';
    }
}
