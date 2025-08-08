package com.layla.cafetera;

public class Vaso {
    private int cantidadVasos;
    private int contenidoOz;
    public Vaso(int contenidoOz, int cantidadVasos){
        this.contenidoOz = contenidoOz;
        this.cantidadVasos = cantidadVasos;
    }
    public boolean hasVasos(int cant){ return cantidadVasos >= cant; }
    public void giveVasos(int cant){ this.cantidadVasos -= cant; }
    public int getCantidadVasos(){ return cantidadVasos; }
    public int getContenido(){ return contenidoOz; }
}
