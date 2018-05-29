package br.com.game.estrutura.player;

import br.com.game.estrutura.player.saude.ManaDoPlayer;
import br.com.game.estrutura.player.saude.SaudeDoPlayer;
import br.com.game.estrutura.player.saude.VidaDoPlayer;

public class Vocacao {
	
	private TipoVocacao tipo;
	private Integer ataque;
	private Integer defesa;
	private SaudeDoPlayer vida;
	private SaudeDoPlayer mana;
	private InfoPlayer level;
	private String nome;
	
	public Vocacao(String nome, TipoVocacao tipo){
		this.nome = nome;
		this.tipo = tipo;
		this.level = new LevelDoPlayer();
		this.vida = new VidaDoPlayer(tipo.vida, tipo.vida, tipo.taxaDeRegeneracaoVida);
		this.mana = new ManaDoPlayer(tipo.mana, tipo.mana, tipo.taxaDeRegeneracaoMana);
		this.ataque = tipo.getAtaque();
		this.defesa = tipo.getDefesa();
	}
	
	
	public Integer getAtaque() {
		return ataque;
	}
	
	public Integer getDefesa() {
		return defesa;
	}
	
	public Integer getMaximoVida() {
		return vida.getMaximo();
	}
	
	public Integer getVidaAtual(int dano) {
		return vida.getValorAtual(dano);
	}
	
	public Integer getVidaAtual() {
		return vida.getValorAtual();
	}
	
	public void adicionaExperiencia(int valor) {
		level.adicionaExp(valor);
	}
}
