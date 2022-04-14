package ua.lviv.iot.museum;

import java.util.ArrayList;
import java.util.List;

public class Exhibition{
    private List<Exhibit> exhibits = new ArrayList<Exhibit>();
    private String theme;

    public boolean set_exhibit(Exhibit exhibit){
        this.exhibits.add(exhibit);
        return true;
    }

    public List<Exhibit> get_exhibits(){
        return exhibits;
    }

    public Exhibition(){
        exhibits.add(new Sculpture());
        theme="t";
    }
    public Exhibition(List<Exhibit> obj_exhibits,  String obj_theme){
        exhibits=obj_exhibits;
        theme=obj_theme;
    }

}