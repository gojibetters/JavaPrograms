package aula20deMaio;

import java.util.Scanner;

public class Área_do_Quadrado {

	public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		
		System.out.println("Digite o valor do lado do quadrado : ");
		int lado = tcd.nextInt();	
		
		/*valores inteiros somente
		para mudar para decimal utilizar double
		*/
		
		int área = lado * lado;
		
		System.out.println("O valor da área do quadrado é : " + área + "m²");
		
	}
	
}
