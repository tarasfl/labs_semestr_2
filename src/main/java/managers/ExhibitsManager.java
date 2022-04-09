package managers;

import museum.*;

import java.util.*;
import java.util.stream.Stream;

public class ExhibitsManager{
    static public List<Exhibit> find_exhibits_by_theme(List<Exhibit> exhibits, String theme,  boolean descend){
        List<Exhibit> sorted_exhibits = new ArrayList<Exhibit>();
        for(int i=0; i<exhibits.size(); i++){
            if(exhibits.get(i).get_theme()==theme){
                sorted_exhibits.add(exhibits.get(i));
            };

        }
        if(descend){
            Comparator sort_by_age_of_creating = Comparator.comparing(Exhibit::get_date_of_creating, Comparator.reverseOrder());
        Collections.sort(sorted_exhibits, sort_by_age_of_creating);
        }else {
            Comparator sort_by_age_of_creating = Comparator.comparing(Exhibit::get_date_of_creating);
            Collections.sort(sorted_exhibits, sort_by_age_of_creating);
        };
        return sorted_exhibits;
    };
    static public List<Exhibit> sort_exhibits_by_time_of_presenting(List<Exhibit> exhibits, boolean descend){
        if(descend) {
            Comparator sort_by_date_of_presenting = Comparator.comparing(Exhibit::get_date_of_presenting, Comparator.reverseOrder());
            Collections.sort(exhibits,sort_by_date_of_presenting);
        }else {
            Comparator sort_by_date_of_presenting = Comparator.comparing(Exhibit::get_date_of_presenting);
            Collections.sort(exhibits, sort_by_date_of_presenting);
        }
        return exhibits;
    };
}