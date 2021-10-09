import java.util.Scanner;

public class Height {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a altura seprando metros e centimetros por virgula(,)");
        double height = input.nextDouble();

        double idealWeight = (72.7 * height) - 58;

        System.out.printf("Seu peso ideal é : %.1f" , idealWeight);

    }
}
