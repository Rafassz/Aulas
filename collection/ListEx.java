package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx {

	public static void main(String[] args) {

		// Cria a Collection ArrayList, do tipo Double,chamada notas//

		ArrayList<Double> notas = new ArrayList<Double>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		notas.add(scanner.nextDouble());

		notas.add(7.0);
		notas.add(4.0);
		notas.add(5.0);
		notas.add(10.0);
		notas.add(4.0);

		System.out.println("\nNotas cadastradas - Laços for. . . Each");

		for (Double nota : notas) {
			System.out.println(notas);
		}

		notas.add(10.5);

		System.out.println(notas);

		System.out.println("\nA nota 5 existe na lista? " + notas.contains(5d));

		System.out.println("\nA posição da nota 5 é: " + notas.indexOf(5.0));

	}
}
