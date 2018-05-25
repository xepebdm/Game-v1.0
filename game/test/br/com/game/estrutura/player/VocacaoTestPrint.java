package br.com.game.estrutura.player;

public class VocacaoTestPrint {

	public static void main(String[] args) {
		Vocacao vocacao = new Vocacao("Alex",TipoVocacao.ANAO);
		
		System.out.println(vocacao.getAtaque());
	}

}
