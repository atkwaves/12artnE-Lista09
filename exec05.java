package Lista09;

import java.util.Scanner;

public class exec05 {
	
//	Crie um algoritmo que recebe um intervalo de números (por exemplo: de 20 até 50 - obviamente que o usuário irá informar o
//	intervalo). O programa deverá descobrir quais são os números primos e mostra-los na tela. Considere o intervalo como sendo um
//	intervalo fechado (inclui os limites).

	public static void main(String[] args) {

		int iniIntervalo;
		int fimIntervalo;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o Inicio do Intervalo: ");
		iniIntervalo = entrada.nextInt();

		System.out.println("Informe o final do Intervalo: ");
		fimIntervalo = entrada.nextInt();

		for (int numEmTeste = iniIntervalo; numEmTeste <= fimIntervalo; numEmTeste++) {

			boolean naoEhPrimo = false;
			for (int j = 2; j < numEmTeste; j++) {
				int resto;

				resto = numEmTeste % j; // calculo do resto da divisao
				if (resto == 0) {
					naoEhPrimo = true;
					// i = j
					break;
				}
			}
			if (naoEhPrimo == false) {
				System.out.println("--> i : " + numEmTeste);
			}
		}
		entrada.close();
	}
}
