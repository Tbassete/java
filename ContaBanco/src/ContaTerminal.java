import java.util.Scanner;
import java.text.DecimalFormat;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("R$ #,##0.00");

        //exibir as mensagens para o usuario
        System.out.println("digite o nome do cliente:");
        String nome = sc.nextLine();
        
        System.out.println("digite o numero da conta:");
        int numero = sc.nextInt();

        System.out.println("digite a agencia:");
        String agencia = sc.nextLine();    

        System.out.println("digite o saldo");
        float saldo = sc.nextFloat();
        // obter pelo scanner os valores digitados no terminal

        System.out.println("ola"+ nome + "sua agencia é" + agencia + "conta"+ numero + "e seu saldo ja disponivel para saque é:" + df.format(saldo) );
        // exibir mensagem de conta criada (ola "nome"  sua conta é "conta" e seu saldo ja esta disponivel para o saque "saldo")
    }
}
