package Aula27deMaio;

public class MaiorTr�sN�meros {

	public static void main(String[] args) {
		
		int num1 = 100, num2 = 10, num3 = 7;
		System.out.println("Os n�meros s�o " + num1 +  ", " + num2 + " e " + num3);
		
		if ( num1 >= num2 && num1 >= num3) {
			System.out.println("O maior n�mero � : " + num1);
		} else if ( num2 >= num1 && num2 >= num3) {
			System.out.println("O maior n�mero � : " + num2);
		} else {
			System.out.println("O maior n�mero � : " + num3);
		}
		
		
	}
	
	
}
