package FunctionalInterfaceConsumerT;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


/*
 * Representa uma Operação que aceita um Argumento do Tipo T e não retorna
 * nenhum resultado.
 * É utilizado princupalmente para realizar ações, ou efeitos colaterais do
 * Stream sem modificar, ou retornar um valor.
 * 
 */
public class ConsumerExample {

    public static void main(String[] args) {
        //Criar uma Lista com números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //Usando o Consumer com expressão Lambda para imprimir numeros Pares
        Consumer<Integer> imprimirNumerosPar = numero -> {
            if(numero % 2 == 0){
                System.out.println(numero);
            }
        };

        System.out.println();
        //Usar o Consumer para imprimir números pares no Stream
        numeros.stream().forEach( n -> {
            if(n % 2 == 0){
                System.out.println(n);
            }
         }
        );
    }
}