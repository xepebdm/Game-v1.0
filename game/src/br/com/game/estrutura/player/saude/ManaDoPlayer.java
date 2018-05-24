package br.com.game.estrutura.player.saude;

import br.com.game.estrutura.player.InfoPlayer;

public class ManaDoPlayer implements SaudeDoPlayer, InfoPlayer {
	
	private int maximo;
	private int valorAtual;
	private int taxaDeRegeneracao;
	
	public ManaDoPlayer(int maximo, int valorAtual, int taxaDeRegeneracao) {
		this.maximo = maximo;
		this.valorAtual = valorAtual;
		this.taxaDeRegeneracao = taxaDeRegeneracao;
	}

	@Override
	public void regenera() {
		valorAtual += taxaDeRegeneracao;
		limite();
	}

	@Override
	public void regenera(int valor) {
		if(valorAtual < maximo) {
			valorAtual += valor;
		}
		limite();
	}

	@Override
	public void aumentaValor(int valor) {
		maximo += valor;
	}
	
	private void limite() {
		if(valorAtual > maximo) {
			valorAtual = maximo;
		}
	}
	
	public int getMaximo() {
		return maximo;
	}
	
	public int getValorAtual() {
		limite();
		return valorAtual;
	}
	
	public int getTaxaDeRegeneracao() {
		return taxaDeRegeneracao;
	}

	@Override
	public String infoTotal() {
		return Integer.toString(maximo);
	}

	@Override
	public String infoAtual() {
		return Integer.toString(valorAtual);
	}

	@Deprecated
	@Override
	public void adicionaExp(int valor) {}

	@Deprecated
	@Override
	public String getLevel() {
		return null;
	}
}
