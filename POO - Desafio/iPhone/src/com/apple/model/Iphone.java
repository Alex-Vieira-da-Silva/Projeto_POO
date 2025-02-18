package com.apple.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import com.apple.app.Aparelho;
import com.apple.service.IAparelhoTelefonico;
import com.apple.service.IBateria;
import com.apple.service.ICalendario;
import com.apple.service.ICamera;
import com.apple.service.IEmail;
import com.apple.service.INavegaInternet;
import com.apple.service.IReprodutorFoto;
import com.apple.service.IReprodutorMusica;
import com.apple.service.IReprodutorVideo;
import com.apple.service.ISms;
import com.apple.service.IVolume;

public class Iphone implements IReprodutorMusica, IReprodutorFoto, IReprodutorVideo, INavegaInternet, ISms, IEmail,
		IAparelhoTelefonico, IBateria, IVolume, ICamera, ICalendario {

	private boolean validacaoLigarIphone = false;
	private boolean validacaoDesligarIphone = false;
	private boolean validacaoAplicativos = false;
	private boolean validacaoFuncionalidade = false;
	private int selecionadarOpcao = 0;

	public void telaPrincipal() {

		System.out.println("---------------------Tela Principal--------------------------------");
		System.out.println("Digite 1 para fazer ou receber ligação!");
		System.out.println("Digite 2 para enviar ou receber sms!");
		System.out.println("Digite 3 para enviar ou receber e-mail!");
		System.out.println("Digite 4 para acessar os aplicativos!");
		System.out.println("Digite 5 para acessar as configurações do iPhone!");
		System.out.println("Digite 6 para desligar o iPhone!");
		System.out.println("Digite 7 para ligar o iPhone!");
		System.out.println("Digite 8 para acessar a tela inicial!");
		System.out.println("--------------------------------------------------------------------");

		funcionalidades();

	}

	private void funcionalidades() {

		Scanner scanner = new Scanner(System.in);
		int alternativa;
		int opcao = scanner.nextInt();

		try {

			if (opcao == 1) {

				System.out.println("Para ligar digite 1, e para receber 2!");
				alternativa = scanner.nextInt();

				if (alternativa == 1)
					fazerLigacao();
				else if (alternativa == 2)
					receberLigacao();
				else
					System.out.println("Opção inválida, tente novamente!");

			} else if (opcao == 2) {

				System.out.println("Para enviar sms digite 1, e para receber 2!");
				alternativa = scanner.nextInt();

				if (alternativa == 1) {

					validacaoFuncionalidade = true;
					enviarSms();

				} else if (alternativa == 2) {

					validacaoFuncionalidade = true;
					receberSms();

				} else {

					System.out.println("Opção inválida, tente novamente!");

				}

			} else if (opcao == 3) {

				System.out.println("Para enviar email digite 1, e para receber 2!");
				alternativa = scanner.nextInt();

				if (alternativa == 1) {

					validacaoFuncionalidade = true;
					enviarEmail();

				} else if (alternativa == 2) {

					validacaoFuncionalidade = true;
					receberEmail();

				} else {

					System.out.println("Opção inválida, tente novamente!");
				}

			} else if (opcao == 4) {

				aplicativos();

			} else if (opcao == 5) {

				configuracoesIphone();

			} else if (opcao == 6) {

				desligarIphone();

			} else if (opcao == 7) {

				ligarIphone();

			} else if (opcao == 8) {

				Aparelho.telaInicial();

			} else {

				System.out.println("Alternativa inválida, tente novamente!");
				telaPrincipal();
			}

			if (validacaoDesligarIphone == true) {

				return;

			} else {

				System.out.println("Para sair digite 3!");

				alternativa = scanner.nextInt();

				if (alternativa == 3)
					telaPrincipal();
			}

		} catch (Exception e) {

			System.out.println("Ocorreu um erro, ao acessar a opção!");
			mensagemReiniciarIphone();
			Aparelho.telaInicial();

		} finally {
			scanner.close();
		}

	}

	private void configuracoes() {

		Scanner scanner = new Scanner(System.in);

		String sistema = "ios";
		String versao = "10";
		String aparelho = "iPhone I";
		String modelo = "4GB";
		String anoFabricacao = "2007";

		System.out.println("---------------------Configuracões do Aparelho---------------------");
		System.out.println("Aparelho: " + aparelho);
		System.out.println("Sistema: " + sistema);
		System.out.println("Versão: " + versao);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano de fabricação: " + anoFabricacao);
		System.out.println("--------------------------------------------------------------------");

		if (validacaoAplicativos == false) {

			// Voltando ao menu de aplicativos e tela principal
			System.out.println("Para voltar aos aplicativos digite 5, ou para voltar a tela principal 6!");
			int alternativa = scanner.nextInt();

			if (alternativa == 5) {

				aplicativos();

			} else if (alternativa == 6) {

				telaPrincipal();

			} else {

				System.out.println("Opção inválida, voltando aos aplicativos!");
				aplicativos();
			}

		} else if (validacaoAplicativos == true) {

			// Voltando ao menu da tela principal
			System.out.println("Para sair digite 3!");
			int alternativa = scanner.nextInt();

			if (alternativa == 3) {

				telaPrincipal();

			} else {

				System.out.println("Opção inválida, voltando a tela principal!");
				telaPrincipal();
			}
		}

		scanner.close();

	}

	private void mensagemLigarIphone() {

		System.out.println("iPhone ligado - Apple Inc...!");
	}

	private void mensagemDesligarIphone() {

		System.out.println("iPhone Desligado!");
	}

	private void mensagemReiniciarIphone() {

		System.out.println("iPhone Reiniciado!");
	}


	private void listarMusicas() {

		System.out.println("------------------Lista de músicas----------------");
		System.out.println("1 - Carinhoso – Orlando Silva (1937) ");
		System.out.println("2 - Aquarela do Brasil – Francisco Alves (1939)");
		System.out.println("3 - Xote das Meninas – Luiz Gonzaga (1953)");
		System.out.println("4 - Eu Sei Que Vou Te Amar (1958)");
		System.out.println("5 - Chega de Saudade – João Gilberto (1959)");
		System.out.println("--------------------------------------------------");

	}

	private void listarVideos() {

		System.out.println("------------------Lista de videos----------------");
		System.out.println("1 - Carinhoso – Orlando Silva (1937) ");
		System.out.println("2 - Aquarela do Brasil – Francisco Alves (1939)");
		System.out.println("3 - Xote das Meninas – Luiz Gonzaga (1953)");
		System.out.println("4 - Eu Sei Que Vou Te Amar (1958)");
		System.out.println("5 - Chega de Saudade – João Gilberto (1959)");
		System.out.println("--------------------------------------------------");

	}

	private void listarAbas() {

		System.out.println("--------------Lista de abas abertas--------------");
		System.out.println("1 - www.santander.com.br ");
		System.out.println("2 - www.dio.com.br");
		System.out.println("3 - www.microsoft.com.br");
		System.out.println("4 - www.educacao.com.br");
		System.out.println("5 - www.java.com.br");
		System.out.println("--------------------------------------------------");

	}

	private void listarPaginas() {

		System.out.println("--------------Lista de Páginas abertas--------------");
		System.out.println("1 - www.santander.com.br ");
		System.out.println("2 - www.dio.com.br");
		System.out.println("3 - www.microsoft.com.br");
		System.out.println("4 - www.educacao.com.br");
		System.out.println("5 - www.java.com.br");
		System.out.println("--------------------------------------------------");

	}

	private void listarFotos() {

		System.out.println("------------------Lista de fotos----------------");
		System.out.println("1 - Carinhoso – Orlando Silva (1937) ");
		System.out.println("2 - Aquarela do Brasil – Francisco Alves (1939)");
		System.out.println("3 - Xote das Meninas – Luiz Gonzaga (1953)");
		System.out.println("4 - Eu Sei Que Vou Te Amar (1958)");
		System.out.println("5 - Chega de Saudade – João Gilberto (1959)");
		System.out.println("--------------------------------------------------");

	}

	private void listarAplicativos() {

		System.out.println("----------------------------Aplicativos----------------------------");
		System.out.println("Digite 1 para Configurações");
		System.out.println("Digite 2 para Reprodutor de Musica");
		System.out.println("Digite 3 para Reprodutor de Foto");
		System.out.println("Digite 4 para Reprodutor de Video");
		System.out.println("Digite 5 para Navegado de Internet");
		System.out.println("Digite 6 para Sms");
		System.out.println("Digite 7 para Email");
		System.out.println("Digite 8 para Bateria");
		System.out.println("Digite 9 para Camera");
		System.out.println("Digite 10 para Calendario");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Escolha uma das opções desejada, ou para voltar a tela principal digite 0!");

	}

	// ----------------------------Funcionalidades---------------------------------//

	private void enviarSms() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Por favor informe o número com o DDD para enviar o sms!");
		String numero = scanner.next();
		String mensagem = enviarSms(numero);
		System.out.println(mensagem);

		if (validacaoAplicativos == false) {

			// Voltando ao menu de aplicativos e tela principal

			if (validacaoFuncionalidade == true) {

				System.out.println("Para sair digite 3!");

				int alternativa = scanner.nextInt();

				if (alternativa == 3) {

					telaPrincipal();

				} else {

					System.out.println("Opção inválida, voltando a tela principal!");
				}

			}

			System.out.println("Para voltar aos aplicativos digite 5, ou para voltar a tela principal 6!");
			int alternativa = scanner.nextInt();

			if (alternativa == 5) {

				aplicativos();

			} else if (alternativa == 6) {

				telaPrincipal();

			} else {

				System.out.println("Opção inválida, voltando aos aplicativos!");
				aplicativos();
			}

		} else if (validacaoAplicativos == true) {

			// Voltando ao menu da tela principal
			System.out.println("Para sair digite 3!");
			int alternativa = scanner.nextInt();

			if (alternativa == 3) {

				telaPrincipal();

			} else {

				System.out.println("Opção inválida, voltando a tela principal!");
				telaPrincipal();
			}
		}

		scanner.close();

	}

	private void fazerLigacao() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Por favor informe o número com o DDD para fazer a ligação!");
		String numero = scanner.next();
		String mensagem = fazerLigacao(numero);
		System.out.println(mensagem);
		System.out.println(
				"Para ajustar o volume digite 1, para ativar o viva voz 2, chamada em esperar 3, para encerrar a ligação 4!");

		int alternativa = scanner.nextInt();

		if (alternativa == 1) {

			System.out.println(
					"Para diminuir o volume digite 2, para aumentar o volume 3, e para ativar o silênciar 4!");
			alternativa = scanner.nextInt();

			if (alternativa == 2) {

				diminuirVolume();

			} else if (alternativa == 3) {

				aumentarVolume();

			} else if (alternativa == 4) {

				silenciarVolume();

			} else {

				System.out.println("Opção inválida, tente novamente!");

			}

			System.out.println("Para encerrar a ligação digite 4!");
			alternativa = scanner.nextInt();

			if (alternativa == 4) {

				encerrarLigacao();
				telaPrincipal();

			}

		} else if (alternativa == 2) {

			vivaVoz();

		} else if (alternativa == 3) {

			listarChamadaEsperar();

		} else if (alternativa == 4) {

			encerrarLigacao();
			telaPrincipal();

		} else {

			System.out.println("Opção inválida, tente novamente!");

		}

		System.out.println("Para encerrar a ligação digite 4!");
		alternativa = scanner.nextInt();

		if (alternativa == 4) {

			encerrarLigacao();
			telaPrincipal();

		}

		scanner.close();

	}

	private void enviarEmail() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Por favor informe o endereço de e-mail!");
		String email = scanner.next();
		String mensagem = enviarEmail(email);
		System.out.println(mensagem);

		if (validacaoAplicativos == false) {

			// Voltando ao menu de aplicativos e tela principal
			if (validacaoFuncionalidade == true) {

				System.out.println("Para sair digite 3!");

				int alternativa = scanner.nextInt();

				if (alternativa == 3) {

					telaPrincipal();

				} else {

					System.out.println("Opção inválida, voltando a tela principal!");

				}

			}

			System.out.println("Para voltar aos aplicativos digite 5, ou para voltar a tela principal 6!");
			int alternativa = scanner.nextInt();

			if (alternativa == 5) {

				aplicativos();

			} else if (alternativa == 6) {

				telaPrincipal();

			} else {

				System.out.println("Opção inválida, voltando aos aplicativos!");
				aplicativos();
			}

		} else if (validacaoAplicativos == true) {

			// Voltando ao menu da tela principal
			System.out.println("Para sair digite 3!");
			int alternativa = scanner.nextInt();

			if (alternativa == 3) {

				telaPrincipal();

			} else {

				System.out.println("Opção inválida, voltando a tela principal!");
				telaPrincipal();
			}
		}

		scanner.close();

	}

	private void aplicativos() {

		Scanner scanner = new Scanner(System.in);

		// Funcionalidade para acessar os aplicativos
		listarAplicativos();

		int alternativa = scanner.nextInt();

		if (alternativa == 1) {

			// Funcionalidade para acessar as configurações
			validacaoAplicativos = false;
			configuracoes();

		} else if (alternativa == 2) {

			// Funcionalidade do Reprodutor de Música
			System.out.println("Para iniciar a musica digite 1, para pausar 2, para selecionar 3, e para remover 4!");
			alternativa = scanner.nextInt();

			if (alternativa == 1) {

				tocar();

			} else if (alternativa == 2) {

				pausar();

			} else if (alternativa == 3) {

				System.out.println("Para selecionar a música escolhar uma das opções!");
				listarMusicas();
				String selecionar = scanner.next();
				selecionadarOpcao = Integer.parseInt(selecionar);

				if (selecionadarOpcao > 5) {

					System.out.println(
							"Opção inválida, a música não esta na lista, para voltar aos aplicativos digite 5, ou para voltar a tela principal 6!");

					alternativa = scanner.nextInt();

					if (alternativa == 5) {

						aplicativos();

					} else if (alternativa == 6) {

						telaPrincipal();

					} else {

						System.out.println("Opção inválida, voltando aos aplicativos!");
						aplicativos();
					}

				}

				String mensagem = selecionarMusica(selecionar);
				System.out.println(mensagem);

			} else if (alternativa == 4) {

				System.out.println("Para remover a música escolhar uma das opções!");
				listarMusicas();
				String selecionar = scanner.next();
				selecionadarOpcao = Integer.parseInt(selecionar);

				if (selecionadarOpcao > 5) {

					System.out.println(
							"Opção inválida, a música não esta na lista, para voltar aos aplicativos digite 5, ou para voltar a tela principal 6!");

					alternativa = scanner.nextInt();

					if (alternativa == 5) {

						aplicativos();

					} else if (alternativa == 6) {

						telaPrincipal();

					} else {

						System.out.println("Opção inválida, voltando aos aplicativos!");
						aplicativos();
					}

				}

				String mensagem = removerMusica(selecionar);
				System.out.println(mensagem);

			} else {

				System.out.println(
						"Opção inválida, para voltar aos aplicativos digite 5, ou para voltar a tela principal 6!");
				alternativa = scanner.nextInt();

				if (alternativa == 5) {

					aplicativos();

				} else if (alternativa == 6) {

					telaPrincipal();

				} else {

					System.out.println("Opção inválida, voltando aos aplicativos!");
					aplicativos();
				}

			}

			System.out.println("Para voltar aos aplicativos digite 5, ou para voltar a tela principal 6!");
			alternativa = scanner.nextInt();

			if (alternativa == 5) {

				aplicativos();

			} else if (alternativa == 6) {

				telaPrincipal();

			} else {

				System.out.println("Opção inválida, voltando aos aplicativos!");
				aplicativos();
			}

		} else if (alternativa == 3) {

			// Funcionalidade do Reprodutor de Foto
			System.out.println("Passar para próxima foto digite 1, ir para anterior 2, para selecionar 3, e para remover 4!");
			alternativa = scanner.nextInt();

			if (alternativa == 1) {

				proxima();

			} else if (alternativa == 2) {

				anterior();

			} else if (alternativa == 3) {

				System.out.println("Para selecionar a foto escolhar uma das opções!");
				listarFotos();
				String selecionar = scanner.next();
				selecionadarOpcao = Integer.parseInt(selecionar);

				if (selecionadarOpcao > 5) {

					System.out.println(
							"Opção inválida, a foto não esta na lista, para voltar aos aplicativos digite 5, ou para voltar a tela principal 6!");

					alternativa = scanner.nextInt();

					if (alternativa == 5) {

						aplicativos();

					} else if (alternativa == 6) {

						telaPrincipal();

					} else {

						System.out.println("Opção inválida, voltando aos aplicativos!");
						aplicativos();
					}

				}

				String mensagem = selecionarfoto(selecionar);
				System.out.println(mensagem);

			} else if (alternativa == 4) {

				System.out.println("Para remover a foto escolhar uma das opções!");
				listarFotos();
				String selecionar = scanner.next();

				selecionadarOpcao = Integer.parseInt(selecionar);

				if (selecionadarOpcao > 5) {

					System.out.println(
							"Opção inválida, a foto não esta na lista, para voltar aos aplicativos digite 5, ou para voltar a tela principal 6!");

					alternativa = scanner.nextInt();

					if (alternativa == 5) {

						aplicativos();

					} else if (alternativa == 6) {

						telaPrincipal();

					} else {

						System.out.println("Opção inválida, voltando aos aplicativos!");
						aplicativos();
					}

				}

				String mensagem = removerFoto(selecionar);
				System.out.println(mensagem);

			} else {

				System.out.println(
						"Opção inválida, para voltar aos aplicativos digite 5, ou para voltar a tela principal 6!");
				alternativa = scanner.nextInt();

				if (alternativa == 5) {

					aplicativos();

				} else if (alternativa == 6) {

					telaPrincipal();

				} else {

					System.out.println("Opção inválida, voltando aos aplicativos!");
					aplicativos();
				}

			}

			System.out.println("Para voltar aos aplicativos digite 5, ou para voltar a tela principal 6!");
			alternativa = scanner.nextInt();

			if (alternativa == 5) {

				aplicativos();

			} else if (alternativa == 6) {

				telaPrincipal();

			} else {

				System.out.println("Opção inválida, voltando aos aplicativos!");
				aplicativos();
			}

		} else if (alternativa == 4) {

			// Funcionalidade do Reprodutor de Video
			System.out.println("Para iniciar o video digite 1, para pausar 2, para selecionar 3, e para remover 4!");
			alternativa = scanner.nextInt();

			if (alternativa == 1) {

				tocar();

			} else if (alternativa == 2) {

				pausar();

			} else if (alternativa == 3) {

				System.out.println("Para selecionar o video escolhar uma das opções!");
				listarVideos();
				String selecionar = scanner.next();
				selecionadarOpcao = Integer.parseInt(selecionar);

				if (selecionadarOpcao > 5) {

					System.out.println(
							"Opção inválida, o video não esta na lista, para voltar aos aplicativos digite 5, ou para voltar a tela principal 6!");

					alternativa = scanner.nextInt();

					if (alternativa == 5) {

						aplicativos();

					} else if (alternativa == 6) {

						telaPrincipal();

					} else {

						System.out.println("Opção inválida, voltando aos aplicativos!");
						aplicativos();
					}

				}

				String mensagem = selecionarVideo(selecionar);
				System.out.println(mensagem);

			} else if (alternativa == 4) {

				System.out.println("Para remover o video escolhar uma das opções!");
				listarVideos();
				String selecionar = scanner.next();
				selecionadarOpcao = Integer.parseInt(selecionar);

				if (selecionadarOpcao > 5) {

					System.out.println(
							"Opção inválida, o video não esta na lista, para voltar aos aplicativos digite 5, ou para voltar a tela principal 6!");

					alternativa = scanner.nextInt();

					if (alternativa == 5) {

						aplicativos();

					} else if (alternativa == 6) {

						telaPrincipal();

					} else {

						System.out.println("Opção inválida, voltando aos aplicativos!");
						aplicativos();
					}

				}

				String mensagem = removerVideo(selecionar);
				System.out.println(mensagem);

			}

			else {

				System.out.println(
						"Opção inválida, para voltar aos aplicativos digite 5, ou para voltar a tela principal 6!");
				alternativa = scanner.nextInt();

				if (alternativa == 5) {

					aplicativos();

				} else if (alternativa == 6) {

					telaPrincipal();

				} else {

					System.out.println("Opção inválida, voltando aos aplicativos!");
					aplicativos();
				}

			}

			System.out.println("Para voltar aos aplicativos digite 5, ou para voltar a tela principal 6!");
			alternativa = scanner.nextInt();

			if (alternativa == 5) {

				aplicativos();

			} else if (alternativa == 6) {

				telaPrincipal();

			} else {

				System.out.println("Opção inválida, voltando aos aplicativos!");
				aplicativos();
			}

		} else if (alternativa == 5) {

			// Funcionalidade do Navegador de Internet
			System.out.println("Para exibir a página digite 1, para adicionar uma nova aba 2, para atualizar a página 3, e para remover a aba 4!");
			alternativa = scanner.nextInt();

			if (alternativa == 1) {

				System.out.println("Para selecionar a página de internet escolhar uma das opções!");
				listarPaginas();
				String enderecoUrl = scanner.next();

				selecionadarOpcao = Integer.parseInt(enderecoUrl);

				if (selecionadarOpcao > 5) {

					System.out.println(
							"Opção inválida, a página não esta na lista, para voltar aos aplicativos digite 5, ou para voltar a tela principal 6!");

					alternativa = scanner.nextInt();

					if (alternativa == 5) {

						aplicativos();

					} else if (alternativa == 6) {

						telaPrincipal();

					} else {

						System.out.println("Opção inválida, voltando aos aplicativos!");
						aplicativos();
					}

				}

				String mensagem = exibirPagina(enderecoUrl);
				System.out.println(mensagem);

			} else if (alternativa == 2) {

				adicionarNovaAba();

			} else if (alternativa == 3) {

				atualizarPagina();

			} else if (alternativa == 4) {

				System.out.println("Para remover a aba escolhar uma das opções!");
				listarAbas();
				String selecionar = scanner.next();

				selecionadarOpcao = Integer.parseInt(selecionar);

				if (selecionadarOpcao > 5) {

					System.out.println(
							"Opção inválida, a página não esta na lista, para voltar aos aplicativos digite 5, ou para voltar a tela principal 6!");

					alternativa = scanner.nextInt();

					if (alternativa == 5) {

						aplicativos();

					} else if (alternativa == 6) {

						telaPrincipal();

					} else {

						System.out.println("Opção inválida, voltando aos aplicativos!");
						aplicativos();
					}

				}

				String mensagem = removerAba(selecionar);
				System.out.println(mensagem);

			}

			else {

				System.out.println(
						"Opção inválida, para voltar aos aplicativos digite 5, ou para voltar a tela principal 6!");
				alternativa = scanner.nextInt();

				if (alternativa == 5) {

					aplicativos();

				} else if (alternativa == 6) {

					telaPrincipal();

				} else {

					System.out.println("Opção inválida, voltando aos aplicativos!");
					aplicativos();
				}

			}

			System.out.println("Para voltar aos aplicativos digite 5, ou para voltar a tela principal 6!");
			alternativa = scanner.nextInt();

			if (alternativa == 5) {

				aplicativos();

			} else if (alternativa == 6) {

				telaPrincipal();

			} else {

				System.out.println("Opção inválida, voltando aos aplicativos!");
				aplicativos();
			}

		} else if (alternativa == 6) {

			// Funcionalidade de Sms
			System.out.println("Para enviar sms digite 1, e para receber 2!");
			alternativa = scanner.nextInt();

			if (alternativa == 1) {

				validacaoAplicativos = false;
				enviarSms();

			} else if (alternativa == 2) {

				receberSms();

			} else {

				System.out.println(
						"Opção inválida, para voltar aos aplicativos digite 5, ou para voltar a tela principal 6!");
				alternativa = scanner.nextInt();

				if (alternativa == 5) {

					aplicativos();

				} else if (alternativa == 6) {

					telaPrincipal();

				} else {

					System.out.println("Opção inválida, voltando aos aplicativos!");
					aplicativos();
				}

			}

			System.out.println("Para voltar aos aplicativos digite 5, ou para voltar a tela principal 6!");
			alternativa = scanner.nextInt();

			if (alternativa == 5) {

				aplicativos();

			} else if (alternativa == 6) {

				telaPrincipal();

			} else {

				System.out.println("Opção inválida, voltando aos aplicativos!");
				aplicativos();
			}

		} else if (alternativa == 7) {

			// Funcionalidade de Email
			System.out.println("Para enviar email digite 1, e para receber 2!");
			alternativa = scanner.nextInt();

			if (alternativa == 1) {

				validacaoAplicativos = false;
				enviarEmail();

			} else if (alternativa == 2) {

				receberEmail();

			} else {

				System.out.println(
						"Opção inválida, para voltar aos aplicativos digite 5, ou para voltar a tela principal 6!");
				alternativa = scanner.nextInt();

				if (alternativa == 5) {

					aplicativos();

				} else if (alternativa == 6) {

					telaPrincipal();

				} else {

					System.out.println("Opção inválida, voltando aos aplicativos!");
					aplicativos();
				}

			}

			System.out.println("Para voltar aos aplicativos digite 5, ou para voltar a tela principal 6!");
			alternativa = scanner.nextInt();

			if (alternativa == 5) {

				aplicativos();

			} else if (alternativa == 6) {

				telaPrincipal();

			} else {

				System.out.println("Opção inválida, voltando aos aplicativos!");
				aplicativos();
			}

		} else if (alternativa == 8) {

			// Funcionalidade da Bateria
			System.out.println("Para verificar o nível da bateria digite 1, e para carregar 2!");
			alternativa = scanner.nextInt();

			if (alternativa == 1) {

				nivelBateria();

			} else if (alternativa == 2) {

				carregar();

			} else {

				System.out.println(
						"Opção inválida, para voltar aos aplicativos digite 5, ou para voltar a tela principal 6!");
				alternativa = scanner.nextInt();

				if (alternativa == 5) {

					aplicativos();

				} else if (alternativa == 6) {

					telaPrincipal();

				} else {

					System.out.println("Opção inválida, voltando aos aplicativos!");
					aplicativos();
				}

			}

			System.out.println("Para voltar aos aplicativos digite 5, ou para voltar a tela principal 6!");
			alternativa = scanner.nextInt();

			if (alternativa == 5) {

				aplicativos();

			} else if (alternativa == 6) {

				telaPrincipal();

			} else {

				System.out.println("Opção inválida, voltando aos aplicativos!");
				aplicativos();
			}

		} else if (alternativa == 9) {

			// Funcionalidade da Camera
			System.out.println("Para ligar a camera digite 1, para tirar foto 2, para criar video 3 e para desligar camera 4!");
			alternativa = scanner.nextInt();

			if (alternativa == 1) {

				ligarCamera();

			} else if (alternativa == 2) {

				tirarFoto();

			} else if (alternativa == 3) {

				criarVideo();

			} else if (alternativa == 4) {

				desligarCamera();

			} else {

				System.out.println(
						"Opção inválida, para voltar aos aplicativos digite 5, ou para voltar a tela principal 6!");
				alternativa = scanner.nextInt();

				if (alternativa == 5) {

					aplicativos();

				} else if (alternativa == 6) {

					telaPrincipal();

				} else {

					System.out.println("Opção inválida, voltando aos aplicativos!");
					aplicativos();
				}

			}

			System.out.println("Para voltar aos aplicativos digite 5, ou para voltar a tela principal 6!");
			alternativa = scanner.nextInt();

			if (alternativa == 5) {

				aplicativos();

			} else if (alternativa == 6) {

				telaPrincipal();

			} else {

				System.out.println("Opção inválida, voltando aos aplicativos!");
				aplicativos();
			}

		} else if (alternativa == 10) {

			// Funcionalidade do Calendario
			System.out.println("Para ver a data atual digite 1!");
			alternativa = scanner.nextInt();

			if (alternativa == 1) {

				obterData();

			} else {

				System.out.println(
						"Opção inválida, para voltar aos aplicativos digite 5, ou para voltar a tela principal 6!");
				alternativa = scanner.nextInt();

				if (alternativa == 5) {

					aplicativos();

				} else if (alternativa == 6) {

					telaPrincipal();

				} else {

					System.out.println("Opção inválida, voltando aos aplicativos!");
					aplicativos();
				}

			}

			System.out.println("Para voltar aos aplicativos digite 5, ou para voltar a tela principal 6!");
			alternativa = scanner.nextInt();

			if (alternativa == 5) {

				aplicativos();

			} else if (alternativa == 6) {

				telaPrincipal();

			} else {

				System.out.println("Opção inválida, voltando aos aplicativos!");
				aplicativos();
			}

		} else if (alternativa == 0) {

			telaPrincipal();

		} else {

			System.out.println("Opção inválida, para voltar aos aplicativos digite 5!");
			alternativa = scanner.nextInt();

			if (alternativa == 5) {

				aplicativos();

			} else {

				System.out.println("Opção inválida, voltando a tela principal!");
				telaPrincipal();
			}

		}

		scanner.close();
	}

	private void configuracoesIphone() {

		Scanner scanner = new Scanner(System.in);

		validacaoAplicativos = true;
		configuracoes();
		System.out.println("Para voltar a tela inicial digite 0!");
		int alternativa = scanner.nextInt();

		if (alternativa == 0) {

			telaPrincipal();

		}

		scanner.close();

	}

	private void desligarIphone() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Para desligar digite 1, para reiniciar 2, e para cancelar 3!");
		int alternativa = scanner.nextInt();

		if (alternativa == 1) {

			mensagemDesligarIphone();

			System.out.println("Para ligar o iPhone novamente digite 2, ou para ignorar 3!");
			alternativa = scanner.nextInt();
			validacaoDesligarIphone = true;

			if (alternativa == 2) {

				mensagemLigarIphone();
				Aparelho.telaInicial();

			} else if (alternativa == 3) {

				System.out.println(
						"Obrigado, por utilizar o iPhone I, em homenagem a Steve Jobs 24/02/1955 a 05/10/2011 !!!");

			}

		} else if (alternativa == 2) {

			mensagemReiniciarIphone();
			Aparelho.telaInicial();

		} else if (alternativa == 3) {

			telaPrincipal();

		}

		scanner.close();

	}

	private void ligarIphone() {

		if (validacaoLigarIphone == true) {

			mensagemLigarIphone();
			telaPrincipal();

		} else {

			System.out.println("O iPhone já esta ligado, escolha outra opção!");

		}

	}
	// ----------------------------------------------------------------------------------//

	@Override
	public void tocar() {

		System.out.println("Iniciando!");

	}

	@Override
	public void pausar() {

		System.out.println("Pausar!");

	}

	@Override
	public String selecionarMusica(String musica) {

		musica = "Música selecionada com sucesso!";
		return musica;
	}

	@Override
	public String removerMusica(String musica) {

		musica = "Música removida com sucesso!";
		return musica;
	}

	@Override
	public String exibirPagina(String url) {

		url = "Página carregada com sucesso!";
		return url;
	}

	@Override
	public void adicionarNovaAba() {

		System.out.println("Nova aba adicionada com sucesso!");

	}

	@Override
	public void atualizarPagina() {

		System.out.println("Página atualizada com sucesso!");

	}

	@Override
	public String selecionarVideo(String video) {

		video = "Video selecionado!";
		return video;
	}

	@Override
	public String removerVideo(String video) {

		video = "Video removido!";
		return video;
	}

	@Override
	public void proxima() {

		System.out.println("Passando!");

	}

	@Override
	public void anterior() {

		System.out.println("Anterior!");

	}

	@Override
	public String selecionarfoto(String foto) {

		foto = "Foto selecionada!";
		return foto;
	}

	@Override
	public void obterData() {

		LocalDate data = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dataFormatada = data.format(formatter);
		System.out.println("Data: " + dataFormatada);

	}

	@Override
	public void ligarCamera() {

		System.out.println("Camera ligada!");

	}

	@Override
	public void tirarFoto() {

		System.out.println("Tirando foto!");

	}

	@Override
	public void criarVideo() {

		System.out.println("Iniciar video!");

	}

	@Override
	public void desligarCamera() {

		System.out.println("Desligando a camera!");

	}

	@Override
	public void nivelBateria() {

		System.out.println("Nível da bateria esta baixo!");

	}

	@Override
	public void carregar() {

		System.out.println("iPhone carregando!");

	}

	@Override
	public String fazerLigacao(String numero) {

		numero = "Ligando para o número: " + numero;
		return numero;
	}

	@Override
	public void receberLigacao() {

		System.out.println("Atendendo a ligação!");

	}

	@Override
	public void iniciarCorreioVoz() {

		System.out.println("Iniciando o correio de voz!");

	}

	@Override
	public void encerrarLigacao() {

		System.out.println("Encerrando a ligação!");

	}

	@Override
	public void vivaVoz() {

		System.out.println("Viva voz ativado!");

	}

	@Override
	public void listarChamadaEsperar() {

		System.out.println("Chama em esperar esta ativado!");

	}

	@Override
	public String enviarEmail(String mensagem) {

		mensagem = "E-mail enviado com sucesso!";
		return mensagem;
	}

	@Override
	public void receberEmail() {

		System.out.println("E-mail recebido com sucesso!");

	}

	@Override
	public String enviarSms(String mensagem) {

		mensagem = "Sms enviado com sucesso!";
		return mensagem;
	}

	@Override
	public void receberSms() {

		System.out.println("SMS recebido com sucesso!");

	}

	@Override
	public void aumentarVolume() {

		System.out.println("Almentando o valume!");

	}

	@Override
	public void diminuirVolume() {

		System.out.println("Diminuindo o volume!");

	}

	@Override
	public void silenciarVolume() {

		System.out.println("Silênciar volume esta ativado!");

	}

	@Override
	public void wifi() {

		System.out.println("Wifi esta ativo, vc esta conectado a rede 'Dio_global'!");
	}

	@Override
	public void bluetooth() {

		System.out.println("Bluetooth esta ativo, vc esta conectado ao 'AirPods'!");

	}

	@Override
	public void dadosMovel() {

		System.out.println("Dados Móvel esta ativo, vc esta conectado a operadora 'Claro_gsm'!");

	}

	@Override
	public String removerAba(String aba) {

		aba = "Aba removida com sucesso!";
		return aba;

	}

	@Override
	public String removerFoto(String foto) {

		foto = "Foto removida com sucesso!";
		return foto;
	}

}
