package Pesquisa;

public class Contato {
    
    //Criando Atributos 
    private String nome;

    private int  numero;

    //Criando Construtor 
    public Contato(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
    }

    //Criando o Getter
    public String getNome(){
        return nome;
    }
    public int getNumero(){
        return numero;
    }

    //Criando o Método toString
    public String toString(){
        return " Contato {" +
               " nome '" + nome + '\'' +
               ", numero " + numero +
               '}';
    }
}
