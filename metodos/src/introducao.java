public class introducao {
    public static void main(String[] args) {
        

          /*Todas as açoes das aplicações são consideradas métodos
           * 
           * Critérios de Nomeação para Métodos
           * -Deve ser Nomeado como Verbo
           * -Seguir o Padrão camelCase(Todas as letras minúsculas com a primeira letra
           * da segunda palavra sendo Maiúscula)
           */

           //Exemplo de Nomeclaturas

        /* 
        somar(int n1, int n2){};

        concluirProcessamento() {};

        findById (int id) {};
        
        abrirConexao(){};
         */

         //ATENÇÃO!
         /*
          * Não existe em Java o conceito de métodos globais. Todos os 
          métodos devem SEMPRE ser definidos de uma Classe
          */

          //SE PERGUNTE ISSO 
         
         /* Qual a proposta principal do método?
            Você deve se perguntar constantemente até compreender a 
            real finalidade do mesmo.

          * Qual tipo de retorno esperado após executar o método
            Você deve analisar se o método será responsável por 
            retornar algum valor ou não.

            Caso o método não retorne nenhum valor, ele será representado
            pela palavra-chave VOID.
          */

          /*---------------------------------------- */

          /* -Quais os parâmetros serão necessários para execução do método?
             Os métodos as vezes precisão de argumentos como critérios para execução.

             -O método possui risco de apresentar alguma exceção?
             Exceções comuns na execução de métodos, as vezes é necessário prever e 
             tratar possível existência de uma exceção.

             -Qual a visibilidade do método? 
              Será necessário que o método seja visível a toda aplicação, somente em 
              mesmo pacotes, através de herança somente a nível a própria classe.
           * 
           */

    }

    //Abaixo temos um exemplo de uma classe com dois métodos e suas 
   //respectivas considerações:

    public class MyClass {

        public double somar(int num1, int num2){
            //LOGICA - FINALIDADE DO MÉTODO
            return somar(num1, num2);
        }
    }

    public void imprimir(String texto){
        //LOGICA - FINALIDADE DO MÉTODO
        /*
         * AQUI NÃO PRECISA DE RETURN POIS NÃO SERÁ
         * RETORNADO NENHUM RESULTADO.
         */
    }
}
