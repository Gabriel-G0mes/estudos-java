package application;
import entities.Conta;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String name = input.nextLine();
        System.out.print("Digite seu saldo: ");
        double saldo = input.nextDouble();
        input.nextLine();
        Conta titularConta = new Conta(name, saldo);
        System.out.println("----------------");
        System.out.println("Novo acesso");
        System.out.print("Digite seu nome: ");
        name = input.nextLine();
        Conta conta = new Conta(name);

        System.out.println(titularConta);
        System.out.println(conta);

        input.close();
    }
}
