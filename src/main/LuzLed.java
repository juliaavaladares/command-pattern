package main;

public class LuzLed {
    private String cor;
    private boolean luzLigada;

    public LuzLed() {
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public boolean isLuzLigada() {
        return luzLigada;
    }
    public void setLuzLigada(boolean luzLigada) {
        this.luzLigada = luzLigada;
    }

    public void ligarLuzLed(String cor){
        this.cor = cor;
        this.luzLigada = true;
    }

    
}
