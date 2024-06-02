package FunctionalInterfaceConsumerT;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Representa uma operação que não aceita nenhum argumento e retorna 
 * um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado
 * tipo
 */

public class SupplierExample {

    public static void main(String[] args) {

        //Usar o Supplier com expressão Lambda para fornecer uma saudação personalizada
    Supplier<String> saudacao = () -> "Olá, seja bem vindo(a)!";

    //Usar o Supplier para obter uma lista com 5 Saudações
    List<String> listaSaudacoes = Stream.generate(saudacao)
        .limit(5)
        .collect(Collectors.toList());

    //Imprimir as Saudações geradas
    listaSaudacoes.forEach(System.out::println);
        
    }
}