import java.util.Locale;
import java.util.Scanner;

public class cadastro_simples {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name, city;
		int age;
		double height;
		char gender;
		
		System.out.println("Digite seu nome completo: ");
		name = sc.nextLine();
		
		System.out.println("Digite sua idade: ");
		age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite sua altura: ");
		height = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Digite seu gênero (M/F): ");
		gender = sc.next().charAt(0);
		sc.nextLine();
		
		System.out.println("Digite a cidade onde mora: ");
		city = sc.nextLine();
		
		System.out.println("===== DADOS CADASTRADOS =====");
		System.out.printf("Nome: %s%n", name);
		System.out.printf("Idade: %d anos%n", age);
		System.out.printf("Altura: %.2f m%n" , height);
		System.out.printf("Gênero: %c%n", gender);
		System.out.printf("Cidade: %s", city);
		
		sc.close();
		}
}
