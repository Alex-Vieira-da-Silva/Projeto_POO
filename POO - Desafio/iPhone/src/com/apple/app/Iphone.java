package com.apple.app;

import com.apple.model.Aparelho;

public class Iphone {

	public static void main(String[] args) {
		
		Aparelho aparelho = new Aparelho();
		
		aparelho.ligarAparelho();
		aparelho.informacoesAparelho();
	
		String ligar = aparelho.fazerLigacao("(87)98856-9588");
		System.out.println(ligar);
		
		String enviarEmail = aparelho.EnviarEmail("alex@hotmail.com");
		System.out.println(enviarEmail);
		
		
	}
}
