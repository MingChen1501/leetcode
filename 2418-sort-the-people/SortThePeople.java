import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortThePeople {
    public static void main(String[] args) {
        String[] names = {"Marry", "John", "Emma"};
        int[] heights = {180, 156, 170};
        String[] result = sortPeople(names, heights);
        for (String name : result) {
            System.out.print(name + " ");
        }
    }

    private static String[] sortPeople(String[] names, int[] heights) {
        String[] result = new String[names.length];
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        int index = 0;
        for (int i = heights.length - 1; i >= 0; i--) {
            result[index++] = map.get(heights[i]);
        }
        return result;
    }
}
