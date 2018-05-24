package br.com.game.estrutura.player.saude;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class VidaDoPlayerTest {
	
		
	@Test
	void deveRegenerarVidaEm2PorRound() {
		SaudeDoPlayer vida = new VidaDoPlayer(200, 50, 2);
		
		vida.regenera();
		assertEquals(52, vida.getValorAtual());
	}
	
	@Test
	void deveRegenerarVidaComValorDentroDoMetodoRegenera() {
		SaudeDoPlayer vida = new VidaDoPlayer(200, 50, 2);
		
		vida.regenera(10);
		assertEquals(60, vida.getValorAtual());
	}
	
	@Test
	void deveRegenerarVidaAteOLimite() {
		SaudeDoPlayer vida = new VidaDoPlayer(200, 50, 2);
		
		vida.regenera(5000);
		assertEquals(200, vida.getValorAtual());
	}
	
	@Test
	void aumentarOValorMaximoERegenerarAteONovoLimite() {
		SaudeDoPlayer vida = new VidaDoPlayer(200, 50, 2);
		
		vida.aumentaValor(200);
		assertEquals(400, vida.getMaximo());
		
		vida.regenera(700);
		assertEquals(400, vida.getValorAtual());
	}

}
