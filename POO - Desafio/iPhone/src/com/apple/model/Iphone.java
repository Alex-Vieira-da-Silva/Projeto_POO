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

	Scanner scanner = new Scanner(System.in);
	private int alternativa = scanner.nextInt();

	private boolean validacaoLigarIphone = false;
	private boolean validacaoDesligarIphone = false;

	public void TelaPrincipal() {

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

		int opcao = scanner.nextInt();

		try {

			if (opcao == 1) {

				System.out.println("Para ligar digite 1, e para receber 2!");
				alternativa = scanner.nextInt();

				if (alternativa == 1)
					fazerLigacao();
				else if (alternativa == 2)
					receberLigacao();

			} else if (opcao == 2) {

				System.out.println("Para enviar sms digite 1, e para receber 2!");
				alternativa = scanner.nextInt();

				if (alternativa == 1)
					enviarSms();
				else if (alternativa == 2)
					receberSms();

			} else if (opcao == 3) {

				System.out.println("Para enviar email digite 1, e para receber 2!");
				alternativa = scanner.nextInt();

				if (alternativa == 1)
					enviarEmail();
				else if (alternativa == 2)
					receberEmail();

			} else if (opcao == 4) {

				aplicativos();

			} else if (opcao == 5) {

				configuracoesIphone();

			} else if (opcao == 6) {

				desligarIphone();

			} else if (opcao == 7) {

				ligarIphone();

			} else if (opcao == 8) {

				Aparelho.TelaInicial();

			} else {

				System.out.println("Alternativa inválida, tente novamente!");
				TelaPrincipal();
			}

			if (validacaoDesligarIphone == true) {

				return;

			} else {

				System.out.println("Para sair digite 3!");

				int alternativa = scanner.nextInt();

				if (alternativa == 3)
					TelaPrincipal();
			}

		} catch (Exception e) {

			System.out.println("Ocorreu um erro, ao acessar a opção!");
			mensagemReiniciarIphone();
			Aparelho.TelaInicial();

		} finally {
			scanner.close();
		}

	}

	private void configuracoes() {

		String sistema = "ios";
		String versao = "10";
		String aparelho = "iPhone I";
		String modelo = "4GB";
		String anoFabricacao = "2007";

		System.out.println("-------------Configuracões do Aparelho-------------");
		System.out.println("Aparelho: " + aparelho);
		System.out.println("Sistema: " + sistema);
		System.out.println("Versão: " + versao);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano de fabricação: " + anoFabricacao);
		System.out.println("-------------------------------------------------");

		System.out.println("Para sair digite 3!");

		int alternativa = scanner.nextInt();

		if (alternativa == 3)
			TelaPrincipal();

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

	private void opcaoMensagemReprodutorMusica() {

		System.out.println("Para iniciar a musica digite 1, para pausar 2, para selecionar 3, e para remover 4!");
	}

	private void opcaoMensagemReprodutorFoto() {

		System.out
				.println("Passar para próxima foto digite 1, ir para anterior 2, para selecionar 3, e para remover 4!");

	}

	private void opcaoMensagemReprodutorVideo() {

		System.out.println("Para iniciar o video digite 1, para pausar 2, para selecionar 3, e para remover 4!");

	}

	private void opcaoMensagemNavegadorInternet() {

		System.out.println(
				"Para exibir a página digite 1, para adicionar uma nova aba 2, para atualizar a página 3, e para remover a aba 4!");

	}

	private void opcaoMensagemSms() {

		System.out.println("Para enviar sms digite 1, e para receber 2!");

	}

	private void opcaoMensagemEmail() {

		System.out.println("Para enviar email digite 1, e para receber 2!");

	}

	private void opcaoMensagemBateria() {

		System.out.println("Para verificar o nível da bateria digite 1, e para carregar 2!");

	}

	private void opcaoMensagemCamera() {

		System.out.println(
				"Para ligar a camera digite 1, para tirar foto 2, para criar video 3 e para desligar camera 4!");

	}

	private void opcaoMensagemCalendario() {

		System.out.println("Para ver a data atual digite 1!");

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

		System.out.println("----------------Aplicativos---------------");
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
		System.out.println("------------------------------------------");
		System.out.println("Escolha uma das opções desejada, ou para voltar a tela inicial digite 0!");

	}

	// ----------------------------Funcionalidades---------------------------------//

	private void enviarSms() {

		System.out.println("Por favor informe o número com o DDD para enviar o sms!");
		String numero = scanner.next();
		String mensagem = enviarSms(numero);
		System.out.println(mensagem);

		System.out.println("Para sair digite 3!");

		int alternativa = scanner.nextInt();

		if (alternativa == 3)
			TelaPrincipal();
	}

	private void fazerLigacao() {

		System.out.println("Por favor informe o número com o DDD para fazer a ligação!");
		String numero = scanner.next();
		String mensagem = fazerLigacao(numero);
		System.out.println(mensagem);
		System.out.println(
				"Para ajustar o volume digite 1, para ativar o viva voz digite 2, chamada em esperar digite 3, para encerrar a ligação digite 4!");

		alternativa = scanner.nextInt();

		if (alternativa == 1) {

			System.out.println(
					"Para diminuir o volume digite 2, para aumentar o volume digite 3 e para ativar o silênciar digite 4!");
			alternativa = scanner.nextInt();

			if (alternativa == 2) {

				diminuirVolume();

			} else if (alternativa == 3) {

				aumentarVolume();

			} else if (alternativa == 4) {

				silenciarVolume();

			} else {

				System.out.println("Opção inválida, tente novamente!");
				TelaPrincipal();
			}

			System.out.println("Para encerrar a ligação digite 4!");
			alternativa = scanner.nextInt();

			if (alternativa == 4) {

				encerrarLigacao();
				TelaPrincipal();

			}

		} else if (alternativa == 2) {

			vivaVoz();

		} else if (alternativa == 3) {

			listarChamadaEsperar();

		} else if (alternativa == 4) {

			encerrarLigacao();
			TelaPrincipal();
		}

		System.out.println("Para encerrar a ligação digite 4!");
		alternativa = scanner.nextInt();

		if (alternativa == 4) {

			encerrarLigacao();
			TelaPrincipal();

		}

	}

	private void enviarEmail() {

		System.out.println("Por favor informe o endereço de e-mail!");
		String email = scanner.next();
		String mensagem = enviarEmail(email);
		System.out.println(mensagem);

		System.out.println("Para sair digite 3!");

		int alternativa = scanner.nextInt();

		if (alternativa == 3)
			TelaPrincipal();

	}

	private void aplicativos() {

		// Funcionalidade para acessar os aplicativos
		listarAplicativos();

		alternativa = scanner.nextInt();

		if (alternativa == 1) {

			// Funcionalidade para acessar as configurações
			configuracoes();

		} else if (alternativa == 2) {

			// Funcionalidade do Reprodutor de Música
			opcaoMensagemReprodutorMusica();
			alternativa = scanner.nextInt();

			if (alternativa == 1) {

				tocar();

			} else if (alternativa == 2) {

				pausar();

			} else if (alternativa == 3) {

				listarMusicas();
				String selecionar = scanner.next();
				String mensagem = selecionarMusica(selecionar);
				System.out.println(mensagem);

			} else if (alternativa == 4) {

				System.out.println("Para remover a música selecione a opção desejada!");
				listarMusicas();
				String selecionar = scanner.next();
				String mensagem = removerMusica(selecionar);
				System.out.println(mensagem);

			}

			System.out.println("Para sair digite 3!");
			alternativa = scanner.nextInt();

			if (alternativa == 3)
				TelaPrincipal();

		} else if (alternativa == 3) {

			// Funcionalidade do Reprodutor de Foto
			opcaoMensagemReprodutorFoto();
			alternativa = scanner.nextInt();

			if (alternativa == 1) {

				proxima();

			} else if (alternativa == 2) {

				anterior();

			} else if (alternativa == 3) {

				System.out.println("Escolhar uma da opções desejadas!");
				listarFotos();
				String selecionar = scanner.next();
				String mensagem = selecionarfoto(selecionar);
				System.out.println(mensagem);

			} else if (alternativa == 4) {

				System.out.println("Para remover a foto selecione a opção desejada!");
				listarFotos();
				String selecionar = scanner.next();
				String mensagem = removerFoto(selecionar);
				System.out.println(mensagem);

			}

			System.out.println("Para sair digite 3!");
			alternativa = scanner.nextInt();

			if (alternativa == 3)
				TelaPrincipal();

		} else if (alternativa == 4) {

			// Funcionalidade do Reprodutor de Video
			opcaoMensagemReprodutorVideo();
			alternativa = scanner.nextInt();

			if (alternativa == 1) {

				proxima();

			} else if (alternativa == 2) {

				anterior();

			} else if (alternativa == 3) {

				System.out.println("Escolhar uma da opções desejadas!");
				listarVideos();
				String selecionar = scanner.next();
				String mensagem = selecionarVideo(selecionar);
				System.out.println(mensagem);

			} else if (alternativa == 4) {

				System.out.println("Para remover o video selecione a opção desejada!");
				listarVideos();
				String selecionar = scanner.next();
				String mensagem = removerVideo(selecionar);
				System.out.println(mensagem);

			}

			System.out.println("Para sair digite 3!");
			alternativa = scanner.nextInt();

			if (alternativa == 3)
				TelaPrincipal();

		} else if (alternativa == 5) {

			// Funcionalidade do Navegador de Internet
			opcaoMensagemNavegadorInternet();
			alternativa = scanner.nextInt();

			if (alternativa == 1) {

				System.out.println("Digite o endereço de url, para navegar na internet!");
				String enderecoUrl = scanner.next();
				String mensagem = exibirPagina(enderecoUrl);
				System.out.println(mensagem);

			} else if (alternativa == 2) {

				adicionarNovaAba();

			} else if (alternativa == 3) {

				atualizarPagina();

			} else if (alternativa == 4) {

				System.out.println("Para remover a aba selecione a opção desejada!");
				listarAbas();
				String selecionar = scanner.next();
				String mensagem = removerAba(selecionar);
				System.out.println(mensagem);

			}

			System.out.println("Para sair digite 3!");
			alternativa = scanner.nextInt();

			if (alternativa == 3)
				TelaPrincipal();

		} else if (alternativa == 6) {

			// Funcionalidade de Sms
			opcaoMensagemSms();
			alternativa = scanner.nextInt();

			if (alternativa == 1) {

				enviarSms();

			} else if (alternativa == 2) {

				receberSms();

				System.out.println("Para sair digite 3!");
				alternativa = scanner.nextInt();

				if (alternativa == 3)
					TelaPrincipal();
			}

		} else if (alternativa == 7) {

			// Funcionalidade de Email
			opcaoMensagemEmail();
			alternativa = scanner.nextInt();

			if (alternativa == 1) {

				enviarEmail();

			} else if (alternativa == 2) {

				receberEmail();

				System.out.println("Para sair digite 3!");
				alternativa = scanner.nextInt();

				if (alternativa == 3)
					TelaPrincipal();

			}

		} else if (alternativa == 8) {

			// Funcionalidade da Bateria
			opcaoMensagemBateria();
			alternativa = scanner.nextInt();

			if (alternativa == 1)
				nivelBateria();
			else if (alternativa == 2)
				carregar();

			System.out.println("Para sair digite 3!");
			alternativa = scanner.nextInt();

			if (alternativa == 3)
				TelaPrincipal();

		} else if (alternativa == 9) {

			// Funcionalidade da Camera
			opcaoMensagemCamera();
			alternativa = scanner.nextInt();

			if (alternativa == 1)
				ligarCamera();
			else if (alternativa == 2)
				tirarFoto();
			else if (alternativa == 3)
				criarVideo();
			else if (alternativa == 4)
				desligarCamera();

			System.out.println("Para sair digite 3!");
			alternativa = scanner.nextInt();

			if (alternativa == 3)
				TelaPrincipal();

		} else if (alternativa == 10) {

			// Funcionalidade do Calendario
			opcaoMensagemCalendario();
			alternativa = scanner.nextInt();

			if (alternativa == 1)
				obterData();

			System.out.println("Para sair digite 3!");
			alternativa = scanner.nextInt();

			if (alternativa == 3)
				TelaPrincipal();

		} else if (alternativa == 0) {

			Aparelho.TelaInicial();

		}

	}

	private void configuracoesIphone() {

		configuracoes();
		System.out.println("Para voltar a tela inicial digite 0!");
		int alternativa = scanner.nextInt();

		if (alternativa == 0)
			TelaPrincipal();
	}

	private void desligarIphone() {

		System.out.println("Para desligar digite 1, para reiniciar 2, e para cancelar 3!");
		alternativa = scanner.nextInt();

		if (alternativa == 1) {

			mensagemDesligarIphone();

			System.out.println("Para ligar o iPhone novamente digite 2, ou para ignorar 3!");
			alternativa = scanner.nextInt();
			validacaoDesligarIphone = true;

			if (alternativa == 2) {

				mensagemLigarIphone();
				Aparelho.TelaInicial();

			}

		} else if (alternativa == 2) {

			mensagemReiniciarIphone();
			Aparelho.TelaInicial();

		} else if (alternativa == 3) {

			TelaPrincipal();
		}
	}

	private void ligarIphone() {

		if (validacaoLigarIphone == true) {

			mensagemLigarIphone();
			TelaPrincipal();

		} else {

			System.out.println("O iPhone já esta ligado, escolha outra opção!");

		}

	}
	// ----------------------------------------------------------------------------------//

	@Override
	public void tocar() {

		System.out.println("Tocando a musica!");

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

		System.out.println("Wifi esta ativo!");
	}

	@Override
	public void bluetooth() {

		System.out.println("Bluetooth esta ativo!");

	}

	@Override
	public void dadosMovel() {

		System.out.println("Dados Movel esta ativo!");

	}

	@Override
	public String removerAba(String aba) {

		aba = "Aba removida!";
		return aba;

	}

	@Override
	public String removerFoto(String foto) {

		foto = "Foto removida!";
		return foto;
	}

}
