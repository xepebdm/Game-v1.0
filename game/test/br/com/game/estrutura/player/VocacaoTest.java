package br.com.game.estrutura.player;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class VocacaoTest {

	@Test
	void testDeValoresIniciais() {
		Vocacao vocacao = new Vocacao("Alex", TipoVocacao.ANAO);
		assertEquals(50, (int)vocacao.getAtaque());
		assertEquals(50, (int)vocacao.getDefesa());
		
	}

}
