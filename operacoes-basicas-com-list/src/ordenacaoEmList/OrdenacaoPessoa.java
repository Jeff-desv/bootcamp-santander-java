package ordenacaoEmList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    //Criando os Atributos 
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa(){
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    //Criando um novo método  de Ordenação
    public List<Pessoa> ordenarPorIdade(){
        //Criando uma Lista que irá conter os elementos ordenados por idade
         List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
         Collections.sort(pessoasPorIdade);
         return pessoasPorIdade;
    }

    public List<Pessoa> ordernarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }

    //Testando nossos Métodos 
    public static void main(String[] args){
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Pedro", 20, 1.86);
        ordenacaoPessoa.adicionarPessoa("Valeria", 25, 1.56);
        ordenacaoPessoa.adicionarPessoa("Vitor", 15, 1.62);
        ordenacaoPessoa.adicionarPessoa("Monica", 19, 1.50);

        System.out.println();
        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println();
        System.out.println(ordenacaoPessoa.ordernarPorAltura());
        System.out.println();
    }
}
