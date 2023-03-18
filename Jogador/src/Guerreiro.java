public class Guerreiro extends ElementoVisual {
    public void exibir() {
        // código para exibir o guerreiro na tela
        Guereiro guereiro = new Guereiro();
        System.out.println();
    }
}

class mago extends ElementoVisual {
    public void exibir() {
        // código para exibir o mago na tela
    }
}

class fase {
    public void carregar(ElementoVisual elemento) {
        elemento.exibir();
    }
}