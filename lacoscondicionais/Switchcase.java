package lacoscondicionais;

import java.util.Scanner;

public class Switchcase {
	
	public static void main(String[] args) {
		
		int opcao;
		Scanner leia = new Scanner (System.in);
		
		
		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
        System.out.println("\n--Digite 1 para ver Indicação de um Livro--");
        System.out.println("--Digite 2 para ler uma Frase Motivacional--");
        System.out.println("--Digite 3 para receber uma Indicação de música--");
        
        opcao = leia.nextInt();
        
        switch (opcao) {
        
        case 1:
        	System.out.println("Indicação de filme: Senhor dos Anéis");
        	break;
        
        case 2: 
        	System.out.println(" Frase Motivacional: Não desista do curso da Generation");
        	break;
        	
        case 3:
        	System.out.println("Indicação de Música: Metálica");
        	break;
        	
        	default:
        		System.out.println("Opção inválida");
        		break;
        		
        }
		
	}

}