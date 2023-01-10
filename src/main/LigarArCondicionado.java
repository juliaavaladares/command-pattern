package main;

public class LigarArCondicionado implements Comando { 

	private ArCondicionado arCondicionado;
	private String temperatura;
	
	public LigarArCondicionado(ArCondicionado arCondicionado, String temperatura) {
		this.arCondicionado = arCondicionado;
		this.temperatura = temperatura;
	}
	
	public void executar() {
		this.arCondicionado.ligarArCondicionado(this.temperatura);
	}

}
