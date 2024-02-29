import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma idade:");
        int idade = Integer.parseInt(leitor.nextLine());

        if(idade < 0){
            System.out.println("Idade inválida");
        }else if(idade <= 13){
            System.out.println("Criança");
        } else if(idade <= 18){
            System.out.println("Adolescente");
        } else if (idade <= 60){
            System.out.println("Adulto");
        } else if(idade > 60){
            System.out.println("Idoso");
        }

    }
}
