package br.com.game.estrutura.player;

public class LevelDoPlayer implements InfoPlayer{
	
	private int level;
	private int maximo;
	private int valorAtual;

	public LevelDoPlayer() {
		this.level = 0;
		this.maximo = 100;
		this.valorAtual = 0;
	}

	@Override
	public void adicionaExp(int valor) {
		this.valorAtual += valor;
		while(valorAtual >= maximo) {
			level++;
			valorAtual -= maximo;
			maximo *= 2;
		}
	}	
	
	@Override
	public String infoTotal() {
		return Integer.toString(maximo);
	}

	@Override
	public String infoAtual() {
		return Integer.toString(valorAtual);
	}

	@Override
	public String getLevel() {
		return Integer.toString(level);
	}
	
	

}
