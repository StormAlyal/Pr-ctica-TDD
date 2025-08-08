package com.layla.cafetera;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestAzucarero {
    @Test public void tiene_azucar_suficiente(){
        Azucarero a = new Azucarero(5);
        assertTrue(a.hasAzucar(3));
    }
    @Test public void descuenta_azucar(){
        Azucarero a = new Azucarero(5);
        a.giveAzucar(2);
        assertEquals(3, a.getCantidadAzucar());
    }
}
