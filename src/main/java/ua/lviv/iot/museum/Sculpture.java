package ua.lviv.iot.museum;

import java.util.Date;

public class Sculpture extends Exhibit {
    private final double height;
    private final double length;
    private final double width;
    private final double weight;
    private final String style;

    public Sculpture(final double objHeight, final double objLength, final double objWidth, final double objWeight, final String objStyle, String author, Date dateOfCreating, String origin, String theme, Date dateOfPresenting) {
        super(author, dateOfCreating, origin, theme, dateOfPresenting);
        this.height = objHeight;
        this.length = objLength;
        this.width = objWidth;
        this.weight = objWeight;
        this.style = objStyle;
    }

    public String toCSV() {
        return super.toCSV() + ", " + this.style + ", " + this.weight;
    }

    public String getHeaders() {
        return super.getHeaders() + ", style, weight";
    }
}
