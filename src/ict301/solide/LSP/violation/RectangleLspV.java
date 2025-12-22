package ict301.solide.LSP.violation;

public class RectangleLspV {
    protected int width ;
    protected int height ;

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public int getArea(){
        return width*height;
    }
}
