package managers;

import museum.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ExhibitsManager{
    static public List<Exhibit> find_exhibits_by_theme(List<Exhibit> exhibits, String theme){
        System.out.println("starting...");
        List<Exhibit> sorted_exhibits = new ArrayList<Exhibit>();
        for(int i=0; i<exhibits.size(); i++){
            if(exhibits.get(i).get_theme()==theme){
                sorted_exhibits.add(exhibits.get(i));
            };

        }
        Collections.sort(sorted_exhibits);
        System.out.println("Ending");
        return sorted_exhibits;
    };
    private List<Exhibit> sort_exhibits_by_time_of_presenting(Exhibition exhibits, boolean descend){
        return null;
    };
}