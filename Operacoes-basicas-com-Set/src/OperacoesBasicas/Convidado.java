
package OperacoesBasicas;

public class Convidado {

    //Criando os Atibutos
    private String nome;

    private int codigoConvite;

    //Criando o Construtor
    public Convidado(String nome, int codigoConvite){
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    //Criando o Getter
    public String getNome(){
        return nome;
    }
    public int getCodigoConvite(){
        return codigoConvite;
    }

    //Criando o método toString para quando acessarmos as informações
    //elas aparecam formatadas
    public String toString(){
        return " Convidado {" +
               " nome'" + nome + '\"' +
               ", codigoConvite " + codigoConvite +
               '}';
    }
}