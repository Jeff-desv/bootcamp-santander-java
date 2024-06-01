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
}
