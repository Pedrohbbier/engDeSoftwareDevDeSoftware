import java.util.Scanner;
public class ex001 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número de mátricula do aluno:");
        int matricula = Integer.parseInt(leitor.nextLine());

        System.out.println("Digite o nome do aluno:");
        String nome = leitor.nextLine();



        System.out.println("Digite a primeira nota:");
        float nota1 = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a segunda nota:");
        float nota2 = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a terceira nota:");


        float media = (nota1 + nota2 ) / 2;

        System.out.println("Matricula: " + matricula);
        System.out.println("Nome: " + nome);

        if(media >= 6){
            System.out.println("Aprovado: (X)sim ()não");
        } else {
            System.out.println("Reprovado: ()sim (X)não");
        }

        System.out.println("Nota final: " + media);

    }
}
