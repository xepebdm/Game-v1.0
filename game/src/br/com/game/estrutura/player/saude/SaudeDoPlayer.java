package br.com.game.estrutura.player.saude;

import br.com.game.estrutura.player.InfoPlayer;

public abstract class SaudeDoPlayer implements InfoPlayer {

	private int maximo;
	private int valorAtual;
	private int taxaDeRegeneracao;

	public SaudeDoPlayer(int maximo, int valorAtual, int taxaDeRegeneracao) {
		this.maximo = maximo;
		this.valorAtual = valorAtual;
		this.taxaDeRegeneracao = taxaDeRegeneracao;
	}

	public void regenera() {
		valorAtual += taxaDeRegeneracao;
		limite();
	}

	public void regenera(int valor) {
		if (valorAtual < maximo) {
			valorAtual += valor;
		}
		limite();
	}

	public void aumentaValor(int valor) {
		maximo += valor;
	}

	private void limite() {
		if (valorAtual > maximo) {
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

	public String infoTotal() {
		return Integer.toString(maximo);
	}

	public String infoAtual() {
		return Integer.toString(valorAtual);
	}

	@Deprecated
	@Override
	public void adicionaExp(int valor) {

	}

	@Deprecated
	@Override
	public String getLevel() {
		return null;
	}

}
