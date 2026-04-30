import java.util.Calendar;

public class Book {
    private final String title;
    private final String author;
    private boolean loan;
    private Calendar date_loan; 
    private final int id;

    public Book(String title,String author,int id){
        this.title = title;
        this.author = author;
        this.loan = false;
        this.id = id;
    }

    public String get_info(){
        if (loan){
            return (this.id+". "+this.title+" "+this.author+" est emprunté depuis le : "+this.date_loan);
        }
        return (this.id+". "+this.title+" "+this.author);        
    }

    public int getId(){
        return this.id;
    }

    public String gettitle(){
        return this.title;
    }

    public String getauthor(){
        return this.author;
    }

    public boolean loan(){
        if (this.loan){
            return false;
        }
        this.loan = true;
        this.date_loan = Calendar.getInstance();
        return true;
    }

    public boolean retbook(){
        if (!this.loan){
            return false;
        }
        this.loan = false;
        return true;
    }
}
