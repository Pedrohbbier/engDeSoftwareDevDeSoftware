import java.util.Scanner;


public class VetoresERepetidores {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
    
        int[] vetor1;

        int[] vetor2 = new int[3];

        int[] vetor3 = new int[] {1 , 5 ,2};

        vetor1 = new int[3];

        int valorVetor2 = vetor2[1];

        System.out.println(valorVetor2);
        System.out.println(vetor3[2]);


        int[] numbers = new int[10];

        for(int i = 0 ; i < numbers.length ; i++){
            System.out.println("Digite um número:");
            numbers[i] = leitor.nextInt();
        }
        System.out.println("Números digitados:");
        for(int i = 0 ; i < numbers.length ; i++){
            System.out.println(numbers[i]);
        }

    }

}
