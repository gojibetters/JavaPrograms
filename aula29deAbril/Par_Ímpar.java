package aula29deAbril;

import java.util.Scanner;

public class Par_�mpar {
	
	public static void main(String[] args) {
		Scanner tcd = new Scanner(System.in);
				
			try {
				
				System.out.println("Digite o n�mero para descobrir se � par ou �mpar: ");
				int numero;
				numero = tcd.nextInt();
				
				if ( numero % 2 == 0 ) {
					System.out.println("PAR");
				} else { 
					System.out.println("�MPAR");
				}
				
				
			} catch (Exception e) {
				System.out.println("Falha: " + e.getMessage() );
			}
				
	}
	
}
