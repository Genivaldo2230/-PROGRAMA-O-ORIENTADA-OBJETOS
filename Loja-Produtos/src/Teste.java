public class Teste {
    public static void main(String[] args) {
        var marca = new Marca();
        System.out.println(marca.getNome() + " \n" + marca.getMarca());

        var modelos = new Modelos("Dell", "l340w");
        System.out.println("Fabricante : " + modelos.produtos() + "\n" + "Modelo : " + modelos.getMarca());

        var precos = new Precos(1200, 252, 560);
        System.out.println();


    }
}
