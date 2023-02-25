public class ContaCorrente extends Conta {  //extends faz encapuslamento entre as varia class do contrutor
    private double tarifa; // PRIVATE deixa uma ação privada nao podemos alteralas obs quando usado nao se usa o metodo SET

    public ContaCorrente(int numero, double saldo, double tarifa) { //CONSTRUTOR DA CLASS
        super(numero, saldo);
        this.tarifa = tarifa;
    }

    public double getTarifa() {
        return tarifa;
    }


}
