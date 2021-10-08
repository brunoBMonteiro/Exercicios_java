import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite nota A: ");
        double notaA = input.nextDouble();
        System.out.println("Digite nota B: ");
        double notaB = input.nextDouble();
        System.out.println("Digite nota C: ");
        double notaC = input.nextDouble();
        System.out.println("Digite nota D: ");
        double notaD = input.nextDouble();

        double media = notaA + notaB + notaC + notaD / 4;

        System.out.println("A média é: " + media);
    }
}
