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

    public void removerConvidadoPorCodigoConvite(String nome, int codigoConvite){
        //Removendo convidado por Código de Convite
        convidadoSet.remove(codigoConvite);
    }
    
}
