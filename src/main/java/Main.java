import museum.*;
import managers.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Main{
    public static void main(String[] args){
        Sculpture s_1 = new Sculpture(9.1, 7.5, 6.4, 8.8, "erere", "John_3",  new Date(1960, 8, 7), "tak", "rome", new Date(-9, 8, 4));
        Sculpture s_2 = new Sculpture(9.1, 7.5, 6.4, 8.8, "erere", "John",  new Date(1990, 8, 7), "tak", "home", new Date(-9, 8, 4));
        Sculpture s_3 = new Sculpture(9.1, 7.5, 6.4, 8.8, "erere", "John_2",  new Date(1400, 8, 7), "tak", "rome", new Date(-9, 8, 4));
        Sculpture s_4  = new Sculpture(9.1, 7.5, 6.4, 8.8, "erere", "John_1",  new Date(1090, 8, 7), "tak", "rome", new Date(-9, 8, 4));
        List<Exhibit> k = new ArrayList<Exhibit>();
        k.add(s_1);
        k.add(s_2);
        k.add(s_3);
        k.add(s_4);
        List<Exhibit> j =ExhibitsManager.find_exhibits_by_theme(k, "rome");
    }
}