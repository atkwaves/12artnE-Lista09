package Lista09;

import java.util.Scanner;

public class exec03 {

//	Crie um algoritmo para testar a idade de v�rias pessoas e determinar se elas podem se aposentar ou n�o. Condi��es:
//	Mulheres -> Podem se aposentar a partir dos 55 anos.
//	Homens -> Podem se aposentar a partir dos 65 anos.

	public static void main(String[] args) {

		int idade;
		String genero;
		String continua = "S";

		Scanner entrada = new Scanner(System.in);

		while (continua.equals("S")) {
			System.out.println("Informe a Idade: ");
			idade = entrada.nextInt();

			System.out.println("Informe 'F'eminino  ou 'M'asculino");
			genero = entrada.next();

			if (genero.equals("F")) {
				if (idade >= 55) {
					System.out.println("Apta a Aposentadoria");
				} else {
					System.out.println("N�o Apta a Aposentadoria");
				}
			} else {
				if (genero.equals("M")) {
					if (idade >= 65) {
						System.out.println("Apto a Aposentadoria");
					} else {
						System.out.println("N�o Apto a Aposentadoria");
					}
				} else {
					System.out.println("Genero inv�lido.");
				}
			}
			System.out.println("Deseja continuar 'S'im ou 'N'�o");
			continua = entrada.next();
		}
		entrada.close();
	}
}
