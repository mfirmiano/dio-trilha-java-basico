import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numero;
        String agencia, nomeCompleto, primeiroNome, segundoNome;
        float saldo;

        System.out.println("Por favor, insira o número da conta:");
        numero = scanner.nextInt();

        System.out.println("Agora digite a agência:");
        agencia = scanner.next();

        System.out.println("Informe o seu Primeiro Nome:");
        primeiroNome = scanner.next();

        System.out.println("Informe o seu Segundo Nome:");
        segundoNome = scanner.next();

        nomeCompleto = primeiroNome + " ".concat(segundoNome);

        System.out.println("Informe o saldo:");
        saldo = scanner.nextFloat();

        String mensagem = "Olá ".concat(nomeCompleto).concat(", obrigado por criar uma conta em nosso banco. Sua agência é ").concat(agencia).concat(", conta ").concat(String.valueOf(numero)).concat(" e seu saldo ").concat(String.format("%.2f", saldo)).concat(" já está disponível para saque.");
    
        System.out.println(mensagem);
    }   
}
