package com.apple.app;

import java.util.Scanner;

import com.apple.model.Iphone;

public class Aparelho {

	public static void main(String[] args) {

		TelaInicial();
	}

	public static void TelaInicial() {
		
		System.out.println("---------------------Sejam todos(a) Bem-Vindos ao Mundo Apple, iPhone I !---------------------------");
		System.out.println();
		System.out.println("Para acessar a tela principal do iPhone digite 1, ou para acessar o painel de controle digite 2!");
		System.out.println("---------------------------------------------------------------------------------------------------");

		Scanner scanner = new Scanner(System.in);
		
		try {

			Iphone iPhone = new Iphone();
		
			int opcao = scanner.nextInt();
			
			if (opcao == 1) {
				
				iPhone.TelaPrincipal();

			} else if (opcao == 2) {

				painelControle();

			} else {
				System.out.println("opção inválida, tente novamente!");
				TelaInicial();
			}

		} catch (Exception e) {

			System.out.println("Ocorreu um erro ao acessar as opção, tente novamente!");
			TelaInicial();

		} finally {
			scanner.close();
		}

	}

	public static void painelControle() {
		
		Scanner scanner = new Scanner(System.in);

		try {

			Iphone iPhone = new Iphone();

			apresentacaoPainellControle();
			int alternativa = scanner.nextInt();

			if (alternativa == 1) {

				iPhone.wifi();

				System.out.println("Para sair digite 7!");
				alternativa = scanner.nextInt();

				if (alternativa == 7)
					TelaInicial();

			} else if (alternativa == 2) {

				iPhone.bluetooth();
				System.out.println("Para sair digite 7!");
				alternativa = scanner.nextInt();

				if (alternativa == 7)
					TelaInicial();

			} else if (alternativa == 3) {

				iPhone.dadosMovel();

				System.out.println("Para sair digite 7!");
				alternativa = scanner.nextInt();

				if (alternativa == 7)
					TelaInicial();

			} else if (alternativa == 4) {

				iPhone.nivelBateria();
				System.out.println("Para sair digite 7!");
				alternativa = scanner.nextInt();

				if (alternativa == 7)
					TelaInicial();
			}

		} catch (Exception e) {

			System.out.println("Opção inválida, tente novamente!");
			TelaInicial();

		} finally {
			scanner.close();
		}

	}

	private static void apresentacaoPainellControle() {

		System.out
				.println("----------------------------------Painel de Controle--------------------------------------");
		System.out.println("Digite 1 par acessar o Wifi, 2 para Bluetooth, 3 para Dados Movel e 4 para Bateria !");
		System.out
				.println("------------------------------------------------------------------------------------------");

	}
}
