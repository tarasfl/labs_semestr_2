package museum;

import java.util.Calendar;
import java.util.Date;


public class Exhibit{
    protected String author;
    protected Date dateOfCreating;
    protected String origin;
    protected String theme;
    protected Date dateOfPresenting;

    public String get_theme(){
        return this.theme;
    }
    public Date getDateOfPresenting(){
        return this.dateOfPresenting;

    }
    public Date get_date_of_creating(){
        return this.dateOfCreating;
    }

    public String get_author(){
        return this.author;
    }


    public Exhibit(){
        author = "Hto";
        dateOfCreating = new Date(0, Calendar.JANUARY, 0);
        origin = "De";
        theme = "tak treba";
        dateOfPresenting =  new Date(0, Calendar.JANUARY, 0);
    }

    public Exhibit(String objAuthor, Date objDateOfCreating, String objOrigin, String objTheme, Date objDateOfPresenting){
        this.author = objAuthor;
        this.dateOfCreating = objDateOfCreating;
        this.origin = objOrigin;
        this.theme = objTheme;
        this.dateOfPresenting =  objDateOfPresenting;
    }
}

