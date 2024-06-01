package Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    
    //Criando Atributos
    private Set<Contato> contatoSet;

    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }

    //Adcionando Contato
    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    //Exibindo Contatos
    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    //pesquisar por nome
    public Set<Contato> pesqisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    //Atualizar Numero de Contato
    public Contato atualizarNumContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return atualizarNumContato(nome, novoNumero);
    }

    //Testando nosso Sistema
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();
        System.out.println();

        agendaContatos.adicionarContato("Pedro", 23419999);
        agendaContatos.adicionarContato("Ana", 23415969);
        agendaContatos.adicionarContato("Paulo", 22419899);

        agendaContatos.exibirContatos();
        System.out.println();
    }
}
