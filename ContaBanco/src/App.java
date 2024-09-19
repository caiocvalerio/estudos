import java.math.BigDecimal;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        ContaTerminal ct;
        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        BigDecimal saldo;

        System.out.print("Digite numero: ");
        numero = sc.nextInt();

        System.out.print("Digite agencia: ");
        agencia = sc.next();

        System.out.print("Digite nomeCliente: ");
        nomeCliente = sc.next() + sc.nextLine();//nome + sobrenome

        System.out.print("Digite saldo: ");
        saldo = sc.nextBigDecimal();

        sc.close();

        ct = new ContaTerminal(numero, agencia, nomeCliente, saldo);
        System.out.println(ct.mensagemContaCriada());
    }
}