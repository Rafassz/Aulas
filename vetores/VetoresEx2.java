package vetores;

import java.util.Arrays;
import java.util.Scanner;

public class VetoresEx2 {

	public static void main(String[] args) {

		int vetorinteiro[] = new int[5];
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < vetorinteiro.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º número: ");
			vetorinteiro[i] = scanner.nextInt();

		}

		for (int i = 0; i < vetorinteiro.length; i++) {
			System.out.println((i + 1) + "º elemento: " + vetorinteiro[i]);
		}
		
		System.out.println("Tamanho do vetor: " + vetorinteiro.length);
		
		Arrays.sort(vetorinteiro);
		
		for (int i = 0; i < vetorinteiro.length; i++) {
			System.out.println((i + 1) + "º elemento: " + vetorinteiro[i]);
		}
	}

}
