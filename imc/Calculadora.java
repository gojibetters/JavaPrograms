package imc;

import java.util.Scanner;

public class Calculadora {
	
	/**
	 * @param args
	 */
	public static void main(String args[]) { 
		
		Scanner tcd = new Scanner(System.in);
		double peso, altura, resultado;
		int idade;
		
		System.out.println("Digite a sua idade");
		idade = tcd.nextInt();
		
		System.out.println("Digite seu peso em kg");
		peso = tcd.nextDouble () ;
		
		System.out.println("Digite altura em cm");
		altura = tcd.nextDouble ();
		
		resultado = peso / ( (altura/100) * (altura/100));
		
		System.out.println("O seu IMC é " + resultado);
		
		
		String mensagem;
		
		if ( idade > 65 ) { 
			if ( resultado >= 27) {
				mensagem = "Sobrepeso para a sua idade";
			} else if ( resultado <= 22) {
				mensagem = "Baixo peso para a sua idade";
			} else {
				mensagem = "Peso adequado";
			}
			
		} else {
			if ( resultado < 18.5) {
				mensagem = "Baixo peso";
			} else if ( resultado <= 24.9 ) {
				mensagem = "Peso normal";
			} else if ( resultado <= 29.9) {
				mensagem = "Excesso de peso";
			} else if ( resultado <= 34.9) {
				mensagem = "Obesidade de Classe 1";
			} else if ( resultado <= 39.9) {
				mensagem = "Obesidade de Classe 2";
			} else {
				mensagem = "Obesidade de Classe 3";
			}
			
		}
		
		System.out.println("Para a sua idade a classificação é: " + mensagem);
		
		
		
		
	}

}
