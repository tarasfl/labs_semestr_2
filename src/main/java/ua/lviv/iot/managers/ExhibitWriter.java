package ua.lviv.iot.managers;


import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import ua.lviv.iot.museum.Exhibit;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.io.BufferedWriter;

public class ExhibitWriter {

    @SuppressFBWarnings("DM_DEFAULT_ENCODING")
    public void writeToFile(final List<Exhibit> exhibitsList) throws IOException {

        try (FileWriter writer = new FileWriter("result.csv");
                BufferedWriter bw = new BufferedWriter(writer)) {
            String currentHeader = "";

            for (Exhibit exhibit : exhibitsList) {

                if (!exhibit.getHeaders().equals(currentHeader)) {
                    currentHeader = exhibit.getHeaders();
                    bw.write(exhibit.getHeaders());
                    bw.newLine();
                }
                bw.write(exhibit.toCSV());
                bw.newLine();

            }
        }
    }
}
