public class ex001 {
    public static void imprimir(String str) {
        System.out.println(str);
    }

    public static void main(String[] args){
        imprimir("Teste 1");
        imprimir("Teste 2");
        for(int i = 3 ; i<=10 ; i++){
            imprimir("Teste " + i);
        }
        passarValor();
    }

    public static float somar(float a , float b){
        return a + b;
    }

    public static void passarValor(){
        float a = 10;
        float b = 20;
        System.out.println(somar(a  , b));
    }

}
