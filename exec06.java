package Lista09;

import java.util.Scanner;

public class exec06 {

//	Crie um programa que leia os dados de diversas pessoas (nome, sexo, idade e saúde) e informar se está apta ou não para cumprir
//	o serviço militar obrigatório. Ao final informe os totais.

	public static void main(String[] args) {

		String nome;
		String genero;
		int idade;
		String estadoSaude;
		int contApto = 0;
		int contInapto = 0;
		String continua = "S";

		Scanner ler = new Scanner(System.in);

		while (continua.equals("S")) {

			System.out.println("Nome: ");
			nome = ler.next();

			System.out.println("'M'asculino ou 'F'eminino: ");
			genero = ler.next();

			System.out.println("Idade: ");
			idade = ler.nextInt();

			System.out.println("Estado de Saúde: 'apto' ou 'inapto'");
			estadoSaude = ler.next();

			if (genero.equals("M")) {
				if (idade == 18) {
					if (estadoSaude.equals("apto")) {
						System.out.println("Nome : " + nome + " Apto ao serviço militar obrigatório");
						contApto++;
					} else {
						System.out.println("Dispensado do Serviço Militar Obrigatório, por estado de Saúde");
						contInapto++;
					}
				} else {
					System.out.println("Dispensado do Serviço Militar Obrigatório, por idade");
					contInapto++;
				}

			} else {
				System.out.println("Dispensado do Serviço Militar Obrigatório, por genero");
				contInapto++;
			}

			System.out.println("Deseja continuar 'S'im ou 'N'ão");
			continua = ler.next();
		}

		System.out.println("Quantidade de candidatos aptos:   " + contApto);
		System.out.println("Quantidade de candidatos Inaptos: " + contInapto);
		System.out.println("Programa Encerrado");

	}
}
