package main;

public class ArCondicionado {
    private String temperatura;
    private boolean arLigado;

    public ArCondicionado() {
    }
    
    public String getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }
    public boolean isArLigado() {
        return arLigado;
    }
    public void setArLigado(boolean arLigado) {
        this.arLigado = arLigado;
    }

    public void ligarArCondicionado(String temperatura){
        this.temperatura = temperatura;
        this.arLigado = true;

    }
}
