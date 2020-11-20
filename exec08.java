package Lista09;

import java.util.Scanner;

public class exec08 {

//	Faça um algoritmo que leia um número de 1 a 10 e o escreva por extenso (o usuário digita um número e o programa o escreve
//	por extenso). Caso o usuário digite um número que não esteja neste intervalo, exibir a mensagem "número inválido".
	
	public static void main(String[] args) {

		int num = 0;

		Scanner ler = new Scanner(System.in);

		while (num != -1) {
			System.out.print("Digite um numero entre 1 e 10 :");
			num = ler.nextInt();

			if (num == 1) {
				System.out.println("Um");
			} else if (num == 2) {
				System.out.println("Dois");
			} else if (num == 3) {
				System.out.println("Tres");
			} else if (num == 4) {
				System.out.println("Quatro");
			} else if (num == 5) {
				System.out.println("Cinco");
			} else if (num == 6) {
				System.out.println("Seis");
			} else if (num == 7) {
				System.out.println("Sete");
			} else if (num == 8) {
				System.out.println("Oito");
			} else if (num == 9) {
				System.out.println("Nove");
			} else if (num == 10) {
				System.out.println("Dez");
			}

		}

	}
}
