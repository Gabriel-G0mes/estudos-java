import java.util.Scanner;

public class classes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int maior = max(a, b, c);

        showResult(maior);

        input.close();
    }

    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        }
        else if (y > z) {
            aux = y;
        }
        else {
            aux = z;
        }
        return aux;
    }

    public static void showResult(int value) {
        System.out.println("Maior = " + value);
    }

}
