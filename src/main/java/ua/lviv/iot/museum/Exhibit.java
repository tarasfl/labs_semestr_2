package ua.lviv.iot.museum;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Exhibit {
    protected String author;
    @Getter
    protected Date dateOfCreating;
    protected String origin;
    @Getter
    protected String theme;
    @Getter
    protected Date dateOfPresenting;

    public Exhibit(String objAuthor, Date objDateOfCreating, String objOrigin, String objTheme, Date objDateOfPresenting) {
        this.author = objAuthor;
        this.dateOfCreating = objDateOfCreating;
        this.origin = objOrigin;
        this.theme = objTheme;
        this.dateOfPresenting = objDateOfPresenting;
    }

    public String toCSV() {
        return this.author + ", " + this.theme + ", " + this.dateOfCreating;
    }

    public String getHeaders() {
        return "author, theme, date of creating";
    }
}

