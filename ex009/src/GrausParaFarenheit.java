import java.util.Scanner;

public class GrausParaFarenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite Graus em farenheit");
        double grausFarenheit = input.nextDouble();

        double grausCelsius = (5 * (grausFarenheit - 32) / 9);

        System.out.println("Os graus celsius são: " + grausCelsius);
    }
}
