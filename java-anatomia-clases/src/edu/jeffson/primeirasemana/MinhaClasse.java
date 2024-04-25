package edu.jeffson.primeirasemana;

public class MinhaClasse {

    public static void main (String [] args){
       
        String primeiroNome = "Jeffson";
        String segundoNome = "Bruno";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método" +  primeiroNome.concat(" ").concat(segundoNome);
    }
    
}
