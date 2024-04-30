import java.util.concurrent.ThreadLocalRandom;
public class ExampleWhile {
    //WHILE
    /*
     * O Laço while("ENQUANTO") determina que enquanto uma 
     * condição for válida, o boco de código será executado. 
     * O laço While testa a condição antes de executar o 
     * código, logo, caso a condição seja inválida no primeiro 
     * teste o bloco nem será executado.
     */
    
    public static void main(String[] args) {

        double mesada = 50.0;
        while (mesada>0) {
            Double valorDoce = valorAleatorio();

            System.out.println("Doce do Valor: " + valorDoce + " Adicionado ao Carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println();
        System.out.println("Mesada: " + mesada);
        System.out.println("Sua Meada Acabou");
        System.out.println();
        
    

    }

    private static Double valorAleatorio() {
       return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
