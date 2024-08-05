import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

  public static void imprimirMensagemBoasVindas(int numeroAgencia, String numeroConta, String nomeCliente, BigDecimal saldoCliente) {
    System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponivel para saque.", nomeCliente, numeroAgencia, numeroConta, saldoCliente);
  }
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por favor, digite o número da Conta!");
    int numeroConta = scanner.nextInt();

    System.out.println("Por favor, digite o número da Agência!");
    String numeroAgencia = scanner.next();

    System.out.println("Por favor, digite o seu nome!");
    String nomeClient = scanner.next();

    System.out.println("Por favor, digite o seu saldo!");
    BigDecimal saldoCliente = scanner.nextBigDecimal().setScale(2, RoundingMode.HALF_UP);

    scanner.close();
    imprimirMensagemBoasVindas(numeroConta, numeroAgencia, nomeClient, saldoCliente);
  }
}
