package main;

public class TV {
    private String canal;
    private boolean tvLigada;

    public TV() {
    }

    public void ligarTV(String canal){
        this.canal = canal;
        this.tvLigada = true;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public boolean isTvLigada() {
        return tvLigada;
    }

    public void setTvLigada(boolean tvLigada) {
        this.tvLigada = tvLigada;
    }
}
