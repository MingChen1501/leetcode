import java.util.LinkedHashMap;

public class LRUCache {
    public static void main(String[] args) {
        String[] strArr = {"A", "B", "A", "C", "A", "B", "A", "D", "A"};
        String result = ArrayChallenge(strArr);
        System.out.println("Final output: " + result);
    }

    private static String ArrayChallenge(String[] strArr) {
        LinkedHashMap<String, Integer> cache = new LinkedHashMap<>(5, 0.75f, true);
        StringBuilder result = new StringBuilder();

        for (String str : strArr) {
            cache.put(str, 1);
            result.setLength(0);
            result.append(String.join("-", cache.keySet()));
            result.append(" ");
        }

        return result.toString();
    }
}
