package main;

public class LigarLuzLed implements Comando {
    
    private LuzLed luzLed;
	private String cor;
	
	public LigarLuzLed(LuzLed luzLed, String cor) {
		this.luzLed = luzLed;
		this.cor = cor;
	}
	
	public void executar() {
		this.luzLed.ligarLuzLed(this.cor);
	}
}
