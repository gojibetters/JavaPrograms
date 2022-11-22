package aula13deMaio;

import java.util.Scanner;

public class JurosSimples_aula13deMaio {

public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		
		float p, r, t, juroscalculado;
		
		System.out.println("Digite o valor principal : ");
		p = tcd.nextFloat();
		
		System.out.println("Digite o valor do juros : ");
		r = tcd.nextFloat();
		
		System.out.println("Digite o valor do período : ");
		t = tcd.nextFloat();
		
		juroscalculado = ( p * r * t ) / 100;
		
		System.out.println("Valor do juros calculado : " + juroscalculado);
		
		System.out.println("Valor do juros acrescido : " + (p+juroscalculado));
		
	}
	
}
