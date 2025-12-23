import ict301.solide.DIP.solution.Database;
import ict301.solide.DIP.solution.MongoDBDatabase;
import ict301.solide.DIP.solution.MySQLDatabaseDIP;
import ict301.solide.DIP.solution.OrderProcessorDIP;
import ict301.solide.DIP.violation.MySQLDatabase;
import ict301.solide.DIP.violation.OrderProcessor;
import ict301.solide.ISP.solution.HumanWorkerISP;
import ict301.solide.ISP.solution.RoboWorkerISP;
import ict301.solide.ISP.violation.HumainWorker;
import ict301.solide.ISP.violation.RobotWorker;
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

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuer = true;

        while (continuer) {
            System.out.println("\n=== BIENVENUE DANS LE TESTEUR SOLID ===");
            System.out.println("Choisissez le principe à tester :");
            System.out.println("1. SRP (Single Responsibility Principle)");
            System.out.println("2. OCP (Open/Closed Principle)");
            System.out.println("3. LSP (Liskov Substitution Principle)");
            System.out.println("4. ISP (Interface Segregation Principle)");
            System.out.println("5. DIP (Dependency Inversion Principle)");
            System.out.println("6. Exécuter toutes les démos");
            System.out.println("7. Quitter");
            System.out.print("\nVotre choix (1-7) : ");

            int choix;
            try {
                choix = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Entrée invalide. Veuillez entrer un nombre.");
                scanner.next(); // Nettoie l'input
                continue;
            }

            switch (choix) {
                case 1:
                    demoSRP();
                    break;
                case 2:
                    demoOCP();
                    break;
                case 3:
                    demoLSP();
                    break;
                case 4:
                    demoISP();
                    break;
                case 5:
                    demoDIP();
                    break;
                case 6:
                    System.out.println("\nExécution de toutes les démos...");
                    demoSRP();
                    demoOCP();
                    demoLSP();
                    demoISP();
                    demoDIP();
                    break;
                case 7:
                    System.out.println("Au revoir !");
                    continuer = false;
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez choisir entre 1 et 7.");
                    continue;
            }

            if (continuer && choix != 7) {
                System.out.print("\nRetour au menu ? (O/N) : ");
                String reponse = scanner.next().toUpperCase();
                if (!reponse.equals("O")) {
                    System.out.println("Au revoir !");
                    continuer = false;
                }
            }
        }
        scanner.close();
    }

    private static void demoSRP() {
        System.out.println("\n====== Implémentation du SRP =======");
        System.out.println("\nLe SRP dit qu'une classe ne doit avoir qu'une seule responsabilité.\n");

        System.out.println("******* Avec Violation de principes SOLID *****\n");
        Book book = new Book("Les principes solides", "Etudiant en L3 ICT Gl", "Revision sur les principes Solides");
        book.printToScreen();
        book.saveDatabase();
        book.emprunter("Fadil");

        System.out.println("******* Avec Single Responsibility Principle *****\n");
        BookSRP bookSRP = new BookSRP("Les principes Solides", "Arouna Fadil Njifon Njoya", "Implementation du SRP");
        BookPrinter bookPrinter = new BookPrinter();
        bookPrinter.printToHTML(bookSRP);
        bookPrinter.printToScreen(bookSRP);
        BookSaver bookSaver = new BookSaver();
        bookSaver.saveDatabase(bookSRP);
        bookSaver.saveToFile(bookSRP, "fadil.txt");
        BookBusinessLogic bookBusinessLogic = new BookBusinessLogic();
        bookBusinessLogic.emprunter(bookSRP, "fadil");
        bookBusinessLogic.autreService(bookSRP);
    }

    private static void demoOCP() {
        System.out.println("\n====== Implémentation du OCP =======");
        System.out.println("\nL'OCP dit que les classes doivent être ouvertes à l'extension mais fermées à la modification.\n");

        System.out.println("\n***** Implémentation du Open Closed Principle avec Violation *****\n");
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(25);
        Rectangle rectangle = new Rectangle(45.5, 23.5);
        System.out.println("Aire du rectangle : " + areaCalculator.calculateArea(rectangle));
        System.out.println("Aire du cercle : " + areaCalculator.calculateArea(circle));

        System.out.println("\n***** Implémentation du Open Closed Principle avec Refactoring *****\n");
        Shape shapeR = new RectangleOCP(4, 5);
        Shape shapeC = new CircleOCP(24);
        System.out.println("Aire du rectangle : " + shapeR.calculateArea());
        System.out.println("Aire du cercle : " + shapeC.calculateArea());
    }

    private static void demoLSP() {
        System.out.println("\n====== Implémentation du LSP =======");
        System.out.println("\nLe LSP dit que les objets d'une sous-classe doivent pouvoir remplacer ceux de la super-classe sans altérer le programme.\n");

        System.out.println("\n***** Implémentation du Liskov Substitution Principle avec Violation *****\n");
        RectangleLspV rectangleLspV = new RectangleLspV();
        rectangleLspV.setWidth(5);
        rectangleLspV.setHeight(8);
        System.out.println("L'aire du rectangle est : " + rectangleLspV.getArea());

        RectangleLspV squareV = new Square();
        squareV.setHeight(5);
        squareV.setWidth(7);
        System.out.println("L'aire du carré (comme rectangle) est : " + squareV.getArea());

        System.out.println("\n***** Implémentation du Liskov Substitution Principle avec Refactoring *****\n");
        ShapeLsp squareLsp = new SquareLsp(3);
        ShapeLsp rectangleLsp = new RectangleLspS(4, 7);
        System.out.println("L'aire du rectangle est : " + rectangleLsp.getArea());
        System.out.println("L'aire du carré est : " + squareLsp.getArea());
    }

    private static void demoISP() {
        System.out.println("\n====== Implémentation du ISP =======");
        System.out.println("\nL'ISP dit que les interfaces doivent être fines et spécifiques pour éviter d'imposer des méthodes inutiles.\n");

        System.out.println("\n***** Implémentation du Interface Segregation Principle avec Violation *****\n");
        HumainWorker humainWorker = new HumainWorker();
        RobotWorker robotWorker = new RobotWorker();
        // Ici, on ne devrait pas forcer les robots à manger, mais l'interface le permet
        humainWorker.eat();
        humainWorker.work();
        robotWorker.work(); // robotWorker.eat() causerait un problème si appelé

        System.out.println("\n***** Implémentation du Interface Segregation Principle avec Refactoring *****\n");
        HumanWorkerISP humanWorkerISP = new HumanWorkerISP();
        RoboWorkerISP roboWorkerISP = new RoboWorkerISP();
        humanWorkerISP.eat();
        humanWorkerISP.work();
        roboWorkerISP.work(); // Pas de méthode eat() pour les robots
    }

    private static void demoDIP() {
        System.out.println("\n====== Implémentation du DIP =======");
        System.out.println("\nLe DIP dit que les modules de haut niveau ne doivent pas dépendre des bas niveau, mais des abstractions.\n");

        System.out.println("\n***** Implémentation du Dependency Inversion Principle avec Violation *****\n");
        OrderProcessor order = new OrderProcessor();
        order.processOrder("donnees a sauvegarder");

        System.out.println("\n***** Implémentation du Dependency Inversion Principle avec Refactoring *****\n");
        Database database = new MySQLDatabaseDIP();
        OrderProcessorDIP orderProcessorDIP = new OrderProcessorDIP(database);
        orderProcessorDIP.processorOrder("Donnees a sauvegarder");

        database = new MongoDBDatabase();
        OrderProcessorDIP orderProcessorDIP1 = new OrderProcessorDIP(database);
        orderProcessorDIP1.processorOrder("Donnees a sauvegarder");
    }
}