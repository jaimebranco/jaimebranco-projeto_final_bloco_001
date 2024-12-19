package projeto_final_bloco_01;

import java.util.Scanner;

public class MenuPrincipal {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opcao,  ano; 
		String nome, editora, autor;
		
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
			System.out.println("            5 - Empréstimo                           ");
			System.out.println("            6 - Devolução                            ");
			System.out.println("            7 - Sair                                 ");
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
				
				System.out.println("Digite o autor do livro - " + nome + " : ");
				autor = leia.nextLine();
				System.out.println("Digite a editora:");
				editora = leia.nextLine();
				System.out.println("Digite o ano de publicação:");
				ano = leia.nextInt();
				
				System.out.println("Livro Adicionado com sucesso");
				
				break;
			case 2:
				System.out.println("            QUAL LIVRO DESEJA EXCLUIR?           ");
				
				
				break;
			case 3:
				System.out.println("            LISTA DE TODOS OS LIVROS             ");
				
				break;
			case 4:
				System.out.println("               CONSULTA DE LIVROS                ");
				
				break;
			case 5:
				System.out.println("              EMPRÉSTIMO DE LIVROS               ");
				
				break;
			case 6: 
				System.out.println("                  DEVOLUÇÃO                      ");
				
				break;	
				
			default:
				System.out.println("             *** opção inválida ***              ");
				System.out.println("                 Digite novamente                ");
				break;
			}

		}

	}
}