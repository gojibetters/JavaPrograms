package aula13deMaio;

import java.util.Scanner;

public class AnoBissexto {

public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		
		int ano = 0;
		
		try {
			
			while (ano < 1800) {
				System.out.println("Digite um valor maior ou igual a 1800 : ");
				ano = tcd.nextInt();
				
			}
			
		} catch (Exception e) {
			
			System.out.println("Falha" + e.getMessage());
			
		}
		 System.out.println("Parabéns");
		
	}
}
