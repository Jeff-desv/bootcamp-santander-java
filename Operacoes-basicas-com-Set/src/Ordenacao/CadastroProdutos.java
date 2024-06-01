package Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    
    //Criando Atributos
    private Set<Produto> produtoSet;

    //Criando Cadastro
    public CadastroProdutos(){
        this.produtoSet = new HashSet<>();
    }

    //Criando adicionar Produto
    public void adicionarProduto(Long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    //Criando Exibir Produtos Por Nome
    public Set<Produto> exibirProdutoPorNome(){
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
        return produtoPorNome;
    }

    public Set<Produto> exibirProdutoPorPreco(){
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(1l, "Produto 1", 10, 20);
        cadastroProdutos.adicionarProduto(5l, "Produto 2", 10, 20);
        cadastroProdutos.adicionarProduto(7l, "Produto 3", 10, 20);
        cadastroProdutos.adicionarProduto(3l, "Produto 4", 10, 20);
        cadastroProdutos.adicionarProduto(9l, "Produto 5", 10, 20);
        cadastroProdutos.adicionarProduto(5l, "Produto 6", 10, 20);

        System.out.println();
        System.out.println(cadastroProdutos.exibirProdutoPorNome());
        System.out.println(cadastroProdutos.exibirProdutoPorPreco());
    }
    
}
