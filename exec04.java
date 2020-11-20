package Lista09;

public class exec04 {

//	Crie um algoritmo para contar de 0 até 100.
	
	public static void main(String[] args) {

		for (int i = 0; i < 101; i++) {
			System.out.println("i : " + i);
		}

		// ---------------------------------
		int i = 0;
		while (i < 101) {
			System.out.println("i : " + i);
			i++;
		}

		// ----------------------------------
		int j = 220;
		do {
			System.out.println("j : " + j);
			j++;
		} while (j < 101);

	}
}
