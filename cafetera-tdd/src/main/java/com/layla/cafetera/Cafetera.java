package com.layla.cafetera;

public class Cafetera {
    private int cantidadCafe;
    public Cafetera(int cantidadCafe){ this.cantidadCafe = cantidadCafe; }
    public boolean hasCafe(){ return cantidadCafe > 0; }
    public void giveCafe(int oz){ this.cantidadCafe -= oz; }
    public int getCantidadCafe(){ return cantidadCafe; }
}
