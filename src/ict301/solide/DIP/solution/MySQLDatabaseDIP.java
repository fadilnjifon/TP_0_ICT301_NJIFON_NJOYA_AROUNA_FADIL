package ict301.solide.DIP.solution;

public class MySQLDatabaseDIP implements Database{
    @Override
    public void save(String data) {
        System.out.println("Saving to MySQL :"+data);

    }
}
