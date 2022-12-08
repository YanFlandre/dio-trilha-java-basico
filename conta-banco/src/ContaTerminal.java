import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        try (Scanner sc = new Scanner(System.in)) {
            double saldo = 237.48;

            System.out.println("Por favor digite o seu nome:");

            String nome = sc.nextLine();

            System.out.println("Por favor informe o número da conta:");

            int numeroConta = sc.nextInt();

            System.out.println("Por favor informe a sua Agência:");

            String numeroAgencia = sc.next();

            

            
            System.out.println("Olá " + nome +  ", obrigado por criar uma conta em nosso banco, sua agência é: " + numeroAgencia + " conta: " + numeroConta + " e seu saldo de R$" + saldo + " já está disponível para saque.");
        }


        //TODO Conhecer e importar a classe scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pelo scanner os valores digitados pelo usuário

        //Exibir a mensagem conta criada
    }
}
