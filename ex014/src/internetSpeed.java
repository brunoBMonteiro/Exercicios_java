import java.util.Scanner;

public class internetSpeed {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o Tamanho do arquivo :");
        double tamanhoArquivo = input.nextDouble();
        System.out.println("Digite velocidade da internet :");
        double velocidadeIntert = input.nextDouble();

        double tempo = tamanhoArquivo / velocidadeIntert;
        System.out.println("tempo de Download :" + tempo);

    }
}
