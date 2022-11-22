package Aula27deMaio;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class MaiorTrêsNúmeros2 {

	

public static void main(String[] args) {
		
	 Scanner tcd = new Scanner (System.in);
     
	 	 try {
   
	 	 String Num1, Num2, Num3;	 
	 		 
         double num1, num2, num3;
         
         Num1 = JOptionPane.showInputDialog("Digite o numero 1");
         num1 = Double.parseDouble(Num1);
         
         Num2 = JOptionPane.showInputDialog("Digite o numero 2");
         num2 = Double.parseDouble(Num2);
         
         Num3 = JOptionPane.showInputDialog("Digite o numero 3");
         num3 = Double.parseDouble(Num3);
         
         if ( num1 >= num2 && num1 >= num3) {
             JOptionPane.showMessageDialog(null, "O maior número é : " + num1);
         } else if ( num2 >= num1 && num2 >= num3) {
             JOptionPane.showMessageDialog(null, "O maior número é : " + num2);
         } else {
             JOptionPane.showMessageDialog(null, "O maior número é : " + num3);
         }
     
         
         
	 	 } catch (Exception e) {
         javax.swing.JOptionPane.showMessageDialog(null, "Falha " + e.getMessage());
	 	 }
		
	}
}