package ua.lviv.iot.museum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

class ExhibitTest {

    @Test
    void testNulls() {
        Exhibit exhibit = new Exhibit();
        Assertions.assertNull(exhibit.getDateOfPresenting());
        Assertions.assertNull(exhibit.getTheme());
        Assertions.assertNull(exhibit.getDateOfCreating());
    }

    @Test
    void testCVS() {
        Exhibit exhibit = new Exhibit("john", new Date(1900, 9, 9), "klld", "gr", new Date(1900, 5, 24));
        Assertions.assertEquals("john, gr, Thu Oct 09 00:00:00 EEST 3800", exhibit.toCSV());
    }
}