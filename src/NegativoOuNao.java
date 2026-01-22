import java.util.Scanner;

public class NegativoOuNao {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number ;
		
		System.out.println("Digite um número: ");
		number = sc.nextInt();
		
		if (number < 0) {
			System.out.printf("O número %d é negativo", number);
		}
		else {
			System.out.printf("O número %d é positivo", number);
	
		}
		
		sc.close();
	}
}
