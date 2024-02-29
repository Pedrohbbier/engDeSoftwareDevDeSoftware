import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a altura do retângulo:");
        float altura = Float.parseFloat(leitor.nextLine());

        System.out.println("Digite a largura do retângulo:");
        float largura = Float.parseFloat(leitor.nextLine());

        float area = altura * largura;

        System.out.println("A área do retângulo é: " + area);

    }
}
