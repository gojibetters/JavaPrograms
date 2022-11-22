package Aula27deMaio;

public class MaiorTrêsNúmeros {

	public static void main(String[] args) {
		
		int num1 = 100, num2 = 10, num3 = 7;
		System.out.println("Os números são " + num1 +  ", " + num2 + " e " + num3);
		
		if ( num1 >= num2 && num1 >= num3) {
			System.out.println("O maior número é : " + num1);
		} else if ( num2 >= num1 && num2 >= num3) {
			System.out.println("O maior número é : " + num2);
		} else {
			System.out.println("O maior número é : " + num3);
		}
		
		
	}
	
	
}
