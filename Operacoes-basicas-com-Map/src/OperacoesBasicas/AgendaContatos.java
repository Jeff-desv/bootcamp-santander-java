
package OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    //Criando atributos
    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos(){
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(agendaContatosMap.isEmpty()){
            agendaContatosMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisaPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatosMap.isEmpty()){
            numeroPorNome = agendaContatosMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila", 32769897);
        agendaContatos.adicionarContato("Maria", 32766532);
        agendaContatos.adicionarContato("José", 32764321);
        agendaContatos.adicionarContato("Pedro", 32764219);
        agendaContatos.adicionarContato("Luana", 32765432);
        agendaContatos.adicionarContato("Otavio", 32769893);

        System.out.println();
        agendaContatos.exibirContatos();
        System.out.println();

        agendaContatos.removerContato("Luana");
        System.out.println();
        agendaContatos.exibirContatos();
        System.out.println();
    }
}