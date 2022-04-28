package ua.lviv.iot.museum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;


class SculptureTest {
    @Test
    void testCVS() {
        Sculpture sculpture = new Sculpture(14.5, 25.6, 4, 7.5, "hub", "john", new Date(1900, 9, 9), "klld", "gr", new Date(1900, 5, 24));
        Assertions.assertEquals("john, gr, Thu Oct 09 00:00:00 EEST 3800, hub, 7.5", sculpture.toCVS());
    }
}