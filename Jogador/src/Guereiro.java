public class Guereiro extends Jogador{



    private int atacar;
   private int mover;
   private int y;
   private int X;

    public Guereiro(int mover, int y, int x, int atacar) {
        this.mover = mover;
        this.y = y;
        X = x;
        this.atacar = atacar;
    }

    public Guereiro(String nome, int mover, int y, int x, int atacar) {
        super(nome);
        this.mover = mover;
        this.y = y;
        X = x;
        this.atacar = atacar;
    }

    public int getAtacar() {
        this.atacar = y;
        return atacar;
    }

    public Guereiro() {
        this.mover = mover;
        this.y = y;
        X = 0;
    }

    public Guereiro(String nome, int mover, int y, int x) {
        super(nome);
        this.mover = mover;
        this.y = y;
        X = x;
    }

    public int getMover() {
        return mover;
    }

    public void setMover(int mover) {
        this.mover = mover;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }


}

