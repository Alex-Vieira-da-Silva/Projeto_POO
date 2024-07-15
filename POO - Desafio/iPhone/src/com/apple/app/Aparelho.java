package com.apple.app;

import java.util.Scanner;

import com.apple.model.Iphone;

public class Aparelho {

	public static void main(String[] args) {

		telaInicial();
	}

	public static void telaInicial() {

		System.out.println(
				"---------------------Sejam todos(a) Bem-Vindos ao Mundo Apple, iPhone I !---------------------------");
		System.out.println();
		System.out.println("                      Em homenagem a Steve Jobs 24/02/1955 a 05/10/2011 !");
		System.out.println();
		System.out.println("Para acessar a tela principal do iPhone digite 1, ou para acessar o painel de controle 2!");
		System.out.println(
				"----------------------------------------------------------------------------------------------------");

		Scanner scanner = new Scanner(System.in);

		try {

			Iphone iPhone = new Iphone();

			int opcao = scanner.nextInt();

			if (opcao == 1) {

				iPhone.telaPrincipal();

			} else if (opcao == 2) {

				painelControle();

			} else {
				System.out.println("opção inválida, tente novamente!");
				telaInicial();
			}

		} catch (Exception e) {

			System.out.println("Ocorreu um erro ao acessar as opção, tente novamente!");
			telaInicial();

		} finally {
			scanner.close();
		}

	}

	public static void painelControle() {

		Scanner scanner = new Scanner(System.in);

		try {

			Iphone iPhone = new Iphone();

			apresentacaoPainelControle();
			int alternativa = scanner.nextInt();

			if (alternativa == 1) {

				iPhone.wifi();

				System.out.println("Para voltar ao painel de controle digite 5, ou para voltar a tela inicial 7!");
				alternativa = scanner.nextInt();

				if (alternativa == 5) {

					painelControle();

				} else if (alternativa == 7) {

					telaInicial();

				} else {

					System.out.println("opção inválida, voltando ao painel de controle!");
					painelControle();
				}

			} else if (alternativa == 2) {

				iPhone.bluetooth();
				System.out.println("Para voltar ao painel de controle digite 5, ou para voltar a tela inicial 7!");
				alternativa = scanner.nextInt();

				if (alternativa == 5) {

					painelControle();

				} else if (alternativa == 7) {

					telaInicial();

				} else {

					System.out.println("opção inválida, voltando ao painel de controle!");
					painelControle();
				}

			} else if (alternativa == 3) {

				iPhone.dadosMovel();

				System.out.println("Para voltar ao painel de controle digite 5, ou para voltar a tela inicial 7!");
				alternativa = scanner.nextInt();

				if (alternativa == 5) {

					painelControle();

				} else if (alternativa == 7) {

					telaInicial();

				} else {

					System.out.println("opção inválida, voltando ao painel de controle!");
					painelControle();
				}

			} else if (alternativa == 4) {

				iPhone.nivelBateria();
				System.out.println("Para voltar ao painel de controle digite 5, ou para voltar a tela inicial 7!");
				alternativa = scanner.nextInt();

				if (alternativa == 5) {

					painelControle();

				} else if (alternativa == 7) {

					telaInicial();

				} else {

					System.out.println("opção inválida, voltando ao painel de controle!");
					painelControle();
				}
			} else if (alternativa == 7) {

				telaInicial();
			} else {

				System.out.println("opção inválida, voltando ao painel de controle!");
				painelControle();

			}

		} catch (Exception e) {

			System.out.println("opção inválida, voltando ao painel de controle!");
			painelControle();

		} finally {
			scanner.close();
		}

	}

	private static void apresentacaoPainelControle() {

		System.out.println(
				"----------------------------------Painel de Controle--------------------------------------------------------------------");
		System.out.println(
				"Para acessar o Wifi digite 1, para Bluetooth 2, para Dados Movel 3, e para Bateria 4, e para voltar a tela inicial 7!");
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------");

	}
}
