import java.util.Locale;

public class exercicio_01 {
	public static void main(){
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products:%n Computer, which price is $ %.2f %n Office desk, which price is $ %.2f", price1, price2);
		System.out.printf("%n%nRecord: %d years old, code %d and gender: %s %n", age, code, gender);
		System.out.printf("%nMeasue with eight decimal places: %f %nRouded (three decimal places): %.3f", measure, measure);
		Locale.setDefault(Locale.US); 
		System.out.printf("%nUS decimal point: %.3f", measure);
	}
}
