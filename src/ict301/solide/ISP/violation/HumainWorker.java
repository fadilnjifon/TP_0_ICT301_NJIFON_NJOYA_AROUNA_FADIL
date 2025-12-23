package ict301.solide.ISP.violation;

public class HumainWorker implements Worker{
    @Override
    public void work() {
        System.out.println("Les humain travaillent ");
    }

    @Override
    public void eat() {
        System.out.println("Les humain mangent ");
    }
}
