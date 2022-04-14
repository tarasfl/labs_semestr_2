import museum.Painting;
import museum.Sculpture;
import museum.Exhibit;
import managers.ExhibitsManager;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        List<Exhibit> listOfExhibits = new ArrayList<>();
        Collections.addAll(listOfExhibits,
                new Sculpture(9.1, 7.5, 6.4, 8.8, "erere", "John_1_1", new Date(1960, Calendar.SEPTEMBER, 7), "tak", "rome", new Date(-89, Calendar.SEPTEMBER, 4)),
                new Sculpture(9.1, 7.5, 6.4, 8.8, "erere", "John", new Date(1990, Calendar.SEPTEMBER, 7), "tak", "home", new Date(1050, Calendar.SEPTEMBER, 4)),
                new Sculpture(9.1, 7.5, 6.4, 8.8, "erere", "John", new Date(1990, Calendar.SEPTEMBER, 7), "tak", "home", new Date(1050, Calendar.SEPTEMBER, 4)),
                new Sculpture(9.1, 7.5, 6.4, 8.8, "erere", "John_5_2", new Date(-1, Calendar.SEPTEMBER, 7), "tak", "rome", new Date(-9, Calendar.SEPTEMBER, 4)),
                new Sculpture(9.1, 7.5, 6.4, 8.8, "erere", "John_6_6", new Date(-10, Calendar.SEPTEMBER, 7), "tak", "rome", new Date(2000, Calendar.SEPTEMBER, 4)),
                new Painting(6.7, 7.5, "tak", "mark_4_5", new Date(1700, Calendar.OCTOBER, 9), "rome", "rome", new Date(1650, Calendar.SEPTEMBER, 4)),
                new Painting(6.7, 7.5, "tak", "mark_3_4", new Date(1701, Calendar.OCTOBER, 9), "rome", "rome", new Date(1649, Calendar.SEPTEMBER, 4)),
                new Painting(6.7, 7.5, "tak", "mark_2_3", new Date(1702, Calendar.OCTOBER, 9), "rome", "rome", new Date(1648, Calendar.SEPTEMBER, 4)));
        List<Exhibit> sortedList = ExhibitsManager.findExhibitsByTheme(listOfExhibits, "rome", true);
        for (Exhibit exhibit : sortedList) {
            System.out.println(exhibit.get_author());
        }
        System.out.println("---------------------------------");
        List<Exhibit> sortedList2 = ExhibitsManager.sortExhibitsByTimeOfPresenting(sortedList, false);
        for (Exhibit exhibit : sortedList2) {
            System.out.println(exhibit.get_author());
        }
    }
}