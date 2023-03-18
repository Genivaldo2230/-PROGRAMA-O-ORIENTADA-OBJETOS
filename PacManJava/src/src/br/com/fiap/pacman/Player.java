package br.com.fiap.pacman;

public class Player extends GameObject {

  
    protected boolean invencivel;
    protected int direction;
    protected int vida;

    public Player(int x, int y, int direction) {
        super(x, y, direction);
        //TODO Auto-generated constructor stub
    }

    public Player(int x, int y, int screenSize, int direction, int vida, boolean invencivel){
        super(x, y, screenSize);
        this.direction = direction;
        this.vida =vida;
        this.invencivel = invencivel;
    }

    public Player (int x, int y, int direction, int vida, boolean invencivel){
        super(x, y);
        this.direction = direction;
        this.vida =vida;
        this.invencivel = invencivel;

    }

    

    public boolean isInvencivel() {
        return invencivel;
    }

    public void setInvencivel(boolean invencivel) {
        this.invencivel = invencivel;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    
    public int getLife() {
        return 0;
    }

    public void setLife(int i) {
    }

    public void setScreenSize(int sCREENSIZE) {
    }

    public boolean podeSeMover() {

        if(direction == 90 && (x+10) > super.screenSize){
            return false;
        }

        if(direction == 270 && (x-10) > super.screenSize){
            return false;
        }
        
        if(direction == 0 && (y+10) > super.screenSize){
            return false;
        }
        
        if(direction == 180 && (y-10) > super.screenSize){
            return false;
        }
        return true;
    }
}
