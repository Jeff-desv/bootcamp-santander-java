public class ResultadoEscolar3 {
    public static void main(String[] args) {
        //REFATORANDO O SISTEMA ESCOLAR, COM A CONDIÇÃO TERNÁRIA

        /*
         * Como vimos em operadores, podemos abreviar nosso
         * algorítimo condicional, refatorando com o conceito de 
         * operador ternário. Vamos refatorar os exemplos acima.
         */

         //Cenário 1 (Condicional Simples)
           int nota = 8;

           String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

          System.out.println(resultado);

        //Cenário 2 (Condicional Encadeada)
        int nota2 = 5;

        String resultadoNovo = nota2 >= 7 ? "Aprovado" : nota2 >= 5 && nota2 < 7 ? "Aluno de Recuperação" : "Reprovado";

        System.out.println(resultadoNovo);
    }

}
