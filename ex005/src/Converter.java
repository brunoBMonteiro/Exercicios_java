import java.util.Scanner;

public class Converter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite os metros: ");
        double metros = input.nextDouble();

        double centimetros = metros * 100;

        System.out.printf("%.2f cm", centimetros);
    }
}
