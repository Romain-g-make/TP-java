
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

    public void addBook() {
        System.out.print("-- Ajout d'un livre --\nQuel est le titre du livre ? ");
        Scanner inputTitle = new Scanner(System.in);
        String title = inputTitle.next();
        System.out.print("Quel est l'autheur du livre ? ");
        Scanner inputAuthor = new Scanner(System.in);
        String author = inputAuthor.next();
        int id = getIdMax(getIds());
        Book livre = new Book(title, author, id+1);
        bibliotheque.add(livre);
        System.out.println("Vous venez de créer un livre !");
    }

    public boolean deletBook(int id) {
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

    public boolean loan(int id) {
        return (getBookFromId(id).loan());
    }

    public boolean retbook(int id) {
        return (getBookFromId(id).retbook());
    }
}