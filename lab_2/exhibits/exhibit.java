import java.util.Date
package museum;

class Exhibit{
    protected String author;
    protected int year;
    protected String origin;
    protected String theme;
    protected Date date_of_presenting;


    protected Exhibit(){
        author = "Hto";
        year = 0;
        origin = "De";
        theme = "tek treba";
        date_of_presenting =  new Date(0000, 00, 00);
    }

}