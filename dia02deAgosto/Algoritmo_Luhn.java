package dia02deAgosto;

import java.util.Scanner;

public class Algoritmo_Luhn {

		public static int somaDigitos(int numero) {
			if ( numero < 9) {
				return numero;
			} else {
				return numero%10 + 1;
			}	
	}
		
		public static boolean checkValidade(String numeroCartao) { return true ;}
	
		public static String checkBandeiraCartao (String numero1IdEmissor,
				String numero2IdEmissor) {
			
			return "";
		}
		
		public static void main(String[] args) {
			
			Scanner tcd = new Scanner(System.in);
			String bandeiraCartao = "";
			
			System.out.println("Informe o número do cartão");
			String numeroCartao = tcd.next();
			
			if (numeroCartao.length() >= 13 && numeroCartao.length() <= 16) {
				
				boolean flag = checkValidade(numeroCartao);
				
				if (flag) {
					System.out.println("Cartão válido.");
					bandeiraCartao = checkBandeiraCartao(numeroCartao.substring(0,1),
							numeroCartao.substring(0,2));
					System.out.println("Bandeira " + bandeiraCartao);
				} else {
					System.out.println("");
				}
				
			} else {
			System.out.println("Número de cartão inválido.");
			}
		}

		}

