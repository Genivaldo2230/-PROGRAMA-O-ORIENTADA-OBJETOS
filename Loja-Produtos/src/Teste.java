import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pesquisa Produto : ");
        String entrada = sc.nextLine();

        var produtos = new Produtos("Fabricante  \n", "\n Modelo / serie");
        System.out.println(produtos.getProdutos()+ sc.nextLine() + produtos.getNomeProduto()+ sc.nextLine());

        var marca = new Marca("Nome da Marca", "Marca Fabricante");
        // var marca = new Marca(" ","Fabricante : ", "Especificação :");
        System.out.println(marca.getNomeMarca() + sc.nextLine() + " \n" + marca.getMarca() + sc.nextLine());


        var modelos = new Modelos("Quantidade");
        System.out.println("Quantidade n:" + sc.nextLine());


        var precos = new Precos(0 + " : Preço", 0 + " : Venda á Avista ", "Valore á Parcelar" + 0);
        System.out.println(precos.getPreco() + precos.getVendas() + precos.getVendasParcelada());


        System.out.println("Venda Parcelado  R$ " + precos);


    }
}
