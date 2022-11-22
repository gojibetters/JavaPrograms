package aula20deMaio;

import java.util.Scanner;


public class Adivinhar_Números {

	public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		int numeroSecreto, numeroDigitado;
		int quantidadeTentativas = 0;
		boolean sinalizadora = false;
		
		numeroSecreto = (int) (Math.random()*100);
		
		try {
			
		
		while (!sinalizadora) {
			quantidadeTentativas++;
			System.out.println("Digite seu palpite de 0 a 99");
			numeroDigitado = tcd.nextInt();
			
			if (numeroDigitado == numeroSecreto) {
				System.out.println("Parabéns, você acertou!");
				sinalizadora = true;
			} else if (numeroDigitado < numeroSecreto) {
				System.out.println("Tente mais alto!");
			} else {
				System.out.println("Tente mais baixo!");
			}
			
		}
		
		} catch (Exception e) {
			System.out.println("Falha : " + e.getMessage());
		}
		System.out.println("Você acertou após " + quantidadeTentativas + " tentativas");
		
	}
	
}
