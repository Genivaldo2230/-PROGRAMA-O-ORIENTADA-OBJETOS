
import java.awt.image.BandCombineOp;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String Bancos = null;
        System.out.println("Nome do Banco ");
        Bancos = sc.nextLine();

        var Conta = new Conta(1234, 987);
        System.out.println("Saldo Conta = "+" R$ "+Conta.calcularSaldo());

        var ContaCorrente = new ContaCorrente(1200, 3400, 52);
        System.out.println("Saldo Conta Corrente = "+" R$ "+ContaCorrente.calcularSaldo());

        var Contavip = new ContaVip(1210, 1600, 1000);
        System.out.println("Saldo Conta + Limite "+" R$ "+Contavip.calcularSaldo());
    }
}