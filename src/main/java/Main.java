import museum.*;
import managers.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Main{
    public static void main(String[] args){
        Sculpture s_1 = new Sculpture(9.1, 7.5, 6.4, 8.8, "erere", "John_3",  new Date(1960, 8, 7), "tak", "rome", new Date(-89, 8, 4));
        Sculpture s_2 = new Sculpture(9.1, 7.5, 6.4, 8.8, "erere", "John",  new Date(1990, 8, 7), "tak", "home", new Date(1050, 8, 4));
        Sculpture s_3 = new Sculpture(9.1, 7.5, 6.4, 8.8, "erere", "John_2",  new Date(-1, 8, 7), "tak", "rome", new Date(-9, 8, 4));
        Sculpture s_4  = new Sculpture(9.1, 7.5, 6.4, 8.8, "erere", "John_1",  new Date(-10, 8, 7), "tak", "rome", new Date(2000, 8, 4));
        Painting p_1 = new Painting(6.7, 7.5, "tak", "mark_1", new Date(1700, 9, 9), "rome", "rome", new Date(1650, 8, 4));
        Painting p_2 = new Painting(6.7, 7.5, "tak", "mark_2", new Date(1701, 9, 9), "rome", "rome", new Date(1649, 8, 4));
        Painting p_3 = new Painting(6.7, 7.5, "tak", "mark_3", new Date(1702, 9, 9), "rome", "rome", new Date(1648, 8, 4));
        List<Exhibit> k = new ArrayList<Exhibit>();
        k.add(s_1);
        k.add(s_2);
        k.add(s_3);
        k.add(s_4);
        k.add(p_1);
        k.add(p_2);
        k.add(p_3);

        List<Exhibit> j =ExhibitsManager.find_exhibits_by_theme(k, "rome", true);
        for(int i =0; i<j.size(); i++){
            System.out.println(j.get(i).get_author());
        }
        List<Exhibit> j2 = ExhibitsManager.sort_exhibits_by_time_of_presenting(j, true);
        for(int i =0; i<j2.size(); i++){
            System.out.println(j2.get(i).get_author());
        };
    }
}