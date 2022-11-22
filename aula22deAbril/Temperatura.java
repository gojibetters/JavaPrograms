package aula22deAbril;

import java.util.Scanner;

public class Temperatura {

public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		
		try {
			System.out.println("Digite a temperatura em graus Celsius\n");
			
			double cel = -275.15;
			
			while ( cel <= -273.15) {
				System.out.println("Lembre-se a temperatura inicial � -273.15");
				cel = tcd.nextDouble();	
			}
			// F�rmula (x �C * 9/5) + 32
			
			double fah = (cel * 9/5) + 32;
			
			System.out.println(cel + "�C � igual a " + fah + "�F");
			
		} catch (Exception e) {
			System.out.println("Falha " + e.getMessage() );
		}
		
	}

}
