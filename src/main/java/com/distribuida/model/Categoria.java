package com.distribuida.model;


import jakarta.persistence.*;

@Entity
@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCategoria")
    private int IdCategoria;
    @Column(name = "nombreCateg")
    private String nombreCateg;
    @Column(name = "descripcion")
    private String descripcion;


    public Categoria() {
    }

    public Categoria(int idCategoria, String nombreCateg, String descripcion) {
        IdCategoria = idCategoria;
        this.nombreCateg = nombreCateg;
        this.descripcion = descripcion;
    }

    public int getIdCategoria() {
        return IdCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        IdCategoria = idCategoria;
    }

    public String getNombreCateg() {
        return nombreCateg;
    }

    public void setNombreCateg(String nombreCateg) {
        this.nombreCateg = nombreCateg;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "IdCategoria=" + IdCategoria +
                ", nombreCateg='" + nombreCateg + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
