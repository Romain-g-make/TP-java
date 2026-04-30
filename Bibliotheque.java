
import java.lang.reflect.Array;
import java.util.*;

public class Bibliotheque {
    private ArrayList<Book> bibliotheque = new ArrayList<>();

    public ArrayList getIds(){
        ArrayList<Integer> list_ids = new ArrayList<>();
        for (int i = 0; i < bibliotheque.size(); i ++){
            list_ids.add(bibliotheque.get(i).getId());
        }
        return list_ids;
    }

    public int getIdMax(ArrayList ids){
        int id_max = 0;
        for (int i = 0; i < ids.size(); i ++){
            int currentId = (Integer) ids.get(i);
            if (currentId > id_max){
                id_max = currentId;
            }
        }
        return id_max;
    }

    public ArrayList<String> returnBibliotheque() {
        ArrayList<String> temp = new ArrayList<>();
        for(int i = 0; i < bibliotheque.size(); i ++) {
            temp.add(bibliotheque.get(i).get_info());
        }
        return temp;
    }

    public void addBook(String title,String author) {
        int id = getIdMax(getIds());
        Book livre = new Book(
            title,
            author,
            id
        );
        bibliotheque.add(livre);
    }

    public boolean deletBook(int id) {
        Book book = getBookFromId(id);
        bibliotheque.remove(book);
        return true;
    }

    public Book getBookFromId(int id){
        for (int i = 0; i < bibliotheque.size(); i ++){
            if(bibliotheque.get(i).getId()==id){
                return bibliotheque.get(i);
            }
        }
        return (new Book(null, null, -1));
    }
}