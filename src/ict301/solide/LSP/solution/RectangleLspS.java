package ict301.solide.LSP.solution;

public class RectangleLspS implements ShapeLsp{
    private int width ;
    private int height ;

    public RectangleLspS(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return width*height;
    }
}
