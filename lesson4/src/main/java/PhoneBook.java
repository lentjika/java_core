import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PhoneBook {
    private Map<String, HashSet<String>> innerData = new HashMap<>();

    public void add(String name, String phone) {
        if (!innerData.containsKey(name)) {
            HashSet<String> newBookItem = new HashSet<>();
            newBookItem.add(phone);
            innerData.put(name, newBookItem);
        } else {
            innerData.get(name).add(phone);
        }
    }

    public HashSet<String> get(String name) {
        return innerData.getOrDefault(name, new HashSet<String>());
    }
}
