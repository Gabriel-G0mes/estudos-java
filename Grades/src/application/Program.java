package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Student student = new Student();

        student.name = input.nextLine();
        student.firstTrimester = input.nextDouble();
        student.secondTrimester = input.nextDouble();
        student.thirdTrimester = input.nextDouble();

        System.out.println(student.toString());
    }
}
