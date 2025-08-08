package com.layla.cafetera;

public class MaquinaDeCafe {
    private Cafetera cafetera;
    private Vaso vasosPequeno, vasosMediano, vasosGrande;
    private Azucarero azucarero;

    public void setCafetera(Cafetera c){ this.cafetera=c; }
    public void setVasosPequeno(Vaso v){ this.vasosPequeno=v; }
    public void setVasosMediano(Vaso v){ this.vasosMediano=v; }
    public void setVasosGrande(Vaso v){ this.vasosGrande=v; }
    public void setAzucarero(Azucarero a){ this.azucarero=a; }

    public Vaso getTipoDeVaso(String tipo){
        if(tipo==null) return null;
        switch(tipo.toLowerCase()){
            case "pequeno": return vasosPequeno;
            case "mediano": return vasosMediano;
            case "grande":  return vasosGrande;
            default: return null;
        }
    }

    public String getVasoDeCafe(Vaso vaso, int cucharadas, int cantidadVasos){
        if(vaso==null || !vaso.hasVasos(cantidadVasos)) return "No hay Vasos";
        int oz = vaso.getContenido();
        if(cafetera==null || cafetera.getCantidadCafe()<oz) return "No hay Cafe";
        if(azucarero==null || !azucarero.hasAzucar(cucharadas)) return "No hay Azucar";

        cafetera.giveCafe(oz);
        vaso.giveVasos(cantidadVasos);
        azucarero.giveAzucar(cucharadas);
        return "Felicitaciones";
    }

    public Cafetera getCafetera(){ return cafetera; }
    public Azucarero getAzucarero(){ return azucarero; }
    public Vaso getVasosPequeno(){ return vasosPequeno; }
    public Vaso getVasosMediano(){ return vasosMediano; }
    public Vaso getVasosGrande(){ return vasosGrande; }
}
