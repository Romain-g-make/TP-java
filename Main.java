import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        Bibliotheque bibliotheque = new Bibliotheque();
        System.out.println("Bienvenu dans notre nouvelle bibliothèque.");
        try {
            while (true) {
                System.out.println("Voici les actions disponibles :\n1 - Ajouter un livre\n2 - Afficher la liste des livres\n3 - Emprunter un livre\n4 - Retourner un livre\n5 - Supprimer un livre\n6 - Partir de la bibliothèque");
                System.out.print("Que voulez-vous faire ? ");
                Scanner input = new Scanner(System.in);
                choice = Integer.parseInt(input.nextLine());
                if (choice == 1) {
                    bibliotheque.addBook();
                } else if (choice == 2) {
                    bibliotheque.showBooks();
                } else if (choice == 3) {
                    bibliotheque.loan();
                } else if (choice == 4) {
                    bibliotheque.retbook();
                } else if (choice == 5) {
                    bibliotheque.deleteBook();
                } else if ( choice == 6 ) {
                    System.out.println("A bientôt !");
                    break;
                }
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}