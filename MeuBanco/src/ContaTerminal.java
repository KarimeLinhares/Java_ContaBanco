import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");
        int agencia = scanner.nextInt();
        System.out.println("Por favor, digite o número da sua Conta !");
        String conta = scanner.next();
        System.out.println("Por favor, digite o seu Nome !");
        String nome = scanner.next();
        System.out.println("Por favor, digite o seu Sobrenome !");
        String sobrenome = scanner.next();
        System.out.println("Por favor, digite o seu Saldo Atual !");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, "+nome+" "+sobrenome+" obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta: "+conta+" e seu saldo é de: R$"+saldo+" que já está disponível para saque!");
   }
}
