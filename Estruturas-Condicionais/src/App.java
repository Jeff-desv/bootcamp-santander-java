public class App {
    public static void main(String[] args) throws Exception {
        //Estrutura Condicionais simples (Controle de Fluxo)

        //Simples
        /*
         * Quando ocorre uma validação de execução de fluxo
         * somente quando a condição for positiva, 
         * consideramos como uma estrutura SIMPLES, exemplo:
         * 
         *                 INICIO
         *                   |
         *                   |
         *                   |
         *                 SACAR
         *                   |
         *                 CONTÉM 
         *                 SALDO?
         *                   |
         *    FIM <---NÃO__________SIM ---> ATUALIZA
         *                                  SALDO
         */

         //CONDICIONAIS COMPOSTA

         /*
          * Algumas vezes o nosso programa deverá seguir mais de 
            uma jornada de execução condicionando a uma regra de negócio
            este cenário é denominado ESTRUTURA CONDICIONALS COMPOSTA. Vejamos
            o Exemplo abbaixo:

                           INICIO
         *                   |
         *                   |
         *                   |
         *                RESULTADO
         *                ESCOLAR
         *                   |
         *                 NOTA >= 7?
         *                   |
         * IMPRIME <---NÃO__________SIM ---> IMPRIME
         * REPROVADO                         APROVADO
          */

        //CONDICIONAL ENCADEADA

        /*
         * Em um controle de fluxo condicional, nem sempre nos
         * limitamos ao SE(IF) e SENÃO(ELSE), poderemos ter uma 
         * terceira, quarta e ou inúmeras condições.
         * 
         *         RESULTADO <----------INÍCIO
         *         ESCOLAR
         *            |
         *            |    SIM
         *           NOTA -----> IMPRIME
         *            >=7?       APROVADO
         *            |
         *            | NÃO
         *            |
         *           NOTA     SIM
         *        >=5 E 7=< ------->  IMPRIME
         *            |               RECUPERAÇÃO
         *            |
         *            | NÃO
         *         IMPRIME 
         *        REPROVADO     
         */
    }
}
