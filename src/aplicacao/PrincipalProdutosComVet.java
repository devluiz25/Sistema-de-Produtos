package aplicacao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Produtos;

public class PrincipalProdutosComVet {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d1 = new Date(System.currentTimeMillis());

		char resp;

		do {
			System.out.print("INFORME A SENHA PARA ACESSAR O SISTEMA: ");
			int senha = sc.nextInt();

			int senhaCorreta = 132022;

			while (senha != senhaCorreta) {
				System.out.print("SENHA INCORRETA, INFORME A SENHA: ");
				senha = sc.nextInt();
			}

			System.out
					.println("--------------------------------------------------------------------------------------");
			System.out.println("*** BEM VINDO AO SISTEMA DE PRODUTOS ***");

			System.out.print("INFORME A QUANTIDADE DE PRODUTOS A SER INSERIDOS: ");
			int qtd = sc.nextInt();

			Produtos[] vetProd = new Produtos[qtd];

			for (int i = 0; i < qtd; i++) {
				System.out
						.println("----------------------------------------------------------------------------------");
				System.out.println("*** INFORMA��ES DO PRODUTO ***");
				System.out.print("INFORME O NOME DO " + (i + 1) + "� PRODUTO: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("INFORME A QUANTIDADE EM ESTOQUE DO " + (i + 1) + "� PRODUTO: ");
				int quantidade = sc.nextInt();
				System.out.print("INFORME O PRE�O DO " + (i + 1) + "� PRODUTO: ");
				double precoProd = sc.nextDouble();

				vetProd[i] = new Produtos(nome, quantidade, precoProd);
				System.out.println();
				System.out.println(vetProd[i].exibirInformacao());

			}

			for (int i = 0; i < qtd; i++) {
				System.out
						.println("----------------------------------------------------------------------------------");
				System.out.println("*** ATUALIZA��O DOS PRODUTOS ADICIONADOS AO ESTOQUE ***");
				System.out.print("INFORME A QAUNTIDADE A SER ADICIONADA NO ESTOQUE DO " + (i + 1) + "� PRODUTO: ");
				int qtdAdc = sc.nextInt();

				vetProd[i].inserirProdutos(qtdAdc);

				System.out.println();
				System.out.println(vetProd[i].exibirInformacao());
			}

			for (int i = 0; i < qtd; i++) {
				System.out
						.println("----------------------------------------------------------------------------------");
				System.out.println("*** ATUALIZA��O DOS PRODUTOS REMOVIDOS DO ESTOQUE ***");
				System.out.print("INFORME A QAUNTIDADE A SER REMOVIDA NO ESTOQUE DO " + (i + 1) + "� PRODUTO: ");
				int qtdRem = sc.nextInt();

				vetProd[i].removerProduto(qtdRem);

				System.out.println();
				System.out.println(vetProd[i].exibirInformacao());

			}
			
			System.out.println();
			System.out.print("DESEJA REINICIAR O SISTEMA: ");
			resp = sc.next().charAt(0);
		} while (resp == 's');

		System.out.println();
		System.out.println("*** OBRIGADO POR UTILIZAR NOSSOS SERVI�OS, VOLTE SEMPRE ***");

		System.out.println();
		System.out.println("LIMOEIRO, " + sdf1.format(d1));

		sc.close();
	}

}
