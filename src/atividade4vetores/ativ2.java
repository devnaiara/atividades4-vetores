package atividade4vetores;

import java.util.Scanner;

public class ativ2 {
	public static void main(String[] args) {
		
		int vetor[] = new int[10];
		Scanner scanner = new Scanner(System.in);
				
        System.out.println("Digite 10 números inteiros:");
        
        
        for (int i = 0; i < vetor.length; i++) {
        	while (!scanner.hasNextInt()) {
    	        System.out.println("Por favor, digite apenas número: ");
    	        scanner.next();
    	    }
            vetor[i] = scanner.nextInt();
        }
        
        System.out.print("Elementos nos índices ímpares: ");
        for (int i = 1; i < vetor.length; i+=2) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        System.out.print("Elementos pares: ");
        for(int i = 0; i < vetor.length; i++) {
        	if( vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
        	}
        }
        System.out.println();
        int soma = 0;
        
        for(int i = 0; i < vetor.length; i++) {
        	soma = soma + vetor[i];
        }
        System.out.println("Soma: "+soma);
        
        double media = (double) soma / vetor.length;
        
        System.out.printf("Média: %.2f%n",media);
        
        scanner.close();
	}
}
