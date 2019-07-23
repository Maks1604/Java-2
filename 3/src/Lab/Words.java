package Lab;

import java.util.HashMap;

public class Words {
    private String[] words;
    Words(String[] words){
       this.words=words;
    }
    public HashMap<String, Integer> wordsCount(){
        HashMap<String, Integer> rezult = new HashMap<>();
        for (String word:words) {
            int count=repeatCount(word);
            rezult.put(word,count);
        }
        return rezult;
    }
    private int repeatCount(String word){
        int count=0;
        for (String selectWord:words) {
            if (word.equals(selectWord)){
                count++;
            }
        }
        return count;
    }
}
