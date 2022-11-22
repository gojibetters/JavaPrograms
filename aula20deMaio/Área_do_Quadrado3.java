package aula20deMaio;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Área_do_Quadrado3 {

	public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		
		try {
			
			System.out.println("Digite o valor do lado do quadrado : ");
			int lado = tcd.nextInt();
			
			int área = lado * lado;
			
			NumberFormat nf = new DecimalFormat("#,###0.0");
			
			System.out.println("A área do quadrado é : " + nf.format(área) + "m²");
			
		} catch (Exception e) {
			System.out.println("Falha : " + e.getMessage());
			
		}

	}
	
}
