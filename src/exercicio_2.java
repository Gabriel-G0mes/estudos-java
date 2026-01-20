import java.util.Locale;

void main(){
		String item1 = "Notebook";
		String item2 = "Smartphone";
		
		int year = 2026;
		int serialNumber = 8472;
		char category = 'A';
		
		double cost1 = 3500.75;
		double cost2 = 1999.99;
		double weight = 2.456789;
		
		IO.println("Items:");
		System.out.printf("%s, which cost is $ %.2f%n", item1, cost1);
		System.out.printf("%s, which cost is $ %.2f%n", item2, cost2);
		IO.println("");
		System.out.printf("Details: year %d, serial number %d and category: %c%n", year ,serialNumber, category);
		IO.println("");
		System.out.printf("Weight with six decimal places: %f%n", weight);
		System.out.printf("Rounded (two decimal places): %.2f%n", weight);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.2f", weight);
}


