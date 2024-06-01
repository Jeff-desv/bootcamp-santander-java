package Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {

    //Criando Atributos
    private long codigo;
    private String nome;
    private double preco;
    private int quantidade;

    //Criando Construtor
    public Produto(Long codigo, String nome, double preco, int quantidade){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int compareTo(Produto p){
        return nome.compareToIgnoreCase(p.getNome());
    }

    //Criando o Getter
    public Long getCodigo(){
        return codigo;
    }
    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public int getQuantidade(){
        return quantidade;
    }

    //Criando nosso Equal e HashCode para fazer a comparacao por codigo
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        //if(!(o instanceof Produto produto)){   //Essa parte só funciona com JAVA 16      
            return false;
        //}
       // return getCodigo() == produto.getCodigo();
    }

    public int hashCode(){
        return Objects.hash(getCodigo());
    }


    //Criando o toString
    public String toString(){
        return " Produto {" +
        " codigo " + codigo +
        ", nome '" + nome + '\'' +
        ", preco " + preco + 
        ", quantidade " + quantidade +
        '}';
    }
}

class ComparatorPorPreco implements Comparator<Produto>{
    public int compare(Produto p1, Produto p2){
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
