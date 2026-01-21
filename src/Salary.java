import java.util.Locale;
import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number, hours;
		double valorHours, salary;
		
		number = sc.nextInt();
		hours = sc.nextInt();
		valorHours = sc.nextDouble();
		salary = hours * valorHours;
		
		System.out.printf("NUMBER = %d%n", number);
		System.out.printf("SALARY = U$ %.2f", salary);
		
		sc.close();
	}
}
