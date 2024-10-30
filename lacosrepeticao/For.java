package lacosrepeticao;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {

		// TABUADA//

		int x, i, result;
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite qual tabuada você gostaria de saber: ");
		x = ler.nextInt();

		for (i = 0; i <= 10; i++) {
			result = x * i;
			System.out.println(x + " * " + i + " = " + result);
		}

	}

}
