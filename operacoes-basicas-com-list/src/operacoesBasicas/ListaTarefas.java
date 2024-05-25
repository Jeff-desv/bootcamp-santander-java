package operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    
    //Criando Atributo
    private List<Tarefa> tarefaList;

    //Criando Constructor
    public ListaTarefas(){
        this.tarefaList = new ArrayList<>();
    }

    //Criando Método Adcionar Tarefa
    public void adcionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    //Criando Método Remover Tarefa
    public void removeTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    //Obtendo o Numero de Tarefas
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    //Obter Descrições de Tarefas
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }
}
