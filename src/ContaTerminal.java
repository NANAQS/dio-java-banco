import java.util.Scanner;
import java.text.MessageFormat;

public class ContaTerminal {
    int numberBank;
    int numberAgent;
    String nameClient;
    float balance;

    public String formatInfosBank() {
        return MessageFormat.format("Olá {0}, obrigado por criar uma conta em nosso banco, sua agência é {1}, conta {2} e seu saldo {3} já está disponível para saque", nameClient, numberAgent, numberBank, balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o número do banco:");
            int numberBank = scanner.nextInt();

            System.out.println("Digite o número da agência:");
            int numberAgent = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digite o nome do cliente:");
            String nameClient = scanner.nextLine();

            System.out.println("Digite o saldo:");
            float balance = scanner.nextFloat();

            ContaTerminal conta = new ContaTerminal();
            conta.numberBank = numberBank;
            conta.numberAgent = numberAgent;
            conta.nameClient = nameClient;
            conta.balance = balance;

            System.out.println(conta.formatInfosBank());
        } catch (Exception e) {
            System.out.println("Erro ao ler entrada do usuário: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }    
}
