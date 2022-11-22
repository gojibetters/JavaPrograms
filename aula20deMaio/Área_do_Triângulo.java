package aula20deMaio;

import java.util.Scanner;

public class Área_do_Triângulo {

	public static void main(String[] args) {
		
		try {
			Scanner tcd = new Scanner(System.in);
			
			System.out.println("Digite a altura do triângulo : ");
			double altura = tcd.nextDouble();
			
			System.out.println("Digite a base do triângulo : ");
			double base = tcd.nextDouble();
			
			double área = altura * base / 2;
			System.out.println("A área do triângulo é : " + área);
				
			
		} catch (Exception e) {
			System.out.println("Falha : " + e.getMessage());
			
		}		
	}

	
}
