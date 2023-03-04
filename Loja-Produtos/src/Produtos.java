
/*Voce deve construir uma aplicação de uma loja virtual [v]
 **/

public class Produtos {

    private String produtos;

    public void Produtos(String produtos) {
        this.produtos = produtos;
    }

    private String nomeProduto;
    public Produtos(String produtos, String nomeProduto) {
        this.produtos = produtos;
        this.nomeProduto = nomeProduto;
    }
    public String getProdutos() {
        return produtos;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }



}
