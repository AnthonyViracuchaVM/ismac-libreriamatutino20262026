package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {

    private Autor autor;

    @BeforeEach
    public void setUp(){

        autor = new Autor(

                1
                ,"Juan"
                ,"Ballesteros"
                ,"Ecuatoriana"

        );
    }

    @Test
    public void testAutorConstructorandGetters(){
        assertAll ("Pruebas unitarias constructor cliente ",
                () -> assertEquals(1, autor.getIdAutor()),
                () -> assertEquals("Juan", autor.getNombreAutor()),
                () -> assertEquals("Ballesteros", autor.getApellidoAutor()),
                () -> assertEquals("Ecuatoriana", autor.getNacionalidadAutor())
                );

        System.out.println(autor.toString());

    }

    @Test
    public void testAutorSetters(){
        autor.setIdAutor(1);
        autor.setNombreAutor("Benito");
        autor.setApellidoAutor("Camelo");
        autor.setNacionalidadAutor("Francesa");


        assertAll("Pruebas unitarias con setters",
                () -> assertEquals(2, autor.getIdAutor()),
                () -> assertEquals("Benito", autor.getNombreAutor()),
                () -> assertEquals("Camelo", autor.getApellidoAutor()),
                () -> assertEquals("Francesa", autor.getNacionalidadAutor())
        );
    }


    @Test
    public void testAutoToString(){
        String str = autor.toString();
        assertAll("Validacion de datos to String",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("Juan")),
                () -> assertTrue(str.contains("Ballesteros")),
                () -> assertTrue(str.contains("Ecuatorina"))
        );


    }

}
