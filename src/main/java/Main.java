import museum.*;
import managers.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Main{
    public static void main(String[] args){
        Sculpture sculpture_1 = new Sculpture(9.1, 7.5, 6.4, 8.8, "erere", "John_1_1",  new Date(1960, 8, 7), "tak", "rome", new Date(-89, 8, 4));
        Sculpture sculpture_2 = new Sculpture(9.1, 7.5, 6.4, 8.8, "erere", "John",  new Date(1990, 8, 7), "tak", "home", new Date(1050, 8, 4));
        Sculpture sculpture_3 = new Sculpture(9.1, 7.5, 6.4, 8.8, "erere", "John_5_2",  new Date(-1, 8, 7), "tak", "rome", new Date(-9, 8, 4));
        Sculpture sculpture_4  = new Sculpture(9.1, 7.5, 6.4, 8.8, "erere", "John_6_6",  new Date(-10, 8, 7), "tak", "rome", new Date(2000, 8, 4));
        Painting painting_1 = new Painting(6.7, 7.5, "tak", "mark_4_5", new Date(1700, 9, 9), "rome", "rome", new Date(1650, 8, 4));
        Painting painting_2 = new Painting(6.7, 7.5, "tak", "mark_3_4", new Date(1701, 9, 9), "rome", "rome", new Date(1649, 8, 4));
        Painting painting_3 = new Painting(6.7, 7.5, "tak", "mark_2_3", new Date(1702, 9, 9), "rome", "rome", new Date(1648, 8, 4));
        List<Exhibit> list_of_exhibits = new ArrayList<Exhibit>();
        list_of_exhibits.add(sculpture_1);
        list_of_exhibits.add(sculpture_2);
        list_of_exhibits.add(sculpture_3);
        list_of_exhibits.add(sculpture_4);
        list_of_exhibits.add(painting_1);
        list_of_exhibits.add(painting_2);
        list_of_exhibits.add(painting_3);

        List<Exhibit> sorted_list =ExhibitsManager.find_exhibits_by_theme(list_of_exhibits, "rome", true);
        for(int i =0; i<sorted_list.size(); i++){
            System.out.println(sorted_list.get(i).get_author());
        }
        System.out.println("---------------------------------");
        List<Exhibit> sorted_list_2 = ExhibitsManager.sort_exhibits_by_time_of_presenting(sorted_list, false);
        for(int i =0; i<sorted_list_2.size(); i++){
            System.out.println(sorted_list_2.get(i).get_author());
        };
    }
}