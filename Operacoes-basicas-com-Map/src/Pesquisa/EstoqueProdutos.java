
package Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    //Atributos
    private Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProdutos(){
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adcionarProduto(Long cod, String nome, int quantidade, double preco){
        estoqueProdutoMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProduto(){
        System.out.println(estoqueProdutoMap);
    }

    public double calcularValorTotalEstoque(){

        double valorTotalEstoque=0;
        if(estoqueProdutoMap.isEmpty()){
            for(Produto p : estoqueProdutoMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        
        if(!estoqueProdutoMap.isEmpty()){

            for(Produto p : estoqueProdutoMap.values()){
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        System.out.println();
        estoque.exibirProduto();
        System.out.println();

        estoque.adcionarProduto(02l, "Produto 1", 10, 0.52);
        estoque.adcionarProduto(1l, "Produto 2", 5, 1.50);
        estoque.adcionarProduto(055l, "Produto 3", 100, 2.50);
        estoque.adcionarProduto(004l, "Produto 4", 35, 5.0);
        estoque.adcionarProduto(021l, "Produto 5", 10, 5.0);
        estoque.adcionarProduto(010l, "Produto 6", 2, 10.0);
        estoque.adcionarProduto(00l, "Produto 7", 15, 11.0);
        estoque.adcionarProduto(111l, "Produto 8", 2, 15.0);

        System.out.println();
        estoque.exibirProduto();
        System.out.println();

        System.out.println("O valor Total do Estoque e: R$ " + estoque.calcularValorTotalEstoque());
        System.out.println();
        System.out.println("O Produto mais crao : R$ " + estoque.obterProdutoMaisCaro());
        System.out.println();
    }
    
}