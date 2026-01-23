import java.util.Scanner;
import java.util.Locale;

public class ValorConta {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int item, quantidade;
		double preco, valorConta;
		
		item = sc.nextInt();
		quantidade = sc.nextInt();
		
		
		if(item == 1) {
			preco = 4.00;
			valorConta = preco * quantidade;
		}
		else if (item == 2) {
			preco = 4.50;
			valorConta = preco * quantidade;
		}
		else if (item == 3) {
			preco = 5.00;
			valorConta = preco * quantidade;
		}
		else if (item == 4) {
			preco = 2.00;
			valorConta = preco * quantidade;
		}
		else {
			preco = 1.50;
			valorConta = preco * quantidade;
		}
		
		System.out.printf("Total: R$ %.2f", valorConta);
		
		
		sc.close();	
		}
}
