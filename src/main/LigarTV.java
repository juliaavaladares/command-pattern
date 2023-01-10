package main;

public class LigarTV implements Comando { 

	private TV tv;
	private String canal;
	
	public LigarTV(TV tv, String canal) {
		this.tv = tv;
		this.canal = canal;
	}
	
	public void executar() {
		this.tv.ligarTV(this.canal);
	}

}
