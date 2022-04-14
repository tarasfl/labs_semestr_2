package ua.lviv.iot.museum;

import java.util.Date;

public class Sculpture extends Exhibit{
    private final double height;
    private final double length;
    private final double width;
    private final double weight;
    private final String style;


    public Sculpture(){
        super();
        height=0;
        length=0;
        width=0;
        weight=0;
        style="modno";
    }

    public Sculpture(double objHeight, double objLength, double objWidth, double objWeight, String objStyle, String author, Date date_of_creating, String origin, String theme, Date date_of_presenting){
        super(author, date_of_creating, origin, theme, date_of_presenting);
        this.height=objHeight;
        this.length=objLength;
        this.width=objWidth;
        this.weight=objWeight;
        this.style= objStyle;
    }
}