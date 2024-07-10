package com.apple.app;

import java.util.Scanner;

import com.apple.model.Iphone;

public class Aparelho {

	public static void main(String[] args) {

		TelaInicial();
	}

	public static void TelaInicial() {

		Iphone iPhone = new Iphone();

		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("Para acessar a tela principal do iPhone digite 1, ou para outras opções digite 2!");
		System.out.println("---------------------------------------------------------------------------------");

		Scanner scanner = new Scanner(System.in);

		try {

			int opcao = scanner.nextInt();

			if (opcao == 1) {

				iPhone.home();

			} else if (opcao == 2) {
				
				iPhone.nivelBateria();
				iPhone.carregar();
				System.out.println("Para voltar a opção anterior digite 0!");
				int alternativa = scanner.nextInt();
				
				if (alternativa == 0)
					TelaInicial();
				
			} else {
				System.out.println("opção inválida!");
			}

		} catch (Exception e) {
			
			System.out.println("Ocorreu um erro ao acessar as opção, tente novamente!");
			TelaInicial();
			
		} finally {
			scanner.close();
		}

	}
}
