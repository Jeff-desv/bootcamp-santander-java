package FunctionalInterfaceConsumerT;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * Representa uma função que aceita um argumento do tipo T e retorna um valor 
 * Booleano (Verdadeiro ou Falso).
 * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
 */
public class PredicateT {

    public static void main(String[] args) {

        //Crair Lista de Palavras
    List<String> palavras = Arrays.asList("java", "Kotlin", "python", "javascript", "c#", "go", "ruby");

    //Crair um Predicate que verifica se a palavra tem mais de 5 caracteres
    Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

    //Usar o Stream para filtrar as palavras com mais de 5 caracteres
    //Imprimir cada palavra que passou no filtro
    palavras.stream()
        .filter(maisDeCincoCaracteres)
        .forEach(System.out::println);
    
        
    }
}
