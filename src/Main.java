import ict301.solide.SRP.violation.Book;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // Utilisation de la classe Book avec Violation des principes solides
        Book book = new Book("Les principes solides ","Etudiant en L3 ICT Gl","Revision sur les principes Solides");
        book.printToScreen();
        book.saveDatabase();
        book.emprunter("Fadil");

    }
}