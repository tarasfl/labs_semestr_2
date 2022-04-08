package museum;
import java.util.Date;


class Exhibit{
    protected String author;
    protected Date year;
    protected String origin;
    protected String theme;
    protected Date date_of_presenting;


    protected Exhibit(){
        author = "Hto";
        year = new Date(0000);
        origin = "De";
        theme = "tak treba";
        date_of_presenting =  new Date(0000, 00, 00);
    }

}