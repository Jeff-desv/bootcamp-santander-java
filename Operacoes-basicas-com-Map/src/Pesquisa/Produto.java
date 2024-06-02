package Pesquisa;

public class Produto {
    //Criando Atributos
    private String nome;
    private double preco;
    private int quantidade;

    //Criando o Construtor
    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Criando o Getter
    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public int getQuantidade(){
        return quantidade;
    }

    //Criando o toString
    public String toString(){
        return "nome " + this.nome +
               ", preco " + this.preco +
               ", quantidade " + this.quantidade;
    }
}
