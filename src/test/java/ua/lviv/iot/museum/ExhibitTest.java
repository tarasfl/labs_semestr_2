package ua.lviv.iot.museum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExhibitTest {

    @Test
    void testNulls(){
        Exhibit exhibit = new Exhibit();
        Assertions.assertNull(exhibit.getDateOfPresenting());
        Assertions.assertNull(exhibit.getTheme());
        Assertions.assertNull(exhibit.getDateOfCreating());
    }

}