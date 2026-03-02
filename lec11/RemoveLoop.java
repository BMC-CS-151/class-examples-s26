import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLoop {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "elderberry"));

        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() % 2 == 0) {
                words.remove(i);
                i -= 1;
            }
        }

        System.out.println(words);
    }
}

