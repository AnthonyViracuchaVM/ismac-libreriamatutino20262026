package com.distribuida.model;


import jakarta.persistence.*;

import static java.awt.font.TransformAttribute.IDENTITY;

@Entity
@Table (name = "Autor")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdAutor")
    private int IdAutor;
    @Column(name = "nombreAutor")
    private String nombreAutor;
    @Column(name = "apellidoAutor")
    private String apellidoAutor;
    @Column(name = "nacionalidadAutor")
    private String nacionalidadAutor;

    public Autor() {
    }

    public Autor(int idAutor, String nombreAutor, String apellidoAutor, String nacionalidadAutor) {
        this.IdAutor = idAutor;
        this.nombreAutor = nombreAutor;
        this.apellidoAutor = apellidoAutor;
        this.nacionalidadAutor = nacionalidadAutor;
    }




    //Metodos Getters and Setters

    public int getIdAutor () {
        return IdAutor;
    }

    public void setIdAutor (int IdAutor) {
        this.IdAutor = IdAutor;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getApellidoAutor() {
        return apellidoAutor;
    }

    public void setApellidoAutor(String apellidoAutor) {
        this.apellidoAutor = apellidoAutor;
    }

    public String getNacionalidadAutor() {
        return nacionalidadAutor;
    }

    public void setNacionalidadAutor(String nacionalidadAutor) {
        this.nacionalidadAutor = nacionalidadAutor;
    }


    @Override
    public String toString() {
        return "Autor{" +
                "IdAutor=" + IdAutor +
                ", nombreAutor='" + nombreAutor + '\'' +
                ", apellidoAutor='" + apellidoAutor + '\'' +
                ", nacionalidadAutor='" + nacionalidadAutor + '\'' +
                '}';
    }




}


