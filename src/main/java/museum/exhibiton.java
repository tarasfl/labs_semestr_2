package museum;

import java.util.ArrayList;
import java.util.List;

class Exhibition{
    private List<Exhibit> exhibits = new ArrayList<Exhibit>();
    private String type;
    private Exhibition(){
        exhibits.add(new Sculpture());
        type="t";
    }
}