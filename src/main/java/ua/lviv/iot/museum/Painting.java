package ua.lviv.iot.museum;

import java.util.Date;

public class Painting extends Exhibit{
    private final double height;
    private final double length;
    private final String style;

    public Painting(){
        super();
        height=0;
        length=0;
        style="modno";
    }
    public Painting(double objHeight, double objLength, String objStyle, String author, Date year, String origin, String theme, Date date_of_presenting){
        super(author, year, origin, theme, date_of_presenting);
        this.height=objHeight;
        this.length=objLength;
        this.style=objStyle;
    }
}