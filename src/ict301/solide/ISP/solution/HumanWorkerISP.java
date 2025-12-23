package ict301.solide.ISP.solution;

public class HumanWorkerISP implements Eatable{
    @Override
    public void eat() {
        System.out.println("Les humain travaillent ");
    }

    @Override
    public void work() {
        System.out.println("Les humain mangent ");

    }
}
