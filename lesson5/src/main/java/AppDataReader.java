import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppDataReader {
    public void readFile(String fileName) throws IOException {
        try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName)))
        {
            AppData data = new AppData();
            //headers
            String header = br.readLine();
            data.setHeader(header.split(";"));


            String line = br.readLine();
            List<String> dataStrings = new ArrayList<>();
            while (line != null){
                dataStrings.add(line);
                line = br.readLine();
            }

            var r = dataStrings.stream().map(s -> Arrays.stream(s.split(";")).mapToInt(Integer::parseInt).toArray()).toArray(int[][]::new);
            data.setData(r);

            System.out.println(Arrays.toString(data.getHeader()));
            Arrays.stream(data.getData()).forEach(ints -> System.out.println(Arrays.toString(ints)));
        }
    }
}
