package Lista09;

import java.util.Scanner;

public class exec02 {
	
//	Crie um algoritmo para calcular a velocidade média de diversos automóveis sendo fornecida a distância total percorrida, a
//	hora de saída e a hora de chegada.

	public static void main(String[] args) {

		double distanciaTotal;
		int horaSaida;
		int minutoSaida;
		int horaChegada;
		int minutoChegada;

		double horaSaidaTotal;
		double horaChegadaTotal;

		double velocidadeMedia;
		String continua = "S";

		Scanner entrada = new Scanner(System.in);

		while (continua.equals("S")) {
			System.out.println("Informe a distancia total percorrida: ");
			distanciaTotal = entrada.nextDouble();

			System.out.println("Hora Saída: ");
			horaSaida = entrada.nextInt();

			System.out.println("Minuto Saída: ");
			minutoSaida = entrada.nextInt();

			System.out.println("Hora Chegada: ");
			horaChegada = entrada.nextInt();

			System.out.println("Minuto Chegada: ");
			minutoChegada = entrada.nextInt();

			horaSaidaTotal = horaSaida + (minutoSaida / 60d);

			horaChegadaTotal = horaChegada + (minutoChegada / 60d);

			if (horaChegadaTotal > horaSaidaTotal) {
				// a corrida iniciou e terminou no mesmo dia
				velocidadeMedia = distanciaTotal / (horaChegadaTotal - horaSaidaTotal);
			} else {
				// a corrida iniciou num dia er terminou no outro
				double deltaTempoSaida = 24 - horaSaidaTotal;
				velocidadeMedia = distanciaTotal / (horaChegadaTotal + deltaTempoSaida);
			}

			System.out.println("Velocidade Média: " + velocidadeMedia + "Km/h");

			System.out.println("Deseja continuar 'S'im ou 'N'ão");
			continua = entrada.next();
		}

		System.out.println("Programa Encerrado");
		
		entrada.close();
	}
}
