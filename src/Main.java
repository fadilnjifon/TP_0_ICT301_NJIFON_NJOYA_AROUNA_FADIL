import ict301.solide.LSP.solution.RectangleLspS;
import ict301.solide.LSP.solution.ShapeLsp;
import ict301.solide.LSP.solution.SquareLsp;
import ict301.solide.LSP.violation.RectangleLspV;
import ict301.solide.LSP.violation.Square;
import ict301.solide.OCP.solution.CircleOCP;
import ict301.solide.OCP.solution.RectangleOCP;
import ict301.solide.OCP.solution.Shape;
import ict301.solide.OCP.violation.AreaCalculator;
import ict301.solide.OCP.violation.Circle;
import ict301.solide.OCP.violation.Rectangle;
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
// implementation du OCP avec violation
        System.out.println("\n====== IMPLEMENTATION DU OPEN CLOSED PRINCIPE avec Violation  =======\n");
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(25);
        Rectangle rectangle = new Rectangle(45.5,23.5);
        System.out.println("Aire du rectangle : "+areaCalculator.calculateArea(rectangle));
        System.out.println("Aire du cercle :"+areaCalculator.calculateArea(circle));

        // OCP avec Refactoring
        Shape shapeR = new RectangleOCP(4,5);
        Shape shapeC = new CircleOCP(24);
        System.out.println("Aire du rectangle : "+ shapeR.calculateArea());
        System.out.println("Aire du cercle :"+shapeC.calculateArea());
        System.out.println("\n====== IMPLEMENTATION DU OPEN CLOSED PRINCIPE avec Refactoring  =======\n");


// implementation du LSP dans le main avec violation .
        RectangleLspV rectangleLspV = new RectangleLspV();
        rectangleLspV.setWidth(5);
        rectangleLspV.setHeight(8);
        System.out.println("\n L'aire du rectangle est : "+rectangleLspV.getArea());
        // avec un carree :

        RectangleLspV square = new Square();
        square.setHeight(5);
        square.setWidth(7);
        System.out.println("\n L'aire du rectangle est : "+square.getArea());

        // mplementation du LSP dans le main avec refactoring
        ShapeLsp squareLsp = new SquareLsp(3);
        ShapeLsp rectangleLsp = new RectangleLspS(4,7);
        System.out.println("\n L'aire du rectangle est : "+rectangleLsp.getArea());
        System.out.println("\n L'aire du rectangle est : "+squareLsp.getArea());


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