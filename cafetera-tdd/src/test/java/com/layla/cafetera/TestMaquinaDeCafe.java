package com.layla.cafetera;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestMaquinaDeCafe {

    private MaquinaDeCafe maquina;
    private Vaso vasoPeq;
    private Cafetera cafetera;
    private Azucarero azucarero;

    @Before public void setUp(){
        maquina = new MaquinaDeCafe();
        vasoPeq = new Vaso(5, 3);
        cafetera = new Cafetera(20);
        azucarero = new Azucarero(10);

        maquina.setVasosPequeno(vasoPeq);
        maquina.setCafetera(cafetera);
        maquina.setAzucarero(azucarero);
    }

    @Test public void entrega_felicitaciones_cuando_hay_todo(){
        String r = maquina.getVasoDeCafe(vasoPeq, 2, 1);
        assertEquals("Felicitaciones", r);
    }

    @Test public void mensaje_no_hay_vasos(){
        Vaso sinVasos = new Vaso(5, 0);
        String r = maquina.getVasoDeCafe(sinVasos, 1, 1);
        assertEquals("No hay Vasos", r);
    }

    @Test public void mensaje_no_hay_cafe(){
        maquina.setCafetera(new Cafetera(0));
        String r = maquina.getVasoDeCafe(vasoPeq, 1, 1);
        assertEquals("No hay Cafe", r);
    }

    @Test public void mensaje_no_hay_azucar(){
        maquina.setAzucarero(new Azucarero(0));
        String r = maquina.getVasoDeCafe(vasoPeq, 1, 1);
        assertEquals("No hay Azucar", r);
    }
}
