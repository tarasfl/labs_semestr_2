package ua.lviv.iot.managers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.museum.Exhibit;
import ua.lviv.iot.museum.Sculpture;
import ua.lviv.iot.museum.Painting;

import java.util.*;

class ExhibitsManagerTest {

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }


    void findExhibitsByThemeTest(List<Exhibit> unsortedList, List<Exhibit> sortedList, String theme, int numOfSortedElements, boolean descend) {
        var exhibitsManager = new ExhibitsManager();
        var sortedTestList = exhibitsManager.findExhibitsByTheme(unsortedList, theme, descend);
        Assertions.assertEquals(numOfSortedElements, sortedTestList.size());
        int i = 0;
        for (Exhibit obj : sortedTestList) {
            Assertions.assertEquals(theme, obj.getTheme());
            Assertions.assertEquals(sortedList.get(i).getDateOfCreating(), obj.getDateOfCreating());
            i++;
        }
    }

    @Test
    void findExhibitsByThemeTestAscend() {
        List<Exhibit> unsortedList = new ArrayList<>();
        Exhibit exhibitOne = new Sculpture(9.1, 7.5, 6.4, 8.8, "erere", "John_1_1", new Date(2005, Calendar.SEPTEMBER, 7), "tak", "not rome", new Date(-89, Calendar.SEPTEMBER, 4));
        Exhibit exhibitTwo = new Sculpture(9.1, 7.5, 6.4, 8.8, "erere", "John_1_1", new Date(2001, Calendar.SEPTEMBER, 7), "tak", "rome", new Date(-89, Calendar.SEPTEMBER, 4));
        Exhibit exhibitThree = new Sculpture(9.1, 7.5, 6.4, 8.8, "erere", "John_1_1", new Date(2004, Calendar.SEPTEMBER, 7), "tak", "rome", new Date(-89, Calendar.SEPTEMBER, 4));
        Exhibit exhibitFour = new Painting(6.7, 7.5, "tak", "mark_4_5", new Date(2003, Calendar.OCTOBER, 9), "rome", "rome", new Date(1650, Calendar.SEPTEMBER, 4));
        Exhibit exhibitFive = new Painting(6.7, 7.5, "tak", "mark_4_5", new Date(2002, Calendar.OCTOBER, 9), "rome", "rome", new Date(1650, Calendar.SEPTEMBER, 4));
        Collections.addAll(unsortedList,
                exhibitOne,
                exhibitTwo,
                exhibitThree,
                exhibitFour,
                exhibitFive
        );
        List<Exhibit> sortedList = new ArrayList<>();
        Collections.addAll(sortedList,
                exhibitTwo,
                exhibitFive,
                exhibitFour,
                exhibitThree
        );
        findExhibitsByThemeTest(unsortedList, sortedList, "rome", 4, false);
    }

    @Test
    void findExhibitsByThemeTestDescend() {
        List<Exhibit> unsortedList = new ArrayList<>();
        Exhibit exhibitOne = new Sculpture(9.1, 7.5, 6.4, 8.8, "erere", "John_1_1", new Date(2005, Calendar.SEPTEMBER, 7), "tak", "not rome", new Date(-89, Calendar.SEPTEMBER, 4));
        Exhibit exhibitTwo = new Sculpture(9.1, 7.5, 6.4, 8.8, "erere", "John_1_1", new Date(2001, Calendar.SEPTEMBER, 7), "tak", "rome", new Date(-89, Calendar.SEPTEMBER, 4));
        Exhibit exhibitThree = new Sculpture(9.1, 7.5, 6.4, 8.8, "erere", "John_1_1", new Date(2004, Calendar.SEPTEMBER, 7), "tak", "rome", new Date(-89, Calendar.SEPTEMBER, 4));
        Exhibit exhibitFour = new Painting(6.7, 7.5, "tak", "mark_4_5", new Date(2003, Calendar.OCTOBER, 9), "rome", "rome", new Date(1650, Calendar.SEPTEMBER, 4));
        Exhibit exhibitFive = new Painting(6.7, 7.5, "tak", "mark_4_5", new Date(2002, Calendar.OCTOBER, 9), "rome", "rome", new Date(1650, Calendar.SEPTEMBER, 4));
        Collections.addAll(unsortedList,
                exhibitOne,
                exhibitTwo,
                exhibitThree,
                exhibitFour,
                exhibitFive
        );
        List<Exhibit> sortedList = new ArrayList<>();
        Collections.addAll(sortedList,
                exhibitThree,
                exhibitFour,
                exhibitFive,
                exhibitTwo
        );
        findExhibitsByThemeTest(unsortedList, sortedList, "rome", 4, true);
    }

    void sortExhibitsByTimeOfPresentingTest(List<Exhibit> unsortedList, List<Exhibit> sortedList, boolean descend) {
        var exhibitsManager = new ExhibitsManager();
        var sortedTestList = exhibitsManager.sortExhibitsByTimeOfPresenting(unsortedList, descend);
        int i = 0;
        for (Exhibit obj : sortedTestList) {
            Assertions.assertEquals(sortedList.get(i).getDateOfPresenting(), obj.getDateOfPresenting());
            i++;
        }
    }

    @Test
    void sortExhibitsByTimeOfPresentingTestAscending() {
        List<Exhibit> unsortedList = new ArrayList<>();
        Exhibit exhibitOne = new Sculpture(9.1, 7.5, 6.4, 8.8, "erere", "John_1_1", new Date(2005, Calendar.SEPTEMBER, 7), "tak", "not rome", new Date(1003, Calendar.SEPTEMBER, 4));
        Exhibit exhibitTwo = new Sculpture(9.1, 7.5, 6.4, 8.8, "erere", "John_1_1", new Date(2001, Calendar.SEPTEMBER, 7), "tak", "rome", new Date(1005, Calendar.SEPTEMBER, 4));
        Exhibit exhibitThree = new Sculpture(9.1, 7.5, 6.4, 8.8, "erere", "John_1_1", new Date(2004, Calendar.SEPTEMBER, 7), "tak", "rome", new Date(1004, Calendar.SEPTEMBER, 4));
        Exhibit exhibitFour = new Painting(6.7, 7.5, "tak", "mark_4_5", new Date(2003, Calendar.OCTOBER, 9), "rome", "rome", new Date(1002, Calendar.SEPTEMBER, 4));
        Exhibit exhibitFive = new Painting(6.7, 7.5, "tak", "mark_4_5", new Date(2002, Calendar.OCTOBER, 9), "rome", "rome", new Date(1001, Calendar.SEPTEMBER, 4));
        Collections.addAll(unsortedList,
                exhibitOne,
                exhibitTwo,
                exhibitThree,
                exhibitFour,
                exhibitFive
        );
        List<Exhibit> sortedList = new ArrayList<>();
        Collections.addAll(sortedList,
                exhibitFive,
                exhibitFour,
                exhibitOne,
                exhibitThree,
                exhibitTwo
        );
        sortExhibitsByTimeOfPresentingTest(unsortedList, sortedList, false);
    }
    @Test
    void sortExhibitsByTimeOfPresentingTestDescending() {
        List<Exhibit> unsortedList = new ArrayList<>();
        Exhibit exhibitOne = new Sculpture(9.1, 7.5, 6.4, 8.8, "erere", "John_1_1", new Date(2005, Calendar.SEPTEMBER, 7), "tak", "not rome", new Date(1003, Calendar.SEPTEMBER, 4));
        Exhibit exhibitTwo = new Sculpture(9.1, 7.5, 6.4, 8.8, "erere", "John_1_1", new Date(2001, Calendar.SEPTEMBER, 7), "tak", "rome", new Date(1005, Calendar.SEPTEMBER, 4));
        Exhibit exhibitThree = new Sculpture(9.1, 7.5, 6.4, 8.8, "erere", "John_1_1", new Date(2004, Calendar.SEPTEMBER, 7), "tak", "rome", new Date(1004, Calendar.SEPTEMBER, 4));
        Exhibit exhibitFour = new Painting(6.7, 7.5, "tak", "mark_4_5", new Date(2003, Calendar.OCTOBER, 9), "rome", "rome", new Date(1002, Calendar.SEPTEMBER, 4));
        Exhibit exhibitFive = new Painting(6.7, 7.5, "tak", "mark_4_5", new Date(2002, Calendar.OCTOBER, 9), "rome", "rome", new Date(1001, Calendar.SEPTEMBER, 4));
        Collections.addAll(unsortedList,
                exhibitOne,
                exhibitTwo,
                exhibitThree,
                exhibitFour,
                exhibitFive
        );
        List<Exhibit> sortedList = new ArrayList<>();
        Collections.addAll(sortedList,
                exhibitTwo,
                exhibitThree,
                exhibitOne,
                exhibitFour,
                exhibitFive
        );
        sortExhibitsByTimeOfPresentingTest(unsortedList, sortedList, true);
    }
}