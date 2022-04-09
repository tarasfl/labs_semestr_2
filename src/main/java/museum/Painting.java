package museum;

import java.util.Date;

class Painting extends Exhibit{
    private float height;
    private float length;
    private String style;

    public Painting(){
        super();
        height=0;
        length=0;
        style="modno";
    }
    public Painting(float obj_height, float obj_length, String obj_style, String author, Date year, String origin, String theme, Date date_of_presenting){
        super(author, year, origin, theme, date_of_presenting);
        height=obj_height;
        length=obj_length;
        style=obj_style;
    }
}