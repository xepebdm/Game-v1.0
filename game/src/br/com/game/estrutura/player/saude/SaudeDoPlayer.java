package br.com.game.estrutura.player.saude;

public interface SaudeDoPlayer {
	
		
	void regenera();
	void regenera(int valor);
	void aumentaValor(int valor);
	
	int getMaximo();
	int getValorAtual();
	int getTaxaDeRegeneracao();
}
