public class CaixaEletronico {
    public static void main(String[] args) {
        
        double saldo = 24.0;
        double valorSolicitado = 19.0;

        if(saldo < valorSolicitado){
            System.out.println(saldo);
        } else{
            saldo = saldo - valorSolicitado;
            System.out.println(saldo);
        }

    }
}
