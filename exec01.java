package Lista09;

import java.util.Scanner;

public class exec01 {
	
//	Crie um algoritmo para determinar o consumo m�dio de diversos auutom�veis sendo fornecido a dist�ncia total percorrida
//	pelo autom�vel e o total de combust�vel gasto.

	public static void main(String[] args) {

		double distanciaTotal;
		double consumoTotal;
		double consumoMedio;
		String continua = "S";

		Scanner entrada = new Scanner(System.in);

		while (continua.equalsIgnoreCase("S")) {

			System.out.println("Informe a dist�ncia percorrida: ");
			distanciaTotal = entrada.nextDouble();

			System.out.println("Informe o consumo total: ");
			consumoTotal = entrada.nextDouble();

			consumoMedio = distanciaTotal / consumoTotal;

			System.out.println("O consumo m�dio do ve�culo �: " + consumoMedio + "KM/L");

			System.out.println("Deseja continuar 'S'im ou 'N'�o");
			continua = entrada.next();
		}

		System.out.println("Programa Encerrado");

		entrada.close();
	}

}
