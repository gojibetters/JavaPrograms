package Aula27deMaio;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MaiorTr�sN�meros3 {

	public static void main(String[] args) {
		
		 Scanner tcd = new Scanner (System.in);
	     
	     try {
	   
	         int num1, num2, num3;
	           System.out.println("Digite o numero 1");
	         num1 = tcd.nextInt();
	           System.out.println("Digite o numero 2");
	         num2 = tcd.nextInt();
	           System.out.println("Digite o numero 3");
	         num3 = tcd.nextInt();
	         
	         if ( num1 >= num2 && num1 >= num3) {
	             JOptionPane.showMessageDialog(null, "O maior n�mero � : " + num1);
	         } else if ( num2 >= num1 && num2 >= num3) {
	             JOptionPane.showMessageDialog(null, "O maior n�mero � : " + num2);
	         } else {
	             JOptionPane.showMessageDialog(null, "O maior n�mero � : " + num3);
	         }
	     
	         
	         
	     } catch (Exception e) {
	         javax.swing.JOptionPane.showMessageDialog(null, "Falha " + e.getMessage());
	     }
			
		}
	
}
