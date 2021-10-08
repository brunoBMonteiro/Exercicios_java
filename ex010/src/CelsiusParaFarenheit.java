import java.util.Scanner;

public class CelsiusParaFarenheit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite os graus celsius: ");
        double celsius = input.nextDouble();
        double farenheit = ((celsius * 1.8) + 32);

        System.out.println("Os graus em Farenheit são: " + farenheit);

    }
}
