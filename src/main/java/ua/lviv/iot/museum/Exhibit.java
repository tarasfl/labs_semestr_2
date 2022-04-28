package ua.lviv.iot.museum;

import java.util.Calendar;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;


public class Exhibit {
    @Getter @Setter protected String author;
    @Getter @Setter protected Date dateOfCreating;
    protected String origin;
    @Getter @Setter protected String theme;
    @Getter @Setter protected Date dateOfPresenting;

    public Exhibit() {
        author = "Hto";
        dateOfCreating = new Date(0, Calendar.JANUARY, 0);
        origin = "De";
        theme = "tak treba";
        dateOfPresenting = new Date(0, Calendar.JANUARY, 0);
    }

    public Exhibit(String objAuthor, Date objDateOfCreating, String objOrigin, String objTheme, Date objDateOfPresenting) {
        this.author = objAuthor;
        this.dateOfCreating = objDateOfCreating;
        this.origin = objOrigin;
        this.theme = objTheme;
        this.dateOfPresenting = objDateOfPresenting;
    }
}

