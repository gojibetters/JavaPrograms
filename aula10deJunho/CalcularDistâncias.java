package aula10deJunho;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class CalcularDist�ncias {

	public static void main(String[] args) {
		
		double gravidade = 9.8, anguloRadianos, dist�ncia, velocidade, anguloLancamentoGraus;
		
		Scanner tcd = new Scanner(System.in);
		
		try {
		System.out.println("Digite o valor do �ngulo de lan�amento: ");
		anguloLancamentoGraus = tcd.nextDouble();
		
		System.out.println("Digite a velocidade: ");
		velocidade = tcd.nextDouble();
		
		anguloRadianos = anguloLancamentoGraus * Math.PI / 180;
		
		dist�ncia = Math.pow(velocidade, 2) * 2 * Math.sin(anguloRadianos) * Math.cos(anguloRadianos) / gravidade ;
		
		NumberFormat nf = new DecimalFormat ("#,##0.00");
		
		System.out.println("Dist�cia " + nf.format(dist�ncia) + " metros");
		} catch (Exception e) {
			System.out.println("Falha :" + e.getMessage());
		}
		
	}
	
}
