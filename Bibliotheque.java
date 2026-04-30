
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
        []arr = new int [ids.size()];
        ids.toArray(arr);
        for (int i = 0; i < ids.size(); i ++){
            if (ids.get(i)>id_max){
                id_max = ids.get(i);
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

    public void addBook(title,author) {
        id = getIdMax();
        livre = new Book{title,author,id};
        bibliotheque.add(book);
    }

    public deletBook(id) {
        bibliotheque.remove(book);
    }
}