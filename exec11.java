package Lista09;

public class exec11 {
	
//	Fa�a um algoritmo que mostre na tela todos os n�meros entre 1 e 100 que sejam m�ltiplos de 3 ou 5.

	public static void main(String[] args) {

		for (int i = 1; i < 101; i++) {

			if ((i % 3) == 0) {
				System.out.println(i + " � multiplo de 3 ");
			}

			if ((i % 5) == 0) {
				System.out.println(i + " � multiplo de 5");
			}

		}

	}
}
