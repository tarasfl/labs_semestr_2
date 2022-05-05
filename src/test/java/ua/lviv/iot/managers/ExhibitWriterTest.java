package ua.lviv.iot.managers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.museum.Exhibit;
import ua.lviv.iot.museum.Painting;
import ua.lviv.iot.museum.Sculpture;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.io.BufferedReader;
import java.util.stream.Collectors;

class ExhibitWriterTest {


    void createCSV() {
        try {
            List<Exhibit> exhibitList = new ArrayList<>();
            Exhibit exhibitOne = new Sculpture(9.1, 7.5, 6.4, 8.8, "erere", "John_1_1", new Date(2005, Calendar.SEPTEMBER, 7), "tak", "not rome", new Date(1003, Calendar.SEPTEMBER, 4));
            Exhibit exhibitTwo = new Sculpture(9.1, 7.5, 6.4, 8.8, "erere", "John_1_1", new Date(2001, Calendar.SEPTEMBER, 7), "tak", "rome", new Date(1005, Calendar.SEPTEMBER, 4));
            Exhibit exhibitThree = new Sculpture(9.1, 7.5, 6.4, 8.8, "erere", "John_1_1", new Date(2004, Calendar.SEPTEMBER, 7), "tak", "rome", new Date(1004, Calendar.SEPTEMBER, 4));
            Exhibit exhibitFour = new Painting(6.7, 7.5, "tak", "mark_4_5", new Date(2003, Calendar.OCTOBER, 9), "rome", "rome", new Date(1002, Calendar.SEPTEMBER, 4));
            Exhibit exhibitFive = new Painting(6.7, 7.5, "tak", "mark_4_5", new Date(2002, Calendar.OCTOBER, 9), "rome", "rome", new Date(1001, Calendar.SEPTEMBER, 4));
            Collections.addAll(exhibitList,
                    exhibitOne,
                    exhibitTwo,
                    exhibitThree,
                    exhibitFour,
                    exhibitFive
            );
            ExhibitWriter exhibitWriter = new ExhibitWriter();
            exhibitWriter.writeToFile(exhibitList);
        } catch (IOException e) {
            System.out.println("error " + e);
        }
    }


    @Test
    void testCSVResultsWithExpectedFile() throws IOException {
        createCSV();
        try (FileReader expectedReader = new FileReader("expected.csv");
             BufferedReader ebr = new BufferedReader(expectedReader);
             FileReader actualReader = new FileReader("result.csv");
             BufferedReader abr = new BufferedReader(actualReader)
        ) {
            Assertions.assertEquals(ebr.lines().collect(Collectors.joining()), abr.lines().collect(Collectors.joining()));
        }

    }
}