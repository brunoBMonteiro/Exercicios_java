import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu salario hora: ");
        double salarioHora = input.nextDouble();
        System.out.println("Digite suas horas trabalhadas: ");
        double horasTrabalhadas = input.nextDouble();
        double salario = salarioHora * horasTrabalhadas;

        System.out.println("Salario é: " + salario);


    }
}
