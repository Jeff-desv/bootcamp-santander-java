package OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    //Criando Atributos
    private Set<Convidado> convidadoSet;

    //Criando construtor
    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();
    }

    //Criando Métodos
    public void adicionarConvidado(String nome, int codigoConvite){
        //Adicionando um Convidado
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        //Removendo convidado por Código de Convite
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    //Contando a quantidade de Convidados
    public int contarConvidados(){
        return convidadoSet.size();
    }

    //Exibindo Convidados
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    //Testando nossa Aplicação
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados");
        System.out.println();

        //Adcionando Convidados 
        conjuntoConvidados.adicionarConvidado("Ana Julia", 02);
        conjuntoConvidados.adicionarConvidado("João", 05);
        conjuntoConvidados.adicionarConvidado("Maria", 12);
        conjuntoConvidados.adicionarConvidado("Pedro", 06);
        conjuntoConvidados.adicionarConvidado("Julia", 123);
        //Nova Pesquisa
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados");
        System.out.println();

        //Removendo Convidado
        conjuntoConvidados.removerConvidadoPorCodigoConvite(05);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados");
        System.out.println();
    }
    
}
