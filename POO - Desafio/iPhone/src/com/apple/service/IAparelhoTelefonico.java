package com.apple.service;

public interface IAparelhoTelefonico {

	public String fazerLigacao(String numero);
	public void receberLigacao();
	public void iniciarCorreioVoz();
	public void encerrarLigacao();
	public void vivaVoz();
	public void listarChamadaEsperar();
	public void wifi();
	public void bluetooth();
	public void dadosMovel();

}
