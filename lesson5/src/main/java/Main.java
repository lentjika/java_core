import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        AppData data = new AppData();
        data.setHeader(new String[]{"a", "b", "c"});
        data.setData(new int[][]{{1, 2, 3}, {4, 5, 6}});
        AppDataWriter writer = new AppDataWriter();
        try {
            writer.writeToFile("test.csv", data);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        AppDataReader reader = new AppDataReader();
        try {
            reader.readFile("test.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
