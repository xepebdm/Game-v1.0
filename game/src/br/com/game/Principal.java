package br.com.game;

import br.com.game.estrutura.player.TipoVocacao;
import br.com.game.estrutura.player.Vocacao;

public class Principal {

	private String nome;
	private String vocacaoString;
	private TipoVocacao tipoVocacao;
	private Vocacao player;

	public Principal(String name, String vocacaoString) {
		this.nome = name;
		this.vocacaoString = vocacaoString;
		criarPlayer();
	}

	public void criarPlayer() {
		switch(vocacaoString) {
		case "Guerreiro":
			tipoVocacao = TipoVocacao.GUERREIRO;
			break;
			
		case "Arqueiro":
			tipoVocacao = TipoVocacao.ARQUEIRO;
			break;
			
		case "Mago":
			tipoVocacao = TipoVocacao.MAGO;
			break;
			
		case "Sacerdote":
			tipoVocacao = TipoVocacao.SACERDOTE;
			break;
			
		case "Anão":
			tipoVocacao = TipoVocacao.ANAO;
			break;
			
		case "Elfo":
			tipoVocacao = TipoVocacao.ELFO;
			break;
			
		default:
			System.out.println("Erro");
			
		}
		
	
		player = new Vocacao(nome, tipoVocacao);
		
		
	}
}
