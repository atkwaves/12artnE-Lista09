package Lista09;

import java.util.Scanner;

public class exec12 {
	
//	Faça um algoritmo que leia o nome e idade de 5 pessoas, e mostre o nome da pessoa mais velha.

	public static void main(String[] args) {

		String nome, nomeMaisVelho = "";
		int idade, maiorIdade = 0;

		Scanner ler = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("Nome: ");
			nome = ler.next();
			System.out.println("Idade: ");
			idade = ler.nextInt();

			if (i == 0) {
				maiorIdade = idade;
				nomeMaisVelho = nome;
			}

			if (idade > maiorIdade) {
				maiorIdade = idade;
				nomeMaisVelho = nome;
			}

		}

		System.out.println("O Mais velho é: " + nomeMaisVelho + " idade " + maiorIdade);

	}
}
