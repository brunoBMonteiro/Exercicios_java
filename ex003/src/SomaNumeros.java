import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero:");
        int a = input.nextInt();
        System.out.print("Digite um numero:");
        int b = input.nextInt();

        int soma = a + b;

        System.out.println("A soma dos numeros é: " + soma);

    }
}
