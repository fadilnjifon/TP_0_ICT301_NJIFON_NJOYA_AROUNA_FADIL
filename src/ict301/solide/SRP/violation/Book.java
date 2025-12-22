package ict301.solide.SRP.violation;

public class Book {
    private  String title ;
    private String author ;
    private String content ;

    public Book(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }
    // Responsabilites 1 : Gerer les donnees du livre

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }
    // Responsabilites 2 : Afficher les livres
    public void printToScreen(){
        System.out.println("Titre : "+title);
        System.out.println("Auteur : "+author);
        System.out.println("Contenu : "+content);
    }
    // Responsabilites 3 : Sauvegarder le livre
    public void saveDatabase(){
        System.out.println("Sauvegarde du livre "+title+ "en base de donnees");
    }
    // Responsabilites 4 : la logique metier

    public void emprunter(String lecteur ){
        System.out.println("Emprunt du livre "+title+ " par "+lecteur);
    }

}
