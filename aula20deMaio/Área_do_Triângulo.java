package aula20deMaio;

import java.util.Scanner;

public class �rea_do_Tri�ngulo {

	public static void main(String[] args) {
		
		try {
			Scanner tcd = new Scanner(System.in);
			
			System.out.println("Digite a altura do tri�ngulo : ");
			double altura = tcd.nextDouble();
			
			System.out.println("Digite a base do tri�ngulo : ");
			double base = tcd.nextDouble();
			
			double �rea = altura * base / 2;
			System.out.println("A �rea do tri�ngulo � : " + �rea);
				
			
		} catch (Exception e) {
			System.out.println("Falha : " + e.getMessage());
			
		}		
	}

	
}
