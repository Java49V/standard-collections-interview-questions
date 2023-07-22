package telran.interviews;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Words {
    private TreeSet<String> wordSet;

    public Words() {
        wordSet = new TreeSet<>();
    }

    public boolean addWord(String word) {
        return wordSet.add(word);
    }


    public List<String> getWordsByPrefix(String prefix) {
        List<String> result = new ArrayList<>();
        for (String word : wordSet) {
            if (word.toLowerCase().startsWith(prefix.toLowerCase())) {
                result.add(word);
            }
        }
        return result;
    }
}
