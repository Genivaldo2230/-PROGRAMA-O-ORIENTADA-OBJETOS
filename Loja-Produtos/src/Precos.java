public class Precos extends Produtos {
    private double preco;
    private double vendas;
    public Precos(double preco, double vendas, double vendasParcelada) {
        this.preco = preco;
        this.vendas = vendas;
        this.vendasParcelada = vendasParcelada;
    }

    public double getPreco() {
        return preco;
    }

    public double getVendas() {
        return vendas;
    }

    public double getVendasParcelada() {
        return vendasParcelada;
    }

    private double vendasParcelada;

    public Precos() {
    }




}
