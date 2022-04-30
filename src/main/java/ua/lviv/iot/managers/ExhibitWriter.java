package ua.lviv.iot.managers;

import ua.lviv.iot.museum.Exhibit;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import lombok.NoArgsConstructor;

public class ExhibitWriter {

    private String fileName;


    public void writeToFile(List<Exhibit> exhibitsList) {

            try(FileWriter writer = new FileWriter("result.csv")) {
            String currentHeader = "";

            for(Exhibit exhibit: exhibitsList){

                if (!exhibit.getHeaders().equals(currentHeader)) {
                    currentHeader = exhibit.getHeaders();
                    writer.write(exhibit.getHeaders());
                    writer.write("\r\n");
                }
                writer.write(exhibit.toCSV());
                writer.write("\r\n");

            }
        }catch (IOException e){
                System.out.println("error, can't create file"+ e);
            }
    }
}
