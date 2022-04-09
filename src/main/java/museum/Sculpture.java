package museum;

import java.util.Date;

public class Sculpture extends Exhibit{
    private double height;
    private double length;
    private double width;
    private double weight;
    private String style;


    public Sculpture(){
        super();
        height=0;
        length=0;
        width=0;
        weight=0;
        style="modno";
    }

    public Sculpture(double obj_height, double obj_length, double obj_width, double obj_weight, String obj_style, String author, Date date_of_creating, String origin, String theme, Date date_of_presenting){
        super(author, date_of_creating, origin, theme, date_of_presenting);
        height=obj_height;
        length=obj_length;
        width=obj_width;
        weight=obj_weight;
        style= obj_style;
    }
}