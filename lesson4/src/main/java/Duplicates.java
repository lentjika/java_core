import java.util.HashMap;
import java.util.Map;

public class Duplicates {

    public static Map<String, Integer> processDuplicates(String[] array) {
        if (array == null)
            throw new IllegalArgumentException("array");
        Map<String, Integer> keyCountMap = new HashMap<>();
        for (String item : array) {
            if (keyCountMap.containsKey(item)) {
                keyCountMap.replace(item, keyCountMap.get(item) + 1);
            } else {
                keyCountMap.put(item, 1);
            }
        }
        return keyCountMap;
    }
}
