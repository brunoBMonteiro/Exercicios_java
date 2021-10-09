import java.util.Scanner;

public class InteirosEReal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero para variavel A (inteiro)");
        int a = input.nextInt();
        System.out.println("Digite um numero para variavel B (inteiro)");
        int b = input.nextInt();
        System.out.println("Digite um numero para variavel C (double)");
        double c = input.nextDouble();

        int resultadoA = (a * 2) * (b / 2);
        double resultadoB = (a * 3) +c;
        double resultadoC = Math.pow(c, 3);


        System.out.println("Valor de A :" + resultadoA);
        System.out.println("Valor de B :" + resultadoB);
        System.out.println("Valor de C :" + resultadoC);
    }
}
