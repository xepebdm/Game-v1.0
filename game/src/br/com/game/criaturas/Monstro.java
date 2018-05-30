package br.com.game.criaturas;

public class Monstro {

	private String nome;
	private int life;
	private int mana;
	private int ataque;
	private int defesa;
	private int experiencia;

	public Monstro(ListaDeMonstros nome) {
		this.nome = nome.getNome();
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
		life -= ataqueDoPlayer;
		return life;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public String getNome() {
		return nome;
	}

}
