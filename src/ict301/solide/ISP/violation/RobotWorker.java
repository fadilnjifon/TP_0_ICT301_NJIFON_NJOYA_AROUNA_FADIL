package ict301.solide.ISP.violation;

public class RobotWorker implements Worker{
    @Override
    public void work() {
        System.out.println("Les Robots travaillent sans fatigue ");
    }

    @Override
    public void eat() {
        System.out.println("L'on ne doit pas faire manger un Robot");
        throw new UnsupportedOperationException("Les Robots ne mangent pas ");

    }
}
