package operacoesBasicas;

//Operações Basicas: LIST
public class Tarefa {

    //Criando Atributo
    private String descricao;

    //Criando o Constructor para receber a descrção
    public Tarefa(String descricao){
        this.descricao = descricao;
    }

    //Criando o método getter
    public String getDescricao(){
        return descricao;//Retornará a descrição
    }

    //Sobrescrevendo o Método toString para poder aparecer nossa descrição da Tarefa 
    public String toString(){
        return descricao;
    }
    
}
