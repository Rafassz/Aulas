package lacoscondicionais;

import java.util.Scanner;

public class IfEncadeado {
	
	public static void main(String[] args) {
		
		float nota1, nota2, media;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite o valor da 1ª Nota");
		nota1 = ler.nextFloat();
		
		System.out.println("Digite o valor da 2ª Nota");
		nota2 = ler.nextFloat();
		
		media = (nota1 + nota2)/2;
		
		if(media >= 6 ) {
			System.out.println("Parabéns você foi aprovado!! Sua média é :" + media );
		
		}else if(media >= 5) {
				System.out.println("Você ficou de recuperação!");
				
			
		} else {
			System.out.println("Reprovado, estude mais!! Sua média é: " + media );
				
		}
		ler.close();
	}

}
