public class Precos  {
    private double preco;
    private double vendas;

    public Precos(double preco, double vendas, double vendasParcelada) {
        this.preco = preco;
        this.vendas = vendas;
        this.vendasParcelada = vendasParcelada;
    }

    public Precos(String s, String s1, String s2) {
        super();
    }

    public void preco(double preço){
        
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

