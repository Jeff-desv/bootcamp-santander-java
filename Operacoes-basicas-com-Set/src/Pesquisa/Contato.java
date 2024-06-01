package Pesquisa;

import java.util.Objects;

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

    public void setNumero(int numero){
        this.numero = numero;
    }

    //Utilizando o Equals e HashCode para verificação dos numeros
    //utilizaremos para comparar os numeros de celular
    public boolean equals(Object o){
        if (this == o) return true;
        if(!(o instanceof Contato contato)) return false;
        return Objects.equals(getNome(), contato.getNome());
    }

    public int hasCode(){
        return Objects.hashCode(getNome());
    }

    //Criando o Método toString
    public String toString(){
        return " Contato {" +
               " nome '" + nome + '\'' +
               ", numero " + numero +
               '}';
    }
}
