package Lista09;

import java.util.Scanner;

public class exec06 {

//	Crie um programa que leia os dados de diversas pessoas (nome, sexo, idade e sa�de) e informar se est� apta ou n�o para cumprir
//	o servi�o militar obrigat�rio. Ao final informe os totais.

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

			System.out.println("Estado de Sa�de: 'apto' ou 'inapto'");
			estadoSaude = ler.next();

			if (genero.equals("M")) {
				if (idade == 18) {
					if (estadoSaude.equals("apto")) {
						System.out.println("Nome : " + nome + " Apto ao servi�o militar obrigat�rio");
						contApto++;
					} else {
						System.out.println("Dispensado do Servi�o Militar Obrigat�rio, por estado de Sa�de");
						contInapto++;
					}
				} else {
					System.out.println("Dispensado do Servi�o Militar Obrigat�rio, por idade");
					contInapto++;
				}

			} else {
				System.out.println("Dispensado do Servi�o Militar Obrigat�rio, por genero");
				contInapto++;
			}

			System.out.println("Deseja continuar 'S'im ou 'N'�o");
			continua = ler.next();
		}

		System.out.println("Quantidade de candidatos aptos:   " + contApto);
		System.out.println("Quantidade de candidatos Inaptos: " + contInapto);
		System.out.println("Programa Encerrado");

	}
}
