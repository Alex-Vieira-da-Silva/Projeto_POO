package com.apple.service;

public interface IReprodutorMusica {

	public void tocar();
	public void pausar();
	public String selecionarMusica(String musica);
	public String removerMusica(String musica);
}
