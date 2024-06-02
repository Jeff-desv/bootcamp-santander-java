package FunctionalInterfaceConsumerT;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    
    /*
     * Representa uma função que aceita um argumento do Tipo T e retorna um resultado do tipo R.
     * É utilizada para transformar ou mapear os elemnetos do Stream em outros valores ou tipos.
     */
    public static void main(String[] args) {
        //Criar uma lista de números inteiros 
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        //Usar a Functionn com expressão Lambda para dobrar todos os números
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        //Usar a função para dobrar todos os números no Stream e armazená-los em outra lista.
        List<Integer> numerosDobrados = numeros.stream()
        .map(dobrar)
        .collect(Collectors.toList());

        //imprimir lista de numeros dobrados
        numerosDobrados.forEach(n -> System.out.println(n));
    }
}
