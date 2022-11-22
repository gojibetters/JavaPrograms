package aula15deAbril;

public class CálculodeRaízes {

	
	//sem utilizar o Scanner, mudando os valores direto no programa
		public static void main(String[] args) {
		double a = 1;
		double b = -3;
		double c = 2;
		
		//double delta = b*b - 4 * a * c;
		double delta = Math.pow(b, 2) - 4 * a * c;

		double x1 = ( (b * -1) + Math.sqrt(delta) ) / (2 * a);

		double x2 = ( (b * -1) - Math.sqrt(delta) ) / (2 * a);
		
		System.out.println("O resultado do seu delta é:	" + delta);
		
		System.out.println("O resultado do seu x1 é:	" + x1);
		
		System.out.println("O resultado do seu x2 é:	" + x2);	
		}
		
}
