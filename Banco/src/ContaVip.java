public class ContaVip extends Conta{

    public double getLimite() {
        return limite;
    }

    private double limite;

    public ContaVip(int numero, double saldo, double limite) {
        super(numero, saldo);
        this.limite = limite;
    }

    public double calcularSaldo() {
        return this.saldo = saldo;
    }

}
