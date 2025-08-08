package com.layla.cafetera;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestCafetera {
    @Test public void descuenta_cafe_por_oz(){
        Cafetera c = new Cafetera(10);
        c.giveCafe(5);
        assertEquals(5, c.getCantidadCafe());
    }
    @Test public void reporta_sin_cafe_cuando_0(){
        Cafetera c = new Cafetera(0);
        assertFalse(c.hasCafe());
    }
}
