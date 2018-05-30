package br.com.game.criaturas;

public enum ListaDeMonstros {

	TROLL("Troll", 100, 50, 20, 20, 10),
	ORC("Orc", 150, 70, 25, 25, 15), 
	DEMON("Demon", 500, 300, 90, 100, 50), 
	ANT("Ant", 50, 10, 5, 5, 5),
	TARANTULA("Tarantula", 300, 200, 40, 50, 30),
	VALAKAS("Valakas", 1000, 1000, 200, 150, 100);

	private int life;
	private int mana;
	private int ataque;
	private int defesa;
	private int experiencia;
	private String nome;

	ListaDeMonstros(String nome,int life, int mana, int ataque, int defesa, int experiencia) {
		this.nome = nome;
		this.life = life;
		this.mana = mana;
		this.ataque = ataque;
		this.defesa = defesa;
		this.experiencia = experiencia;
	}

	
	protected int getLife() {
		return life;
	}

	protected int getMana() {
		return mana;
	}

	protected int getAtaque() {
		return ataque;
	}

	protected int getDefesa() {
		return defesa;
	}

	public int getExperiencia() {
		return experiencia;
	}


	public String getNome() {
		return nome;
	}
}
