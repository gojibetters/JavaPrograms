package aula29deAbril;

import java.util.Scanner;

public class Par_Ímpar {
	
	public static void main(String[] args) {
		Scanner tcd = new Scanner(System.in);
				
			try {
				
				System.out.println("Digite o número para descobrir se é par ou ímpar: ");
				int numero;
				numero = tcd.nextInt();
				
				if ( numero % 2 == 0 ) {
					System.out.println("PAR");
				} else { 
					System.out.println("ÍMPAR");
				}
				
				
			} catch (Exception e) {
				System.out.println("Falha: " + e.getMessage() );
			}
				
	}
	
}
