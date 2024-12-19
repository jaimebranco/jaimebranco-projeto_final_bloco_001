package projeto_final_bloco_01;

import java.util.Scanner;

import controller.OperacoesController;
import livro.model.Livro;

public class MenuPrincipal {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opcao, ano;
		String nome, editora, autor, genero;

		OperacoesController livro = new OperacoesController();

		while (true) {
			System.out.println("                                                     ");
			System.out.println("               SERVIÇO DE EMPRÉSTIMOS                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar livro                      ");
			System.out.println("            2 - Excluir livro                        ");
			System.out.println("            3 - Listar livros                        ");
			System.out.println("            4 - Consultar livro                      ");
			System.out.println("            5 - Sair                                 ");
			System.out.println("                         				             ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("             CADASTRO DE LIVROS                  ");
				System.out.println("                         				         ");
				System.out.println("Digite o nome do livro");
				leia.skip("\\R?");
				nome = leia.nextLine();

				System.out.println("\nDigite a editora do livro : ");
				editora = leia.nextLine();
				System.out.println("\nDigite o nome do autor do livro:");
				autor = leia.nextLine();
				System.out.println("\nDigite o ano de publicação:");
				ano = leia.nextInt();
				System.out.println("\nDigite o gênero do livro:");
				genero = leia.next();
				
				livro.cadastrar(new Livro(nome, editora, autor, ano, genero));

				break;
			case 2:
				System.out.println("            QUAL LIVRO DESEJA EXCLUIR?           ");
			    
			    System.out.println("Qual o nome do livro?");
			    leia.skip("\\R?");
			    nome = leia.nextLine();
			    
			    livro.deletar(nome);
			    break;
				
			case 3:
				System.out.println("            LISTA DE TODOS OS LIVROS             ");
				livro.listarTodas();

				break;
			case 4:
				System.out.println("               CONSULTA DE LIVROS                ");
				System.out.println("Digite o nome do livro:");
                leia.skip("\\R?");
                nome = leia.nextLine();
                
                livro.procurarPorNome(nome);

				break;
			
			default:
				System.out.println("             *** opção inválida ***              ");
				System.out.println("                 Digite novamente                ");
				break;
			}

		}

	}
}