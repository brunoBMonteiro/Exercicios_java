import java.util.Scanner;

public class Circulo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o raio do círculo: ");
        double raio = input.nextDouble();

        double diametro = 2 * raio;

        double circunferencia = 2 * Math.PI * raio;
        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("O diâmetro do círculo é: " + diametro);
        System.out.println("A circunferência do círculo é: " + circunferencia);
        System.out.println("A área do círculo é: " + area);
    }
}
