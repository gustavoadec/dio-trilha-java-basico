import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor digite no numero da agencia: ");
        String agencia = scanner.next();

        System.out.println("Por favor digite no numero da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor digite seu nome e sobrenome: ");
        String nome = scanner.next();
        String sobrenome = scanner.next();

        double saldo = 237.48;

        System.out.println("Ola, " + nome + " " +sobrenome+ "; obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agencia é: " + agencia +".");
        System.out.println("Sua conta é: " + numeroConta +".");
        System.out.println("Seu saldo dispoivel para saque: R$" + saldo + ".");

    }
}
