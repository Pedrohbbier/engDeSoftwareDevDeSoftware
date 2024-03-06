import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] matricula = new int[5];
        String[] nome = new String[5];
        float[] nota1 = new float[5];
        float[] nota2 = new float[5];
        float[] media = new float[5];
        int a = 1;

        for(int i = 0 ; i <= 4 ; i++){
            System.out.println("Digite o numero de matricula do aluno "+ a + ":");
            matricula[i] = leitor.nextInt();
            System.out.println("Digite o nome do aluno: ");
            nome[i] = leitor.next();
            System.out.println("Digite a primeira nota do aluno: ");
            nota1[i] = leitor.nextFloat();
            System.out.println("Digite a segunda nota do aluno: ");
            nota2[i] = leitor.nextFloat();
            media[i] = (nota1[i] + nota2[i]) / 2;
            a++;
        }

        for(int i = 0 ; i <= 4 ; i++){
            System.out.println("Matricula: " + matricula[i]);
            System.out.println("Nome: " + nome[i]);
            if(media[i] >= 6){
                System.out.println("Aprovado: (X)sim ()não ");
            } else {
                System.out.println("Reprovado: ()sim (X)não");
            }
            System.out.println("Nota final: " + media[i]);
            System.out.println("______________________________________________");
        }

        

    }
}
