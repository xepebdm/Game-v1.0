package br.com.game.estrutura.player;

public enum TipoVocacao {

	GUERREIRO(50, 40, 100, 5, 50, 2), 
	ARQUEIRO(60, 30, 80, 4, 60, 2),
	MAGO(70, 20, 60, 2, 80, 5), 
	SACERDOTE(70, 20, 60, 2, 80, 5),
	ANAO(50, 50, 120, 5, 20, 2), 
	ELFO(60, 40, 100, 6, 50, 3);

	public int ataque;
	public int defesa;
	public int vida;
	public int taxaDeRegeneracaoVida;
	public int mana;
	public int taxaDeRegeneracaoMana;

	TipoVocacao(int ataque, int defesa, int vida, int taxaDeRegeneracaoDeVida, int mana, int taxaDeRegeneracaoDeMana) {
		this.ataque = ataque;
		this.defesa = defesa;
		this.vida = vida;
		this.mana = mana;
		this.taxaDeRegeneracaoVida = taxaDeRegeneracaoDeVida;
		this.taxaDeRegeneracaoMana = taxaDeRegeneracaoDeMana;
	}

	protected int getAtaque() {
		return ataque;
	}

	protected int getDefesa() {
		return defesa;
	}

	protected int getVida() {
		return vida;
	}

	protected int getMana() {
		return mana;
	}
}
