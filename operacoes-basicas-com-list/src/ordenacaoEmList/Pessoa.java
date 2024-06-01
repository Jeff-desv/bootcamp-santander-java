package ordenacaoEmList;

import java.util.Comparator;

public class Pessoa implements Comparable <Pessoa> {
    
    //Atibutos
    private String nome;

    private int idade;

    private double altura;

    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    //Metodo Comparable 
    public int compareTo(Pessoa p){//Usado toda vez que for utilizado o método Comparable
        return Integer.compare(idade, p.getIdade());//O metodo Integer será usado para comparar a Idade da pessoa que iremos passar
    }

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public double getAltura(){
        return altura;
    }

    //Criando o toString para quando formos imprimir no console
    //as informações virem corretamente 

    public String toString(){
        return "Pessoa { " + 
        "nome '" + nome + '\'' + 
        ", idade" + idade + 
        ", altura" + altura + 
        '}';
    }
}

//Criando uma Nova Classe para Utilizar o COMPARATOR 
//Com essa Classe iremos comparar a Altura da Pessoa
class ComparatorPorAltura implements Comparator<Pessoa>{
    public int compare(Pessoa p1, Pessoa p2){
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}
