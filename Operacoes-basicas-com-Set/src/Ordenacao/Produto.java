package Ordenacao;

public class Produto {

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
}
