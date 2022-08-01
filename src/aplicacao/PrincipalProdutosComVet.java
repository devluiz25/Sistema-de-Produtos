package aplicacao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.ProdutosComVet;

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

			ProdutosComVet[] vetProd = new ProdutosComVet[qtd];

			for (int i = 0; i < qtd; i++) {
				System.out
						.println("----------------------------------------------------------------------------------");
				System.out.println("*** INFORMAÇÕES DO PRODUTO ***");
				System.out.print("INFORME O CODIGO DO " + (i + 1) + "º PRODUTO: ");
				int codProd = sc.nextInt();
				while (codProd == i) {
					System.out.print("CODIGO DO PRODUTO JA EXISTE, INFORME OUTRO CODIGO: ");
					codProd = sc.nextInt();
				}
				System.out.print("INFORME O NOME DO " + (i + 1) + "º PRODUTO: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("INFORME A QUANTIDADE EM ESTOQUE DO " + (i + 1) + "º PRODUTO: ");
				int quantidade = sc.nextInt();
				System.out.print("INFORME O PREÇO DO " + (i + 1) + "º PRODUTO: ");
				double precoProd = sc.nextDouble();

				vetProd[i] = new ProdutosComVet(codProd, nome, quantidade, precoProd);

			}
			System.out.println();
			for (ProdutosComVet prod : vetProd) {
				System.out.println(prod.exibirInformacao());
			}

			for (int i = 0; i < qtd; i++) {
				System.out
						.println("----------------------------------------------------------------------------------");
				System.out.println("*** ATUALIZAÇÃO DOS PRODUTOS ADICIONADOS AO ESTOQUE ***");
				System.out.print("INFORME A QUANTIDADE A SER ADICIONADA NO ESTOQUE DO " + (i + 1) + "º PRODUTO: ");
				int qtdAdc = sc.nextInt();

				vetProd[i].inserirProdutos(qtdAdc);

				System.out.println();
				System.out.println(vetProd[i].exibirInformacao());
			}

			for (int i = 0; i < qtd; i++) {
				System.out
						.println("----------------------------------------------------------------------------------");
				System.out.println("*** ATUALIZAÇÃO DOS PRODUTOS REMOVIDOS DO ESTOQUE ***");
				System.out.print("INFORME A QAUNTIDADE A SER REMOVIDA NO ESTOQUE DO " + (i + 1) + "º PRODUTO: ");
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
		System.out.println("*** OBRIGADO POR UTILIZAR NOSSOS SERVIÇOS, VOLTE SEMPRE ***");

		System.out.println();
		System.out.println("LIMOEIRO, " + sdf1.format(d1));

		sc.close();
	}

}
