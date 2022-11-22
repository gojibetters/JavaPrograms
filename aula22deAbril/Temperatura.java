package aula22deAbril;

import java.util.Scanner;

public class Temperatura {

public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		
		try {
			System.out.println("Digite a temperatura em graus Celsius\n");
			
			double cel = -275.15;
			
			while ( cel <= -273.15) {
				System.out.println("Lembre-se a temperatura inicial é -273.15");
				cel = tcd.nextDouble();	
			}
			// Fórmula (x °C * 9/5) + 32
			
			double fah = (cel * 9/5) + 32;
			
			System.out.println(cel + "°C é igual a " + fah + "°F");
			
		} catch (Exception e) {
			System.out.println("Falha " + e.getMessage() );
		}
		
	}

}
