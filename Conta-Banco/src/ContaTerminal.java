import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //TODO: Conhecer e Importar a classe Scanner;
        Scanner sc = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuário;
        System.out.println("Bem-Vindo ao Santander!, vamos criar sua primeira conta?");
        System.out.println("Siga os passos a seguir..");

        //Obter pelo Scanner os valores digitados no Terminal;

        System.out.println("Digite seu Primeiro Nome");
        String primeiroNome = sc.nextLine();

        System.out.println("Ok, agora digite Segundo Nome");
        String segundoNome = sc.nextLine();
        String nomeCliente = primeiroNome + segundoNome;

        System.out.println("Bem-Vindo! " + nomeCliente);

        System.out.println("Digite o dia e o mes do seu Aniversário");
        int numero = sc.nextInt();
        String agencia = "067-8";
        double saldo = 500.0;

        //Exibir a mensagem - CONTA CRIADA
        System.out.println("Olá " + nomeCliente + ", Obrigado por criar uma conta em nosso banco, sua Agência é " + agencia + " número da conta " + numero + " e seu saldo é " + saldo + " que já está dispoínel para saque.");

    }
}
