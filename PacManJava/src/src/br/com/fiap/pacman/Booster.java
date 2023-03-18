package br.com.fiap.pacman;

public class Booster extends Item {

    private int duracao;

    public Booster (int x, int y, boolean verItem, int duracao){
        super(x, y, verItem);
        this.duracao = duracao;

    }

    public Booster(int x, int y , int screenSize, boolean verItem, int duracao) {
        super(x, y, screenSize, verItem);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    
    
}
