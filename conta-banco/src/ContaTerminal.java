
import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args){

        
Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("===========================");
        System.out.println("Digite numero da conta:");
        int conta = scanner .nextInt();

        System.out.println("Digite a agencia: ");
        String agencia = scanner .next();

        System.out.println("Nome do cliente: ");
        String cliente = scanner .next();

        System.out.println("Digite o valor de deposito: ");
        Float deposito = scanner .nextFloat();
        System.out.println("________________________________________________________________");
        
        System.out.println("Olá, " +cliente+ " Obrigado por criar uma conta em nosso banco.");
        System.out.println("*******************************");
        System.out.println("Sua Agencia: " +agencia);
        System.out.println("*******************************");
        System.out.println("Conta: " +conta );
        System.out.println("*******************************");
        System.out.println("Seu Saldo: " +deposito); 
        System.out.println("*******************************");
        System.out.println(" Voce já pode fazer saque e deposito na sua conta.");
        System.out.println("*******************************");

        System.out.println("*****NÃO COMPARTILHE OS DADOS Da SUA CONTA******");
        System.out.println("__________________________________________________________________");
    }

   
    }