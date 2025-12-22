import ict301.solide.SRP.solution.BookBusinessLogic;
import ict301.solide.SRP.solution.BookPrinter;
import ict301.solide.SRP.solution.BookSRP;
import ict301.solide.SRP.solution.BookSaver;
import ict301.solide.SRP.violation.Book;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n ====== Implementation du SRP ======= \n");
        System.out.println(" ******* \n Avec Violation de principes solide *****\n ");
        Book book = new Book("Les principes solides ","Etudiant en L3 ICT Gl","Revision sur les principes Solides");
        book.printToScreen();
        book.saveDatabase();
        book.emprunter("Fadil");
        System.out.println(" ******* \n Avec Single Responsability Principle  *****\n ");
        // la on fais appel a la classe book SRP qui s'occupe uniquement du livre
        BookSRP bookSRP = new BookSRP("Les principes Solides ","Arouna Fadil Njifon Njoya ","Implementation du SRP ");
        // Responsable de l'affichage les livre
        BookPrinter bookPrinter = new BookPrinter();
        bookPrinter.printToHTML(bookSRP);
        bookPrinter.printToScreen(bookSRP);
        // Responsable de la Sauvegarde des livres
        BookSaver bookSaver = new BookSaver();
        bookSaver.saveDatabase(bookSRP);
        bookSaver.saveToFile(bookSRP , "fadil.txt");
        // Responsable de la logique metier
        BookBusinessLogic bookBusinessLogic = new BookBusinessLogic();
        bookBusinessLogic.emprunter(bookSRP,"fadil");
        bookBusinessLogic.autreService(bookSRP);
        /*Scanner scanner = new Scanner(System.in);
        int choix = 0;
        System.out.println("=== BIENVENUE DANS LE TESTEUR SOLID ===");
        System.out.println("Choisissez le principe à tester :");
        System.out.println("1. SRP (Single Responsibility)");
        System.out.println("2. OCP (Open/Closed)");
        System.out.println("3. LSP (Liskov Substitution)");
        System.out.println("4. Quitter");
        System.out.print("\nVotre choix (1-4) : ");*?





       /* System.out.println("Bien vouloir faire un choix  : ");



           switch (choix){

             case 1 :
                 System.out.println("\n ====== Implementation du SRP ======= \n");
                 System.out.println(" ******* \n Avec Violation de principes solide *****\n ");
                 Book book = new Book("Les principes solides ","Etudiant en L3 ICT Gl","Revision sur les principes Solides");
                 book.printToScreen();
                 book.saveDatabase();
                 book.emprunter("Fadil");
                 System.out.println(" ******* \n Avec Single Responsability Principle  *****\n ");
                 // la on fais appel a la classe book SRP qui s'occupe uniquement du livre
                 BookSRP bookSRP = new BookSRP("Les principes Solides ","Arouna Fadil Njifon Njoya ","Implementation du SRP ");
                 // Responsable de l'affichage les livre
                 BookPrinter bookPrinter = new BookPrinter();
                 bookPrinter.printToHTML(bookSRP);
                 bookPrinter.printToScreen(bookSRP);
                 // Responsable de la Sauvegarde des livres
                 BookSaver bookSaver = new BookSaver();
                 bookSaver.saveDatabase(bookSRP);
                 bookSaver.saveToFile(bookSRP , "fadil.txt");
                 // Responsable de la logique metier
                 BookBusinessLogic bookBusinessLogic = new BookBusinessLogic();
                 bookBusinessLogic.emprunter(bookSRP,"fadil");
                 bookBusinessLogic.autreService(bookSRP);
                 break ;
             case 2 :
                 System.out.println("en cours ......");
                 break;
             case 3 :
                 System.out.println("en cours de traitement  ......");
                 break;
             case 4 :
                 System.out.println("en cours de traitement .......");
                 break;
             case 5 :
                 System.out.println("en cours de traitement  .......");
                 break;
             default:
                 System.out.println(" Bien vouloir faire un choix valide ");
        }*/



    }
}