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
                System.out.println("Votre choix : " + choice);
                if (choice == 1) {
                    bibliotheque.addBook();
                } else if (choice == 2) {
                    bibliotheque.showBooks();
                } else if (choice == 3) {
                    bibliotheque.showBooks();
                    System.out.println("-- Emprunt d'un livre --\nQuel est l'ID du livre ?");
                    Scanner inputID = new Scanner(System.in);
                    int id = Integer.parseInt(inputID.next());
                    bibliotheque.loan(id);
                } else if (choice == 4) {
                    bibliotheque.showBooks();
                    System.out.println("-- Retour d'un livre --\nQuel est l'ID du livre ?");
                    Scanner inputID = new Scanner(System.in);
                    int id = Integer.parseInt(inputID.next());
                    bibliotheque.retbook(id);
                } else if (choice == 5) {
                    bibliotheque.showBooks();
                    System.out.println("-- Suppression d'un livre --\nQuel est l'ID du livre ?");
                    Scanner inputID = new Scanner(System.in);
                    int id = Integer.parseInt(inputID.next());
                    bibliotheque.deletBook(id);
                }
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}