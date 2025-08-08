package com.layla.cafetera;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestVaso {
    @Test public void tiene_vasos_suficientes(){
        Vaso v = new Vaso(5, 2);
        assertTrue(v.hasVasos(1));
    }
    @Test public void descuenta_vasos(){
        Vaso v = new Vaso(5, 2);
        v.giveVasos(1);
        assertEquals(1, v.getCantidadVasos());
    }
}
