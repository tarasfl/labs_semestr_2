package ua.lviv.iot.managers;

import ua.lviv.iot.museum.Exhibit;

import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;


public class ExhibitsManager {
    public static  List<Exhibit> findExhibitsByTheme(List<Exhibit> exhibits, String theme, boolean descend) {
        List<Exhibit> sortedExhibits = new ArrayList<>();
        for (Exhibit exhibit : exhibits) {
            if (Objects.equals(exhibit.get_theme(), theme)) {
                sortedExhibits.add(exhibit);
            }
        }
        if (descend) {
            sortedExhibits.sort(Comparator.comparing(Exhibit::get_date_of_creating, Comparator.reverseOrder()));
        } else {
            sortedExhibits.sort(Comparator.comparing(Exhibit::get_date_of_creating));
        }
        return sortedExhibits;
    }

    static public List<Exhibit> sortExhibitsByTimeOfPresenting(List<Exhibit> exhibits, boolean descend) {
        if (descend) {
            exhibits.sort(Comparator.comparing(Exhibit::getDateOfPresenting, Comparator.reverseOrder()));
        } else {
            exhibits.sort(Comparator.comparing(Exhibit::getDateOfPresenting));
        }
        return exhibits;
    }
}