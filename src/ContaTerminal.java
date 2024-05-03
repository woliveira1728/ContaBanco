import java.util.Scanner;


public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, informe seu nome e sobrenome!");
        String clientName = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência com o dígito!");
        String agency = scanner.next();

        System.out.println("Por favor, digite o número da conta!");
        int number = scanner.nextInt();

        System.out.println("Por favor, informe seu saldo!");
        double balance = scanner.nextDouble();

        System.out.printf("""
                Olá %s, obrigado por criar uma conta em nosso banco,
                sua agência é %s, conta %d
                e seu saldo %.2f já está disponível para saque
                """, clientName, agency, number, balance);

    }
}