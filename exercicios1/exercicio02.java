import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um valor em real, e ele será convertido para três unidades monetárias diferentes:");
        float valor = Float.parseFloat(leitor.nextLine());

        float dolar = valor / 4.99f;
        float euro = valor / 5.41f;
        float pesoArgentino = valor / 0.0059f;

        System.out.println("O valor em dólar é: " + dolar);
        System.out.println("O valor em euro é: " + euro);
        System.out.println("O valor em peso argentino é: " + pesoArgentino);

    }

}
