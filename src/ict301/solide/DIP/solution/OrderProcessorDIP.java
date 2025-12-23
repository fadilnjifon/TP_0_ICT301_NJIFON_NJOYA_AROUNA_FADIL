package ict301.solide.DIP.solution;

public class OrderProcessorDIP{
    private Database database ;

    public OrderProcessorDIP(Database database) {
        this.database = database;
    }
    public void processorOrder(String order){
        database.save(order);
    }
}
