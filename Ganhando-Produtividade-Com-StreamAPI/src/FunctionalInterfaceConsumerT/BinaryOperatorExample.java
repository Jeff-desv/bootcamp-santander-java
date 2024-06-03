package FunctionalInterfaceConsumerT;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/*
 * Representa uma operação que combina dois argumentos do Tipo T
 * e retorna um resultado do mesmo Tipo T.
 * 
 * É usada para realizar operações de redução em pares de elementos,
 * como somar números ou combinar objetos.
 */

public class BinaryOperatorExample {

    public static void main(String[] args) {

        //Criar uma lista de numeros inteiros 
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        //Usar o BinaryOperator com expressão Lambda para Somar dois números Inteiros
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        //Usar o BinaryOperator para somar todos os números no Stream
        int resultado = numeros.stream()
            .reduce(0, (n1, n2) -> n1 + n2);

        //Imprimri o resultado
        System.out.println("A soma dos números é: " + resultado);

    }
    
}
