public class ExampleForArray {
    public static void main(String[] args) {
        String alunos [] = { "FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (int x = 0; x < alunos.length; x++){
            System.out.println("O Aluno no índice x = " + x + " é " + alunos[x]);
        }

        //Usando uma forma mais simples com FOR EACH
        /*
         * O uso do FOR/EACH está fortemente relacionado com um cenário onde
         * contenha um Array ou Coleção, e assim, a interação é baseada aos 
         * elementos da coleção.
         */

        System.out.println();
        System.out.println("O mesmo exemplo de cima, só que agora utilizando o FOR EACH");
        System.out.println();

        for(String aluno : alunos){
            System.out.println("O nome do aluno é : " + aluno);
        }
        System.out.println();

    }
}
