package aula20deMaio;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class �rea_do_Quadrado3 {

	public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		
		try {
			
			System.out.println("Digite o valor do lado do quadrado : ");
			int lado = tcd.nextInt();
			
			int �rea = lado * lado;
			
			NumberFormat nf = new DecimalFormat("#,###0.0");
			
			System.out.println("A �rea do quadrado � : " + nf.format(�rea) + "m�");
			
		} catch (Exception e) {
			System.out.println("Falha : " + e.getMessage());
			
		}

	}
	
}
