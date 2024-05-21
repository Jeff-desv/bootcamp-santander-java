public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Informação sobre as aulas");
    }

    public void info(){
        /*
         * Collection API
         * 
         * Uma coleção (Collection) é uma estrutura de dados que serve para 
         * agrupar muitos elementos em uma única unidade, estes elementos precisarão
         * ser Objetos.
         * 
         * Uma Collection pode ter coleções homogêneas e heterogêneas, normalmente utilizamos
         * coleções homogêneas de um tipo específico.
         * 
         * O núcleo principal das coleções é formado pelas interfaces, e essas interfaces permitem
         * manipular a coleção independente do nível de detalhe que elas representam.
         * 
         * Temos quatro grandes tipos de coleções: LIST(lista), SET(conjunto), QUEUE(fila) e MAP(mapa),
         * a partir dessas interfaces, temos muitas subclasses concretas que implementam varias formas 
         * diferentes de se trabalhar com cada coleção.
         * 
         * Todas as interfaces e classes são encontradas no Pacote java.util
         */
    }
    public void infoDois(){
        
        //Generics Type

        /* Um Tipo Generico é uma classe genérica ou uma interface que é parametrizada em relação a tipos.
         * A classe Box a seguir será modificada para demonstrar o conceito:
         */
    }
    //EXEMPLO
    public class box{
        private Object object;

        public void set(Object object){this.object = object;}
        public Object get() {return object;}
    }
    /*
     * O síbolo <> é chamado de "diamond operator" foi um recurso introduzido no Java 7 e é usado no contexto 
     * de tipos genéricos em Java para inferir automaticamente o tipo com base no contexto.
     * 
     * Para atualizar a classe Box para usar generics, você cria uma declaração de tipo genérico alterando o código
     * "public class Box" para "public class Box<T>".
     * 
     * Isso introduz a variável de tipo, T, que pode ser usada em qualquer lugar dentro da classe:
     * 
     */
    //EXEMPLO
    public class Box<T>{
        //T representa "Type"(tipo)
        private T t;

        public void set(T t){this.t = t;}
        public T get() {return t;}
    }
    /*
     * Como você pode ver, todas as ocorrências de Object são substituídas por T.
     * Uma variável de tipo pode ser qualquer tipo não primitivo que você especificar: 
     * qualuer tipo de classe, qualquer tipo de interface, qualquer tipo de array ou até mesmo
     * outra variável de tipo.
     * 
     * Essa mesma técnica pode ser aplicada para criar interface genéricas.
     * 
     * Os nomes de parâmetros de tipo mais comumente usados são:
     * 
     * E - Elemento (usado extensivamente pelo Java Collections Framework)
     * 
     * K - Chave
     * 
     * N - Número
     * 
     * T - Tipo
     * 
     * V - Valor
     * 
     * S, U, V, etc 2º, 3º, 4º tipos
     */

     //Vantagens simples de usar generics nas interfaces Collection em Java

     /*
      * 1º Segurança do tipo de dados: O uso de generics garante que apenas objetos de um tipo especifico 
      * possam ser adcionados à coleção, evitando erros de tipo e garantindo que você esteja lidando com os dados 
      * corretos.

      * 2º Código mias legível: Ao usar generics, você pode especificar o tipo de dados esperado ou retornado pela 
      * coleção, o que torna o código mais fácil de entender e ler.
      * 
      
      * 3º Detecta erros mais cedo: O compilador verifica se você está usando os tipos corretos durante a compilação
      * ajudando a identificar erros de tipo antes mesmo de executar o programa.

      * 4º Reutilização do código: Com generics, você pode criar classes e métodos genéricos que funcionam com diferentes tipos de 
      * coleções, evitando a necessidade de duplicar código para cada tipo específico.

      * 5º Melhor desempenho: O uso de generics pode melhorar o desempenho, pois evita a necessidade de conversões de tipo desnecessárias
      permite que o compilador otimize o código com base no tipo especificado.
      */

}
