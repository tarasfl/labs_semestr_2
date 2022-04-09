package museum;
import java.util.Comparator;
import java.util.Date;


public class Exhibit{
    protected String author;
    protected Date date_of_creating;
    protected String origin;
    protected String theme;
    protected Date date_of_presenting;

    public String get_theme(){
        return this.theme;
    }
    public Date get_date_of_presenting(){
        return this.date_of_presenting;
    }
    public Date get_date_of_creating(){
        return this.date_of_creating;
    }

    public String get_author(){
        return this.author;
    };


    public Exhibit(){
        author = "Hto";
        date_of_creating = new Date(0000, 0, 0);
        origin = "De";
        theme = "tak treba";
        date_of_presenting =  new Date(0000, 00, 00);
    }

    public Exhibit(String obj_author, Date obj_date_of_creating, String obj_origin, String obj_theme, Date obj_date_of_presenting){
        author = obj_author;
        date_of_creating = obj_date_of_creating;
        origin = obj_origin;
        theme = obj_theme;
        date_of_presenting =  obj_date_of_presenting;
    }
}

