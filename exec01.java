package Lista09;

import java.util.Scanner;

public class exec01 {
	
//	Crie um algoritmo para determinar o consumo médio de diversos auutomóveis sendo fornecido a distância total percorrida
//	pelo automóvel e o total de combustível gasto.

	public static void main(String[] args) {

		double distanciaTotal;
		double consumoTotal;
		double consumoMedio;
		String continua = "S";

		Scanner entrada = new Scanner(System.in);

		while (continua.equalsIgnoreCase("S")) {

			System.out.println("Informe a distância percorrida: ");
			distanciaTotal = entrada.nextDouble();

			System.out.println("Informe o consumo total: ");
			consumoTotal = entrada.nextDouble();

			consumoMedio = distanciaTotal / consumoTotal;

			System.out.println("O consumo médio do veículo é: " + consumoMedio + "KM/L");

			System.out.println("Deseja continuar 'S'im ou 'N'ão");
			continua = entrada.next();
		}

		System.out.println("Programa Encerrado");

		entrada.close();
	}

}
