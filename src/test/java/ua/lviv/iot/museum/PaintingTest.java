package ua.lviv.iot.museum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;


class PaintingTest {

    @Test
    void testCVS(){
        Painting painting = new Painting(14.5, 25.6, "hub", "john", new Date(1900, 9, 9), "klld", "gr",new Date(1900, 5, 24));
        Assertions.assertEquals("john, gr, Thu Oct 09 00:00:00 EEST 3800, hub", painting.toCVS());
    }
}