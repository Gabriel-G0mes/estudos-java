package application;
import entities.Books;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Books books = new Books();
    String decisao = "S";

    while(decisao.equalsIgnoreCase("S")) {

        System.out.println("----------------");
        System.out.println("Olá, adicione o livro a prateleira ?");


        System.out.print("Título: ");
        books.title = input.nextLine();

        System.out.print("Autor: ");
        books.author = input.nextLine();

        System.out.print("Quantidade de páginas: ");
        books.numberPages = input.nextInt();
        input.nextLine();

        System.out.print("Gênero: ");
        books.genre = input.nextLine();

        System.out.print("Foi lido? ");
        books.itRead = input.nextBoolean();
        input.nextLine();

        System.out.println("S/N?");
        decisao = input.nextLine();
    }

    System.out.println("Obrigado e até logo!");

    input.close();
    }
}
