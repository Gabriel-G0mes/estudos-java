import java.util.Scanner;
import java.util.Locale;

public class Valor_Pecas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int peca1, peca2, QntPeca1, QntPeca2;
		double valor1, valor2, total;
		
		peca1 = sc.nextInt();
		QntPeca1 = sc.nextInt();
		valor1 = sc.nextDouble();
		
		peca2 = sc.nextInt();
		QntPeca2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		total = (QntPeca1 * valor1) + (QntPeca2 * valor2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);
		
		sc.close();
	}
}
