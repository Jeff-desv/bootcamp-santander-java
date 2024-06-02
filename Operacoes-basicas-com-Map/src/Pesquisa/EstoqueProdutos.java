
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

        double valorTotalEstoque = 0;
        if(estoqueProdutoMap.isEmpty()){
            for(Produto p : estoqueProdutoMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }
    
}