package br.com.fiap.pacman;

public class Item extends GameObject {

    protected boolean verItem;

    public Item(int x, int y, boolean verItem) {
        super(x, y);
        this.verItem = verItem;
    }

    public Item(int x, int y, int screenSize, boolean verItem){
        super(x, y, screenSize);
        this.verItem = verItem;
    }
    public boolean isVerItem() {
        return verItem;
    }

    public void setVerItem(boolean verItem) {
        this.verItem = verItem;
    }

    
    public class Item extends GameObject {
        private boolean visible;
    
        public Item() {
            // Default constructor
        }
    
        public Item(int x, int y) {
            // Constructor with x and y positions
            this.x = x;
            this.y = y;
        }
    
        public boolean isVisible() {
            return visible;
        }
    
        public void setVisible(boolean visible) {
            this.visible = visible;
        }
    }
}
