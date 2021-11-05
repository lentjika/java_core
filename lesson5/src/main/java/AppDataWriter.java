import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AppDataWriter {

    public void writeToFile(String fileName, AppData appData) throws IOException, NullPointerException {
        if (fileName == null)
            throw new IllegalArgumentException("fileName");
        if (appData == null)
            throw new IllegalArgumentException("appData");
        if (appData.getData() == null)
            throw new IllegalArgumentException("appData.getData");
        if (appData.getHeader() == null)
            throw new IllegalArgumentException("appData.getHeader");
        File csvOutputFile = new File(fileName);
        csvOutputFile.createNewFile();
        FileWriter writer = new FileWriter();

        var dataStrings = Arrays.stream(appData.getData())
                .map(ints -> Arrays.stream(ints).mapToObj(String::valueOf).toArray(String[]::new))
                .collect(Collectors.toList());

        try (PrintWriter pw = new PrintWriter(csvOutputFile)) {
            writer.saveLineToFile(pw, appData.getHeader());
            writer.saveLinesToFile(pw, dataStrings);
        }
    }
}
