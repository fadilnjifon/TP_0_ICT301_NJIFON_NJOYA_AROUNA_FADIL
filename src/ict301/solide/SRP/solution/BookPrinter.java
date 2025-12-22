package ict301.solide.SRP.solution;
// pour afficher toutes les livres
public class BookPrinter {
    // Methode pour afficher le livre a l'ecran
    public void printToScreen(BookSRP book){
        System.out.println("Titre : "+book.getTitle());
        System.out.println("Auteur : "+book.getAuthor());
        System.out.println("Contenu : "+book.getContent());
    }
    // autre methode pour afficher les livres
    public void printToHTML(BookSRP bookSRP){
        System.out.println("\n === Print to HTML ==== ");
        System.out.println("<h1> "+bookSRP.getTitle() +"</h1>");
        System.out.println("<h2> "+bookSRP.getAuthor() +"</h2>");
        System.out.println("<p> "+bookSRP.getContent() +"</p>");
    }

}
