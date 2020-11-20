package Lista09;

import java.util.Scanner;

public class exec07 {
	
//	Faça um algoritmo que receba os valores de compra e de venda de 20 produtos. Mostre como resultado se houve lucro, prejuízo
//	ou empate para cada produto. Informe o percentual de lucro ou prejuízo.

	public static void main(String[] args) {

		String descricao;
		double valorVenda;
		double valorCompra;
		int qtdVendido;

		double valorDiferenca;
		double diferecaPercentual;
		double valorTotalVenda;

		String statusVenda = "";

		Scanner ler = new Scanner(System.in);

		for (int i = 0; i <= 20; i++) {
			System.out.println("Descrição do Produto: ");
			descricao = ler.next();

			System.out.println("Valor Compra: ");
			valorCompra = ler.nextDouble();

			System.out.println("Valor Venda: ");
			valorVenda = ler.nextDouble();

			System.out.println("Quantidade: ");
			qtdVendido = ler.nextInt();

			// Descobrindo se houve lucro
			if (valorVenda > valorCompra) {
				statusVenda = "Lucro";
			}

			if (valorVenda < valorCompra) {
				statusVenda = "Prejuízo";
			}

			if (valorVenda == valorCompra) {
				statusVenda = "Empate";
			}

			// -------------------------
			/*
			 * if (valorVenda > valorCompra) { statusVenda = "Lucro"; }else { if (valorVenda
			 * < valorCompra) { statusVenda = "Prejuízo"; }else { statusVenda = "Empate"; }
			 * }
			 */

			// ----------------------------

			/*
			 * if (valorVenda > valorCompra) { statusVenda = "Lucro"; }else if (valorVenda <
			 * valorCompra) { statusVenda = "Prejuízo"; }else { statusVenda = "Empate"; }
			 */

			// Calculando a diferença percentual (lucro ou prejuízo)

			valorDiferenca = valorVenda - valorCompra;

			diferecaPercentual = (valorDiferenca * 100) / valorVenda;

			valorTotalVenda = valorVenda * qtdVendido;

			System.out.println("Descricão       : " + descricao);
			System.out.println("Status Venda    : " + statusVenda);
			System.out.println("Valor Compra    : " + valorCompra);
			System.out.println("Valor Venda     : " + valorVenda);
			System.out.println("Diferença %     : " + diferecaPercentual + "%");
			System.out.println("Valor Total     : " + valorTotalVenda);

		}

	}
}
