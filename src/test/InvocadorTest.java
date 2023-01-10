package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import main.*;

public class InvocadorTest {
    @Test
    public void deveLigarTV() {
        Invocador invocador = new Invocador();
        TV tv = new TV();
        Comando ligarTV = new LigarTV(tv, "SporTV");
        
        invocador.executarComando(ligarTV);

        assertEquals("SporTV", tv.getCanal());
        assertTrue(tv.isTvLigada());
    }
    
    @Test
    public void deveLigarLuzLed() {
        Invocador invocador = new Invocador();
        LuzLed luzLed = new LuzLed();
        Comando ligarLuzLed = new LigarLuzLed(luzLed, "Vermelho");
        
        invocador.executarComando(ligarLuzLed);

        assertEquals("Vermelho", luzLed.getCor());
        assertTrue(luzLed.isLuzLigada());
    }
    
    @Test
    public void deveLigarArCondicionado() {
        Invocador invocador = new Invocador();
        ArCondicionado arCondicionado = new ArCondicionado();
        Comando ligarArCondicionado = new LigarArCondicionado(arCondicionado, "23");
        
        invocador.executarComando(ligarArCondicionado);

        assertEquals("23", arCondicionado.getTemperatura());
        assertTrue(arCondicionado.isArLigado());
    }
}
