package ict301.solide.DIP.violation;

public class OrderProcessor {
    private MySQLDatabase database;

    public OrderProcessor() {
        this.database = new MySQLDatabase();
    }
    public void processOrder(String order){
        database.save(order);
    }
}
