package com.layla.cafetera;

public class Azucarero {
    private int cantidadDeAzucar;
    public Azucarero(int cant){ this.cantidadDeAzucar = cant; }
    public boolean hasAzucar(int cucharadas){ return cantidadDeAzucar >= cucharadas; }
    public void giveAzucar(int cucharadas){ this.cantidadDeAzucar -= cucharadas; }
    public int getCantidadAzucar(){ return cantidadDeAzucar; }
}
