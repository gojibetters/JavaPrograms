package aula10deJunho;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class CalcularDistâncias {

	public static void main(String[] args) {
		
		double gravidade = 9.8, anguloRadianos, distância, velocidade, anguloLancamentoGraus;
		
		Scanner tcd = new Scanner(System.in);
		
		try {
		System.out.println("Digite o valor do ângulo de lançamento: ");
		anguloLancamentoGraus = tcd.nextDouble();
		
		System.out.println("Digite a velocidade: ");
		velocidade = tcd.nextDouble();
		
		anguloRadianos = anguloLancamentoGraus * Math.PI / 180;
		
		distância = Math.pow(velocidade, 2) * 2 * Math.sin(anguloRadianos) * Math.cos(anguloRadianos) / gravidade ;
		
		NumberFormat nf = new DecimalFormat ("#,##0.00");
		
		System.out.println("Distâcia " + nf.format(distância) + " metros");
		} catch (Exception e) {
			System.out.println("Falha :" + e.getMessage());
		}
		
	}
	
}
