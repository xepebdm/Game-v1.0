package br.com.game.estrutura.player;

public class VocacaoTestPrint {

	public static void main(String[] args) {
		Vocacao vocacao = new Vocacao(Tipo.ANAO);
		
		System.out.println(vocacao.getAtaque());
	}

}
