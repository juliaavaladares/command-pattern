package main;

import java.util.ArrayList;

public class Invocador {
    private ArrayList<Comando> comandos = new ArrayList<Comando>();
	
    public void executarComando(Comando comando) {
        this.comandos.add(comando);
        comando.executar();
    }

    
	
}
