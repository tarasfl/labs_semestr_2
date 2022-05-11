package ua.lviv.iot.managers;

import ua.lviv.iot.museum.Exhibit;

import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;


public class ExhibitsManager {
    public List<Exhibit> findExhibitsByTheme(List<Exhibit> exhibits, final String theme, final boolean descend) {
        List<Exhibit> sortedExhibits = new ArrayList<>();
        for (Exhibit exhibit : exhibits) {
            if (Objects.equals(exhibit.getTheme(), theme)) {
                sortedExhibits.add(exhibit);
            }
        }
        if (descend) {
            sortedExhibits.sort(Comparator.comparing(Exhibit::getDateOfCreating, Comparator.reverseOrder()));
        } else {
            sortedExhibits.sort(Comparator.comparing(Exhibit::getDateOfCreating));
        }
        return sortedExhibits;
    }

    public List<Exhibit> sortExhibitsByTimeOfPresenting(List<Exhibit> exhibits, final boolean descend) {
        if (descend) {
            exhibits.sort(Comparator.comparing(Exhibit::getDateOfPresenting, Comparator.reverseOrder()));
        } else {
            exhibits.sort(Comparator.comparing(Exhibit::getDateOfPresenting));
        }
        return exhibits;
    }
}
