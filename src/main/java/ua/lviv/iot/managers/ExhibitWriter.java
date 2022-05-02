package ua.lviv.iot.managers;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import ua.lviv.iot.museum.Exhibit;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class ExhibitWriter {


    @SuppressFBWarnings("DM_DEFAULT_ENCODING")
    public void writeToFile(List<Exhibit> exhibitsList) throws IOException {

        try (FileWriter writer = new FileWriter("result.csv")) {
            String currentHeader = "";

            for (Exhibit exhibit : exhibitsList) {

                if (!exhibit.getHeaders().equals(currentHeader)) {
                    currentHeader = exhibit.getHeaders();
                    writer.write(exhibit.getHeaders());
                    writer.write("\r\n");
                }
                writer.write(exhibit.toCSV());
                writer.write("\r\n");

            }
        }
    }
}
