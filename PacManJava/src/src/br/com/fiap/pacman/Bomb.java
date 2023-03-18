package br.com.fiap.pacman;

public class Bomb extends Item {

    private int x;
    private int y;
    private boolean item;

    public Bomb(int x, int y, boolean verItem, int x2, int y2, boolean item) {
        super(x, y, verItem);
        x = x2;
        y = y2;
        this.item = item;
    }

    public Bomb(int x, int y, int screenSize, boolean verItem, int x2, int y2, boolean item) {
        super(x, y, screenSize, verItem);
        x = x2;
        y = y2;
        this.item = item;
    }

    public Bomb(int x, int y, int screenSize, boolean verItem) {
        super(x, y, screenSize, verItem);
        // TODO Auto-generated constructor stub
    }

}
