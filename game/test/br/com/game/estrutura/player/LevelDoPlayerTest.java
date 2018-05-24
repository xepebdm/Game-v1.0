package br.com.game.estrutura.player;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LevelDoPlayerTest {

	@Test
	void deveSubirUmLevel() {
		InfoPlayer level = new LevelDoPlayer();
		level.adicionaExp(100);
		
		assertEquals("1", level.getLevel());
	}
	
	@Test
	void deveSubirDoisLeveis() {
		InfoPlayer level = new LevelDoPlayer();
		level.adicionaExp(300);
		
		assertEquals("2", level.getLevel());
	}
	
	@Test
	void deveSubirQuatroLeveis() {
		InfoPlayer level = new LevelDoPlayer();
		level.adicionaExp(1500);
		
		assertEquals("4", level.getLevel());
	}
	
	@Test
	void deveSubirQuatroLeveisESobrarExperiencia() {
		InfoPlayer level = new LevelDoPlayer();
		level.adicionaExp(1700);
		
		assertEquals("4", level.getLevel());
		assertEquals("200", level.infoAtual());
	}

}
