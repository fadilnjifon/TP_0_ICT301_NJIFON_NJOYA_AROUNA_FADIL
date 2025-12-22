package ict301.solide.SRP.solution;

public class BookBusinessLogic {
    public void emprunter(BookSRP bookSRP , String lecteur ){
        System.out.println("Emprunt du livre "+bookSRP.getTitle()+ " par " +lecteur);

    }
    // ajout d'une autre logique
    public void autreService(BookSRP bookSRP){
        System.out.println("\n Autre logique metier sur le livre "+bookSRP.getTitle());
    }
}
