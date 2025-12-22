package ict301.solide.LSP.solution;

public class SquareLsp implements ShapeLsp{

    private  int side;

    public SquareLsp(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side*side;
    }
}
