package Lista09;

import java.util.Scanner;

public class exec10 {
	
//	Fa�a um programa que leia 5 n�meros do teclado, e fa�a uma m�dia dos tr�s n�meros intermedi�rios (quer dizer, despreze o maior
//	e o menor deles).

	public static void main(String[] args) {
		
		int menorNum = 0;
		int maiorNum = 0;
		int num;
		int somaNum = 0;
		double media = 0;

		Scanner ler = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {

			System.out.println("Informe o " + i + " N�mero ");
			num = ler.nextInt();

			if (i == 0) {
				menorNum = num;
				maiorNum = num;
			}

			somaNum = somaNum + num;
			if (num < menorNum) {
				menorNum = num;
			}

			if (num > maiorNum) {
				maiorNum = num;
			}
		}

		somaNum = somaNum - menorNum - maiorNum;
		media = somaNum / 3;

		System.out.println("a m�dia � " + media);

	}
}
