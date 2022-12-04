import java.util.HashMap;
import java.util.Scanner;

public class WordFrequency {

    HashMap<String, Integer> wordMap = new HashMap<>();

    Scanner sc = new Scanner(System.in);

    private String highestFreqWord(){
        System.out.println("Please enter each word: ");

        while (sc.hasNext()) {
            String curWord = sc.nextLine();
            if (curWord.equals("exit")) {
                break;
            }
            if (curWord.length() <= 3) {
                continue;
            }
            if (wordMap.containsKey(curWord)) {
                wordMap.put(curWord, wordMap.get(curWord) + 1);
            }
            else{
                wordMap.put(curWord, 1);
            }
        }
        String freqWord = "";
        int maxFreq = 0;
        for (String k : wordMap.keySet()){
            System.out.println((String.format("%s__" + k, wordMap.get(k))));
            if (wordMap.get(k) > maxFreq) {
                freqWord = k;
                maxFreq = wordMap.get(k);
            }
        }

        return freqWord;
    }

    public static void main(String[] args){
        WordFrequency wd = new WordFrequency();
        String highestWord = wd.highestFreqWord();
        System.out.println(highestWord);
    }

}
