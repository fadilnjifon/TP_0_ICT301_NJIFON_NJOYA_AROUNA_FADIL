package ict301.solide.LSP.violation;

public class Square extends RectangleLspV{
    @Override
    public void setWidth(int width){
        super.setWidth(width);
        super.setHeight(width);
    }
    @Override
    public void setHeight(int height){
        super.setHeight(height);
        super.setWidth(height);
    }
}
