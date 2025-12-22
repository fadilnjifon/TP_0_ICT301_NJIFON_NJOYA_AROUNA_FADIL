package ict301.solide.SRP.solution;

public class BookSaver {
    // pour la persistance en base de donnees .
    public void saveDatabase(BookSRP bookSRP){
        System.out.println("Sauvegarde du livre "+bookSRP.getTitle()+ " en base de donnees");
    }
    public void saveToFile(BookSRP bookSRP , String filName){
        System.out.println("Sauvegarde du livre "+bookSRP.getTitle()+ " dans  " +filName);
    }


}
