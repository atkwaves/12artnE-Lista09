package Lista09;

import java.util.Scanner;

public class exec07 {
	
//	Fa�a um algoritmo que receba os valores de compra e de venda de 20 produtos. Mostre como resultado se houve lucro, preju�zo
//	ou empate para cada produto. Informe o percentual de lucro ou preju�zo.

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
			System.out.println("Descri��o do Produto: ");
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
				statusVenda = "Preju�zo";
			}

			if (valorVenda == valorCompra) {
				statusVenda = "Empate";
			}

			// -------------------------
			/*
			 * if (valorVenda > valorCompra) { statusVenda = "Lucro"; }else { if (valorVenda
			 * < valorCompra) { statusVenda = "Preju�zo"; }else { statusVenda = "Empate"; }
			 * }
			 */

			// ----------------------------

			/*
			 * if (valorVenda > valorCompra) { statusVenda = "Lucro"; }else if (valorVenda <
			 * valorCompra) { statusVenda = "Preju�zo"; }else { statusVenda = "Empate"; }
			 */

			// Calculando a diferen�a percentual (lucro ou preju�zo)

			valorDiferenca = valorVenda - valorCompra;

			diferecaPercentual = (valorDiferenca * 100) / valorVenda;

			valorTotalVenda = valorVenda * qtdVendido;

			System.out.println("Descric�o       : " + descricao);
			System.out.println("Status Venda    : " + statusVenda);
			System.out.println("Valor Compra    : " + valorCompra);
			System.out.println("Valor Venda     : " + valorVenda);
			System.out.println("Diferen�a %     : " + diferecaPercentual + "%");
			System.out.println("Valor Total     : " + valorTotalVenda);

		}

	}
}
