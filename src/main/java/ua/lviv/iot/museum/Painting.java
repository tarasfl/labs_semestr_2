package ua.lviv.iot.museum;

import java.util.Date;

public class Painting extends Exhibit {
    private final double height;
    private final double length;
    private final String style;

    public Painting(final double objHeight, final double objLength, final String objStyle, final String author, final Date year, final String origin, final String theme, final Date dateOfPresenting) {
        super(author, year, origin, theme, dateOfPresenting);
        this.height = objHeight;
        this.length = objLength;
        this.style = objStyle;
    }

    public String getHeaders() {
        return super.getHeaders() + ", style";
    }

    public String toCSV() {
        return super.toCSV() + ", " + this.style;
    }
}
