import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        String titre;
        String autheur;

        try {
            while (true) {
                System.out.println("Bienvenu dans notre nouvelle bibliothèque.\nQue voulez-vous faire ?\n1 - Ajouter un livre\n2 - Afficher la liste des livres\n3 - Emprunter un livre\n4 - Retourner un livre\n5 - Partir de la bibliothèque");
                Scanner input = new Scanner(System.in);
                choice = Integer.parseInt(input.nextLine());
                System.out.println("Votre choix : " + choice);
                if (choice == 1) {
                    System.out.println("-- Ajout d'un livre --\nQuel est le titre du livre ?");
                    Scanner inputTitle = new Scanner(System.in);
                    titre = inputTitle.next();
                    System.out.println("Quel est l'autheur du livre ?");
                    Scanner inputAutheur = new Scanner(System.in);
                    autheur = inputAutheur.next();
                    System.out.println("Vous venez de créer un livre !");
                } else if (choice == 2) {
                    // bibliothèque.showBooks;
                } else if (choice == 3) {
                    // bibliothèque.loanBook;
                } else if (choice == 4) {
                    // bibliothèque.returnBook;
                } else if (choice == 5) {
                    break;
                }
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}