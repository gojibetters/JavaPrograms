package aula31deMarço;

import java.util.Scanner;

public class Conversão_Implicita_Explicita {
	
	public static void main(String args[]) {
		
		//implicita
		//double a = 10.0;
		//int b = a;
		
		//double m = 3;
		//int n =(int)m;
		
		//explicita
		
		double r = Double.parseDouble("153.11");
		
		int x = Integer.parseInt("2");
		
		double k = 55.3;
		String texto = Double.toString(k);
		
		int v = 4;
		String s = Integer.toString(v);
		
	}

}
