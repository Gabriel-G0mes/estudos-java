import java.util.Scanner;
import java.util.Locale;

public class Valor_raio {
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		double area, raio, pi;
		pi = 3.14159;
		
		raio = sc.nextDouble();
		area = pi * raio * raio;
		
		System.out.printf("A=%.4f", area);
		
		sc.close();
	}
}
