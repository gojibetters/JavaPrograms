package aula15deAbril;

import java.text.DecimalFormat;
import java.util.Scanner;

//utilizando o Scanner e o DecimalFormat, mudando os valores atrav�s das vari�veis

public class C�lculodeRa�zes_2 {

	
public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		
		double  a, b, c, delta;
		
		try {
			System.out.println("Digite o valor do coeficiente A ");
			a = 0;
			while ( a == 0) {
				a = tcd.nextDouble();
			}
			
			System.out.println("Digite o valor do coeficiente B ");
			b = tcd.nextDouble();
			
			System.out.println("Digite o valor do coeficiente C");
			c = tcd.nextDouble();
			
			delta = Math.pow(b, 2) - 4 * a * c;
			System.out.println("O valor calculado de delta  " + delta);
			
			if( delta < 0) {
				System.out.println("N�o existe ra�z real");
			} else {
				double x1 = ( ( b * -1) + Math.sqrt(delta) ) / ( 2 * a);
				double x2 = ( ( b * -1) - Math.sqrt(delta) ) / ( 2 * a);
				
				DecimalFormat df = new DecimalFormat("0.000");
				
				System.out.println("1� ra�z		" + df.format(x1) );
				
				System.out.println("2� ra�z		" + df.format(x2) );
				
			
				
			}
			
			
		} catch (Exception e) {
			System.out.println(  "Falha:  "   +  e.getMessage());
		}
				
			
	}

}
