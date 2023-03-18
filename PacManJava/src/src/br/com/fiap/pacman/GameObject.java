package br.com.fiap.pacman;

public class GameObject {
    protected int x;
    protected int y;
    protected int screenSize;
  
    public GameObject(int x, int y, int screenSize) {
        this.x = x;
        this.y = y;
        this.screenSize = screenSize;
    }

    
    public GameObject(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public int getScreenSize() {
        return getScreenSize();
    }


    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

}
