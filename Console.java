import java.util.Scanner;

public class Console {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);


        //leitura de um texto digitado pelo usuário:
        System.out.println("Digite um texto:");
        String texto = leitor.nextLine();
        System.out.println("O texto digitado foi: " + texto);

        //Leitura de um inteiro digitado pelo usuário:
        System.out.println("Digite um número inteiro:");
        Integer numero = leitor.nextInt();
        System.out.println("O número digitado foi: " + numero);
        
        
    }

}
