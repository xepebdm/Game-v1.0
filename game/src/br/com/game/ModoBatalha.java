package br.com.game;

import br.com.game.criaturas.Monstro;
import br.com.game.estrutura.player.Vocacao;

public class ModoBatalha {

	private Vocacao player;
	private Monstro monstro;
	private boolean monstroVivo;
	private boolean playerVivo;

	public ModoBatalha(Vocacao player, Monstro monstro) {
		this.player = player;
		this.monstro = monstro;
	}
	
	public void ataque() {
		int ataqueDoPlayer = player.getAtaque() - monstro.getDefesa();
		System.out.println(player.getNome() + " atacou e causou " + ataqueDoPlayer);
		
		if (monstro.reduzirVida(ataqueDoPlayer) > 0)
			monstroVivo = true;
		
		if(!monstroVivo)
			playerGanhou();
	}
	
	private void playerGanhou() {
		player.adicionaExperiencia(monstro.getExperiencia());
		System.out.println(player.getNome() + " ganhou a batalha!");
	}

	public void defesa() {
		int ataqueDoMonstro = monstro.getAtaque() - player.getDefesa();
		System.out.println( monstro.getNome() + " atacou e causou " + ataqueDoMonstro);
		
		if(player.getVidaAtual(ataqueDoMonstro) > 0)
			playerVivo = true;
		
		if(!playerVivo)
			playerMorreu();
	}

	private void playerMorreu() {
		System.out.println(player.getNome() + " morreu!");
	}
	
	
}
