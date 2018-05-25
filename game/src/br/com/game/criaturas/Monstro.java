package br.com.game.criaturas;

public class Monstro {

	private ListaDeMonstros nome;
	private int life;
	private int mana;
	private int ataque;
	private int defesa;
	private int experiencia;

	public Monstro(ListaDeMonstros nome) {
		this.nome = nome;
		this.life = nome.getLife();
		this.mana = nome.getMana();
		this.ataque = nome.getAtaque();
		this.defesa = nome.getDefesa();
		this.experiencia = nome.getExperiencia();
	}

	public int getLife() {
		return life;
	}

	public int getMana() {
		return mana;
	}

	public int getAtaque() {
		return ataque;
	}

	public int getDefesa() {
		return defesa;
	}

	public int reduzirVida(int ataqueDoPlayer) {
		this.life -= ataqueDoPlayer;
		return this.life;
	}

	public int getExperiencia() {
		return experiencia;
	}

}
