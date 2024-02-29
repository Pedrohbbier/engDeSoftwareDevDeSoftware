import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        float num1 = Float.parseFloat(leitor.nextLine());

        System.out.println("Digite o segundo número:");
        float num2 = Float.parseFloat(leitor.nextLine());

        if(num1 > num2){
            System.out.println(num1 + " é maior que o " + num2 );
        } else if(num1 < num2){
            System.out.println(num2 + " é maior que " + num1);
        } else {
            System.out.println( num1 +" é igual á " + num2);
        }

    }
}
