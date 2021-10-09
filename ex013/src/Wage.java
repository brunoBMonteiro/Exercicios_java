import java.util.Scanner;

public class Wage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu salário hora separando digitos por virgula(,)");
        double hourWage = input.nextDouble();
        System.out.println("Digite seu numero de horas trabalhadas no mes separando digitos por virgula(,)");
        double workedHours = input.nextDouble();

        double salarioBruto = hourWage * workedHours;
        double descontoImpostoRenda = (salarioBruto / 100) * 11;
        double descontoInss = (salarioBruto / 100) * 8;
        double descontoSindicato = (salarioBruto / 100) * 5;
        double descontos = descontoSindicato + descontoInss + descontoImpostoRenda;
        double salarioLiquido = salarioBruto - descontos;

        System.out.printf("Salário bruto :%.2f\n", salarioBruto);
        System.out.printf("Salário com desconto do INSS :%.2f\n", salarioBruto - descontoInss);
        System.out.printf("Salário com desconto sindicato :%.2f\n", salarioBruto - descontoSindicato);
        System.out.printf("Salário liquido :%.2f\n", salarioBruto - descontos);
        System.out.printf("Salário liquido :%.2f\n", salarioLiquido);
    }
}
