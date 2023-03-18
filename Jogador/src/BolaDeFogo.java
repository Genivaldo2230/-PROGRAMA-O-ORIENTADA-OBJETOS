public class BolaDeFogo extends mago {
    private int poder;
    private int mover;
    int x ;
    int y;


    public BolaDeFogo(int poder, int mover, int x, int y) {
        this.poder = poder;
        this.mover = mover;
        this.x = x;
        this.y = y;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getMover() {
        return mover;
    }

    public void setMover(int mover) {
        this.mover = mover;
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


}
