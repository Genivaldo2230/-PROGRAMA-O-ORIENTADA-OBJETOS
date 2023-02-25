public class Precos extends Produtos {
    private double preco;
    private double vendas;
    private double vendasAvista;
    public Precos(double vendas, double vendasAvista, double vendasParcelada) {
        this.vendas = vendas;
        this.vendasAvista = vendasAvista;
        this.vendasParcelada = vendasParcelada;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public void setVendasAvista(double vendasAvista) {
        this.vendasAvista = vendasAvista;
    }

    public void setVendasParcelada(double vendasParcelada) {
        this.vendasParcelada = vendasParcelada;
    }

    private double vendasParcelada;

    public Precos() {

    }


    public double getVendas() {
        return vendas;
    }

    public double getVendasAvista() {
        return this.vendasAvista;
    }

    public double getVendasParcelada() {
        return this.vendasParcelada;
    }


}
