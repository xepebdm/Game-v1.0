package br.com.game;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.game.criaturas.ListaDeMonstros;
import br.com.game.criaturas.Monstro;
import br.com.game.estrutura.player.TipoVocacao;
import br.com.game.estrutura.player.Vocacao;

class ModoBatalhaTest {

//	private Vocacao player;
//	private Monstro monstro;
//	
//	@Before
//	void antes() {
//		player = new Vocacao("Alex",TipoVocacao.GUERREIRO);
//		monstro = new Monstro(ListaDeMonstros.TROLL);
//	}
	
	@Test
	void testAtaqueDoPlayerSemVitoria() {
		Vocacao player = new Vocacao("Alex",TipoVocacao.GUERREIRO);
		Monstro monstro = new Monstro(ListaDeMonstros.TROLL);
		ModoBatalha modo = new ModoBatalha(player, monstro);
		
		modo.ataque();
		assertEquals(70, monstro.getLife());
		
	}
	
	@Test
	void testDefesaDoPlayerSemDerrota() {
		Vocacao player = new Vocacao("Alex",TipoVocacao.GUERREIRO);
		Monstro monstro = new Monstro(ListaDeMonstros.DEMON);
		ModoBatalha modo = new ModoBatalha(player, monstro);
		
		modo.defesa();
		assertEquals(50, (int)player.getVidaAtual());
	}

}
