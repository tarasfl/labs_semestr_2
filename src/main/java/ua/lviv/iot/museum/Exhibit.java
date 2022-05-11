package ua.lviv.iot.museum;

import java.util.Date;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Getter;
import lombok.NoArgsConstructor;



@SuppressFBWarnings({"EI_EXPOSE_REP", "EI_EXPOSE_REP2"})
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


    @SuppressFBWarnings("URF_UNREAD_PUBLIC_OR_PROTECTED_FIELD")
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

