package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    private String[] strings;


    public WordCounter(String... strings) {
        this.strings = strings;
    }

    public Map<String, Integer> getWordCountMap() {
        Map<String, Integer> ouput =new HashMap<>();
        for(String s: strings) {
            if(!ouput.containsKey(s)) {
                ouput.put(s,1);
            }
            else {
                Integer count = ouput.get(s);
                ouput.put(s, count + 1);
            }
        }
        return ouput;
//        for(int i=0; i<strings.length; i++) {
//            String key = strings[i];
//            if(ouput.containsKey(key)) {
//                Integer value = ouput.get(key);
//                ouput.put(key, value + 1);
//            }
//            else {
//                ouput.put(key,  1);
//            }
//        }
//        return ouput;
    }
}
