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

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println();
        System.out.println("O numero Total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());
        System.out.println();

        //Testando o Método Adcionando Tarefa
        listaTarefas.adcionarTarefa("Tarefa 1");
        listaTarefas.adcionarTarefa("Tarefa 2");
        listaTarefas.adcionarTarefa("Tarefa 3");
        System.out.println("O numero Total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());
        System.out.println();

        //Testando o Método Remover Tarefa
        System.out.println("Removemos 1 Tarefa e ficou");
        listaTarefas.removeTarefa("Tarefa 2");
        System.out.println("O numero Total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());
        System.out.println();

        //Testando o Método Obter Descrição
        System.out.println("Essa é a nossa Descrição das Tarefas");
        listaTarefas.obterDescricoesTarefas();


        System.out.println();
    }
}
