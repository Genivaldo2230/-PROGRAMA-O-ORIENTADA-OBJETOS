public class Teste {
    public static void main(String[] args) {

        var marca = new Marca("SONY", "NOTBOOK");
        System.out.println(marca.getNome() + " \n" + marca.getMarca());

        var modelos = new Modelos("Dell", "l340w");
        System.out.println("Fabricante : " + modelos.getNome() + "\n" + "Modelo : " + modelos.getModelo());

        var precos = new Precos(1200, 252, 560);
        System.out.println("Vendas  a Vistas R$ "+precos.getVendas());
        System.out.println("Venda Parcelado  R$ "+precos.getVendasParcelada());




    }
}
