import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileWriter {
    public String convertToCSV(String[] data) {
        return Stream.of(data)
                //.map(this::escapeSpecialCharacters)
                .collect(Collectors.joining(";"));
    }

    public String escapeSpecialCharacters(String data) {
        String escapedData = data.replaceAll("\\R", " ");
        if (data.contains(",") || data.contains("\"") || data.contains("'")) {
            data = data.replace("\"", "\"\"");
            escapedData = "\"" + data + "\"";
        }
        return escapedData;
    }

    public void saveLinesToFile(PrintWriter pw, List<String[]> dataLines) throws IOException {
        dataLines.stream()
                .map(this::convertToCSV)
                .forEach(pw::println);
    }

    public void saveLineToFile(PrintWriter pw, String[] dataLine) throws IOException {
        pw.println(convertToCSV(dataLine));
    }
}
