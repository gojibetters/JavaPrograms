package aula20deMaio;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Área_do_Círculo2 {

public static void main(String[] args) {
		
		try {
		
		Scanner tcd = new Scanner(System.in);
		
		
		double raio, area, comprimento;
		
		raio = tcd.nextDouble();
		
		area = Math.PI * raio * raio; //double are1 = Math.PI * Math.pow(raio, 2);
		
		comprimento = 2 * Math.PI * raio; 
		/*double compriment1 = Math.PI * 2 * raio;
		  double compriment2 = raio * Math.PI * 2; 
		*/	
		NumberFormat nf = new DecimalFormat("#,##0.00");
		
		System.out.println("O valor da área é : " + nf.format(area));
		
		System.out.println("O valor do comprimento é : " + nf.format(comprimento));
	
		} catch (Exception e) {
			System.out.println("Falha : " + e.getMessage());
		}
	}
	
	
}
