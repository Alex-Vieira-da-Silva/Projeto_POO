package com.apple.model;

import java.time.LocalDate;
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
	
	private void ligarAparelho() {

		System.out.println("iPhone ligado - Apple Inc...!");
	}

	private void desligarAparelho() {

		System.out.println("iPhone Desligado!");
	}

	private void reiniciarAparelho() {

		System.out.println("iPhone Reiniciado!");
	}

	public void home() {

		System.out.println("----------------------------------------------------------");
		System.out.println("Sejam todo(a) Bem-Vindos ao Mundo Apple, iPhone I !");
		System.out.println("----------------------------------------------------------");
		System.out.println("Digite 1 para fazer ligação!");
		System.out.println("Digite 2 para enviar sms!");
		System.out.println("Digite 3 para enviar e-mail!");
		System.out.println("Digite 4 para acessar os aplicativos!");
		System.out.println("Digite 5 para acessar as informações do iPhone!");
		System.out.println("Digite 6 para desligar o iPhone!");
		System.out.println("Digite 7 para ligar o iPhone!");
		System.out.println("Digite 8 para outras opções!");
		
		Scanner scanner = new Scanner(System.in);
		boolean validacaoLigarIphone = false;
		int opcao = scanner.nextInt();

		try {

			if (opcao == 1) {

				System.out.println("Por favor informe o número com o DDD para fazer a ligação!");
				String numero = scanner.next();
				String mensagem = fazerLigacao(numero);
				System.out.println(mensagem);
				System.out.println(
						"Para ativar o viva voz digite 2, chamada em esperar digite 3, para encerrar a ligação digite 4!");

				int alternativa = scanner.nextInt();

				if (alternativa == 2) {

					vivaVoz();
					System.out.println("Para encerrar a ligação digite 4!");
					alternativa = scanner.nextInt();

					if (alternativa == 4) {

						encerrarLigacao();
						home();

					}

				} else if (alternativa == 3) {

					listarChamadaEsperar();
					System.out.println("Para encerrar a ligação digite 4!");
					alternativa = scanner.nextInt();

					if (alternativa == 4) {

						encerrarLigacao();
						home();

					}

				} else if (alternativa == 4) {

					encerrarLigacao();
					home();
				}

			} else if (opcao == 2) {

				System.out.println("Por favor informe o número com o DDD para enviar o sms!");
				String numero = scanner.next();
				String mensagem = EnviarSms(numero);
				System.out.println(mensagem);
				System.out.println("Para voltar a tela inicial digite 0!");

				int alternativa = scanner.nextInt();

				if (alternativa == 0)
					home();

			} else if (opcao == 3) {

				System.out.println("Por favor informe o endereço de e-mail!");
				String email = scanner.next();
				String mensagem = EnviarEmail(email);
				System.out.println(mensagem);

				System.out.println("Para voltar a tela inicial digite 0!");

				int alternativa = scanner.nextInt();

				if (alternativa == 0)
					home();

			} else if (opcao == 4) {

				System.out.println("----------------Aplicativos---------------");
				System.out.println("Configurações");
				System.out.println("Calculadora");
				System.out.println("Facebook");
				System.out.println("WhatsApp");
				System.out.println("Netflix");
				System.out.println("Reprodutor de Musica");
				System.out.println("Reprodutor de Foto");
				System.out.println("Reprodutor de Video");
				System.out.println("Navegado de Internet");
				System.out.println("Sms");
				System.out.println("Email");
				System.out.println("Bateria");
				System.out.println("Camera");
				System.out.println("Calendario");
				System.out.println("------------------------------------------");
				System.out.println("Para voltar a tela inicial digite 0!");
				
				
				int sair = scanner.nextInt();
				
				if (sair == 0)
					home();

			} else if (opcao == 5) {

				informacoesAparelho();
				System.out.println("Para voltar a tela inicial digite 0!");
				int alternativa = scanner.nextInt();

				if (alternativa == 0)
					home();

			} else if (opcao == 6) {

				System.out.println("Digite 1 para desligar, 2 para reiniciar !");
				int alternativa = scanner.nextInt();

				if (alternativa == 1) {

					desligarAparelho();
					Aparelho.TelaInicial();
					
				} else if (alternativa == 2) {

					reiniciarAparelho();
					Aparelho.TelaInicial();

				}

			} else if (opcao == 7) {

				if(validacaoLigarIphone == true) {
					
					ligarAparelho();
					home();
					
				}else {
					
					System.out.println("O iPhone já esta ligado, escolha outra opção!");
					home();
				}
				

			}else if (opcao == 8) {
				
				Aparelho.TelaInicial();
				
			} else {

				System.out.println("Alternativa inválida, tente novamente!");
				home();
			}

		} catch (Exception e) {

			System.out.println("Ocorreu um erro ao acessar a tela inicial, para reiniciar o iPhone digite 1!");
			int alternativa = scanner.nextInt();

			if (alternativa == 1) {

				reiniciarAparelho();
				Aparelho.TelaInicial();
			}

		} finally {
			scanner.close();
		}

	}

	public void informacoesAparelho() {

		String sistema = "ios";
		String versao = "10";
		String aparelho = "iPhone I";
		String modelo = "4GB";
		String anoFabricacao = "2007";

		System.out.println("-------------Informações do Aparelho-------------");
		System.out.println("Aparelho: " + aparelho);
		System.out.println("Sistema: " + sistema);
		System.out.println("Versão: " + versao);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano de fabricação: " + anoFabricacao);
		System.out.println("-------------------------------------------------");

	}

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

		String selecionar = "Selecionado a musica!";
		return selecionar;
	}

	@Override
	public String removerMusica(String musica) {

		String remover = "Musica removida com sucesso!";
		return remover;
	}

	@Override
	public String exibirPagina(String url) {

		String exibir = "Exibir a página!";
		return exibir;
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

		String selecionar = "Selecionando o video!";
		return selecionar;
	}

	@Override
	public String removerVideo(String video) {

		String remover = "Video removido com sucesso!";
		return remover;
	}

	@Override
	public void proxima() {

		System.out.println("Próxima!");

	}

	@Override
	public void anterior() {

		System.out.println("Anterior!");

	}

	@Override
	public String selecionarfoto(String foto) {

		String selecionar = "Selecionado a foto";
		return selecionar;
	}

	@Override
	public void obterData() {

		LocalDate data = LocalDate.now();
		System.out.println("Data: " + data);

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

		System.out.println("Inicar video!");

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
	public void descarregado() {

		System.out.println("iPhone descarregado!");

	}

	@Override
	public String fazerLigacao(String numero) {

		String ligarIphone = "Ligando para o número: " + numero;
		return ligarIphone;
	}

	@Override
	public void atenderLigacao() {

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
	public String EnviarEmail(String mensagem) {

		String enviar = "E-mail enviado com sucesso!";
		return enviar;
	}

	@Override
	public void receberEmail() {

		System.out.println("E-mail recebido com sucesso!");

	}

	@Override
	public String EnviarSms(String mensagem) {

		String enviar = "SMS enviado com sucesso!";
		return enviar;
	}

	@Override
	public void receberSms() {

		System.out.println("SMS recebido com sucesso!");

	}

	@Override
	public void almentarVolume() {

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

}
