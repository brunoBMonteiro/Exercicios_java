import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double raio = input.nextDouble();

        double area = Math.pow(raio, 2);
        System.out.println(area);
    }
}
