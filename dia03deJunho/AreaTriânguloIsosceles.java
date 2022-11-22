package dia03deJunho;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class AreaTri�nguloIsosceles {

public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		
		try {
			System.out.println("Digite a medida do mesmo lado");
			double lado = tcd.nextDouble();
			System.out.println("Digite a medida da base");
			double base = tcd.nextDouble();
			
			//algoritmo I
			double area = (base/4) * Math.sqrt( (4*lado*lado) - (base*base) );
			System.out.println("A �rea do triangulo isosceles � " + area);
			
			//algoritmo II
			double altura = Math.sqrt( lado*lado - (base/2)*(base/2) );
			double area2 = (base*altura)/2;
			System.out.println("L`aire du triangle isoc�le est: " + area2);
			
			//Exibindo formatado
			NumberFormat nf = new DecimalFormat("#,##0.00");
			System.out.println("Areanet f�r likkorniga triangeln �r " + nf.format(area2));
			
		} catch(Exception e ) {
			System.out.println("Falha :" + e.getMessage());
		}
		
	}
	
}
