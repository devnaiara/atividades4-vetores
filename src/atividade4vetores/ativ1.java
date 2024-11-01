package atividade4vetores;

import java.util.Arrays;
import java.util.Scanner;

public class ativ1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int vetorInteiros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		
		String continuar = "s";
        
		while (continuar.equalsIgnoreCase("s")) {
	        System.out.println("Digite o número que você deseja encontrar: ");
	        
	    while (!scanner.hasNextInt()) {
	        System.out.println("Por favor digite apenas número: ");
	        scanner.next();
	    }
	    
	    int numeroDigitado = scanner.nextInt();
	    
	    boolean encontrado = false;
	    
	    for (int i = 0; i < vetorInteiros.length; i++) {
	    	if (vetorInteiros[i] == numeroDigitado) {
		       System.out.println("O número "+ numeroDigitado + " está localizado na posição: " + i);
		      encontrado = true;
		      break;
	    	}
	    }
	    if (!encontrado) {
	    	System.out.println("O número " + numeroDigitado + " não foi encontrado!");
	    	
	    	}
	    
    	System.out.println("Deseja continuar? S/N");
    	continuar = scanner.next();
    	
		}
		scanner.close();
	}
}
