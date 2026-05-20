package com.distribuida.model;

import org.hibernate.engine.jdbc.batch.spi.BatchObserver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClienteTest {

    private Cliente cliente;

    @BeforeEach
    public void setUp(){

        cliente = new Cliente(

                1
                ,"1500970270"
                ,"Bob"
                ,"Esponja"
                ,"Fondo de bikini"
                ,"0976377382"
                ,"bhjdh@jjkj.com"
        );
    }

    @Test
    public void testClienteConstructorAndGetters(){
        assertAll ("Pruebas unitarias constructor Cliente",

                () -> assertEquals(1, cliente.getIdCliente()),
                () -> assertEquals("1500970270", cliente.getCedula()),
                () -> assertEquals("Bob", cliente.getNombre()),
                () -> assertEquals("Esponja", cliente.getApellido()),
                () -> assertEquals("Fondo de bikini", cliente.getDireccion()),
                () -> assertEquals("0976377382", cliente.getTelefono()),
                () -> assertEquals("bhjdh@jjkj.com", cliente.getCorreo())
                );
        System.out.println(cliente.toString());
    }

    @Test
    public void testClienteSetters(){
        cliente.setIdCliente(2);
        cliente.setCedula("1500970272");
        cliente.setNombre("Bob2");
        cliente.setApellido("Esponja2");
        cliente.setDireccion("Fondo de bikini2");
        cliente.setCorreo("ajahajah@jkjksja.com");
        cliente.setTelefono("0982512184");

        assertAll("Validar datos del cliente con setters",
                () -> assertEquals(2, cliente.getIdCliente()),
                () -> assertEquals("1500970272", cliente.getCedula()),
                () -> assertEquals("Bob2", cliente.getNombre()),
                () -> assertEquals("Esponja2", cliente.getApellido()),
                () -> assertEquals("Fondo de bikini2", cliente.getDireccion()),
                () -> assertEquals("0982512184", cliente.getTelefono()),
                () -> assertEquals("ajahajah@jkjksja.com", cliente.getCorreo())
        );
    }

    @Test
    public void testClienteToString (){
        String str = cliente.toString();
        assertAll("Validacion de datos To String",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("1500970270")),
                () -> assertTrue(str.contains("Bob")),
                () -> assertTrue(str.contains("Esponja")),
                () -> assertTrue(str.contains("Fondo de bikini")),
                () -> assertTrue(str.contains("0976377382")),
                () -> assertTrue(str.contains("bhjdh@jjkj.com"))
        );
    }

}
