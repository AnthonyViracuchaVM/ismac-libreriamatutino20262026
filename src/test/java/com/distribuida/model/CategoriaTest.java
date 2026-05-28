package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CategoriaTest {
    private Categoria categoria;

    @BeforeEach
    public void setUp(){

        categoria = new Categoria(

                1
                ,"Drama"
                ,"Libro de pasta dura, 150 paginas"
        );

    }

    @Test
    public void testCategoriaConstructorAndGetters(){
        assertAll("Pruebas Unitarias de constructor and getters",
                () -> assertEquals(1, categoria.getIdCategoria()),
                () -> assertEquals("Drama", categoria.getNombreCateg()),
                () -> assertEquals("Libro de pasta dura, 150 paginas", categoria.getDescripcion())
                );
        System.out.println(categoria.toString());
    }

    @Test
    public void testCategoriaSetters(){
        categoria.setIdCategoria(2);
        categoria.setNombreCateg("Romance");
        categoria.setDescripcion("Pasta suave, 100 paginas");


        assertAll("Validar datos con setters ",
                () -> assertEquals(2, categoria.getIdCategoria()),
                () -> assertEquals("Romance", categoria.getNombreCateg()),
                () -> assertEquals("Pasta suave, 100 paginas", categoria.getDescripcion())
                );

    }


    @Test
    public void testCategoriaToString(){
        String str = categoria.toString();
        assertAll("Validacion de Datos to String",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("Drama")),
                () -> assertTrue(str.contains("Libro de pasta dura, 150 paginas"))
                );

    }
}
