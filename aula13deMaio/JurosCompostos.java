package aula13deMaio;

public class JurosCompostos {

	
public static void main(String[] args) {
		
		double p, t, r, n, valorfinal;

		p = 2000;
		t = 5;
		r = 0.08;
		n = 12;
		
		valorfinal = p * Math.pow(1 + (r/n), n*t);
		
		System.out.println("O valor após " + t + " " + "anos : " + valorfinal);
	
		double juroscalculado = valorfinal - p;
		System.out.println("Juros compostos : " + juroscalculado);
		
		
	}

}
