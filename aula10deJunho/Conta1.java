package aula10deJunho;

import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Conta1 {
	
	public static void main(String[] args) {
		
		System.out.println("Algoritmo para calcular o valor da sua comida");
		
		try {
		
		double ham, che, fri, ref, mil = 0;
		String strHam, strChe, strFri, strRef, strMil;
		
		strHam = JOptionPane.showInputDialog("Digite quantos hamb�rgueres voc� comeu: ");
		ham = Double.parseDouble(strHam);
		
		strChe = JOptionPane.showInputDialog("Digite quantos cheeseburgs voc� comeu: ");
		che = Double.parseDouble(strChe);
		
		strFri = JOptionPane.showInputDialog("Digite quantas fritas voc� comeu: ");
		fri = Double.parseDouble(strFri);
		
		strRef = JOptionPane.showInputDialog("Digite quantos refrigerantes voc� bebeu: ");
		ref = Double.parseDouble(strRef);
		
		strMil = JOptionPane.showInputDialog("Digite quantos milkshakes voc� bebeu: ");
		mil = Double.parseDouble(strMil);
		
		double valorConta = 0;
		
		valorConta= (ham*3) + (che*2.5)+ (fri*2.5) + (ref*1) + (mil*3);
		
		NumberFormat nf = new DecimalFormat("#,##0.00");
		
		JOptionPane.showInputDialog(null, "O valor total � de : " + nf.format(valorConta));
		
		} catch (Exception e) {
			JOptionPane.showInputDialog("Falha : " + e.getLocalizedMessage() + ", coloque n�meros.");
		}
		}
	}

