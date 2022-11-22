package aula1deAbril;

import java.util.Random;
import java.util.Scanner;

public class JogarDado {

	
public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		
		Random rnd = new Random();
		
		//for (int i = 0; i < 6; i++) {
		
			//System.out.println( (i + 1) + "a volta do Professor Marcos");
		//}	
		System.out.println("		***** JOGO DE DADOS *****\n");
		
		try {
			
			int acertos = 0;
			int quantJogos = 0;
			
			boolean res = true;
				
			while (res) {
				
				System.out.println("Qual face você escolhe (1-6)?");
				
				int numero = 0;
				
				while (numero > 6 || numero == 0) {
					System.out.println("Digite 1 ou 2 ou 3 ou 4 ou 5 ou 6 (o dado tem 6 faces)");
					numero = tcd.nextInt();		
				}			
				System.out.println("JOGANDO O DADO...");
				
				quantJogos++;
				
				int dado = rnd.nextInt(6)+1;
				
				if ( numero == dado) {
					System.out.println("You Win!");
					acertos++;
				} else {
					System.out.println("Você perdeu. Mostrando o dado " + dado);
				}
				String qualResposta;
				System.out.println("Você quer continuar jogando? (S ou N)");
				qualResposta = tcd.next();

				if (qualResposta.equals("n") || qualResposta.equals("N")) {
					res = false;
				}
			}		
		System.out.println("A quantidade total de jogos foi		" + quantJogos + "\n");
			System.out.println("Você acertou" + acertos + "\n");
			
				int taxa = (acertos*100/quantJogos*100)/100;
				
				System.out.println("A taxa de sucesso é		" + taxa + "%");
		}		
		 catch (Exception e) {
			System.err.printf("\n Falha : %s" , e.getMessage());
		 }
		 }
}
