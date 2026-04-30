
import java.util.*;

public class Bibliotheque {
    private ArrayList<Book> bibliotheque = new ArrayList<>();

    public ArrayList getIds() {
        ArrayList<Integer> list_ids = new ArrayList<>();
        for (int i = 0; i < bibliotheque.size(); i++) {
            list_ids.add(bibliotheque.get(i).getId());
        }
        return list_ids;
    }

    public int getIdMax(ArrayList ids) {
        int id_max = 0;
        for (int i = 0; i < ids.size(); i++) {
            int currentId = (Integer) ids.get(i);
            if (currentId > id_max) {
                id_max = currentId;
            }
        }
        return id_max;
    }

    public void showBooks() {
        if (bibliotheque.size() == 0) {
            System.out.println("> Aucun livre pour le moment !");
        }
        for (int i = 0; i < bibliotheque.size(); i++) {
            System.out.println("> " + bibliotheque.get(i).get_info());
        }
    }

    public void clearTerminal() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void addBook() {
        clearTerminal();
        System.out.print("-- Ajout d'un livre --\nQuel est le titre du livre ? ");
        Scanner inputTitle = new Scanner(System.in);
        String title = inputTitle.next();
        System.out.print("Quel est l'auteur du livre ? ");
        Scanner inputAuthor = new Scanner(System.in);
        String author = inputAuthor.next();
        int id = getIdMax(getIds());
        Book livre = new Book(title, author, id + 1);
        bibliotheque.add(livre);
        System.out.println("Vous venez de créer un livre !");
    }

    public boolean deleteBook() {
        clearTerminal();
        showBooks();
        System.out.println("-- Suppression d'un livre --\nQuel est l'ID du livre ?");
        Scanner inputID = new Scanner(System.in);
        int id = Integer.parseInt(inputID.next());
        Book book = getBookFromId(id);
        bibliotheque.remove(book);
        return true;
    }

    public Book getBookFromId(int id) {
        for (int i = 0; i < bibliotheque.size(); i++) {
            if (bibliotheque.get(i).getId() == id) {
                return bibliotheque.get(i);
            }
        }
        return (new Book(null, null, -1));
    }

    public boolean loan() {
        clearTerminal();
        showBooks();
        System.out.println("-- Emprunt d'un livre --\nQuel est l'ID du livre ?");
        Scanner inputID = new Scanner(System.in);
        int id = Integer.parseInt(inputID.next());
        return (getBookFromId(id).loan());
    }

    public boolean retbook() {
        clearTerminal();
        showBooks();
        System.out.println("-- Retour d'un livre --\nQuel est l'ID du livre ?");
        Scanner inputID = new Scanner(System.in);
        int id = Integer.parseInt(inputID.next());
        return (getBookFromId(id).retbook());
    }
}