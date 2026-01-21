import java.util.Scanner;

public class soma {
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		a = sc.nextInt();
		
		System.out.print("Digite o segundo número: ");
		b = sc.nextInt();
		
		
		c = a + b;
		
		System.out.printf("A soma de %d e %d resulta em: %d", a, b, c);
		
		sc.close();
	}
}
