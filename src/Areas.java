import java.util.Locale;
import java.util.Scanner;

public class Areas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, AreaTriangulo, AreaCirculo, AreaTrapezio, AreaQuadrado, AreaRetangulo, pi;
		pi = 3.14159;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		
		
		AreaTriangulo = A * C / 2;
		AreaCirculo = pi * C * C;
		AreaTrapezio = ((A + B) * C) / 2;
		AreaQuadrado = B * B;
		AreaRetangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", AreaTriangulo);
		System.out.printf("CIRCULO: %.3f%n", AreaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", AreaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", AreaQuadrado);
		System.out.printf("RETANGULO: %.3f%n", AreaRetangulo);
		
		
		sc.close();
		}
}
