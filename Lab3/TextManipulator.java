import java.util.*;

public class TextManipulator {
    public String dataset;

    public TextManipulator() {
        this.dataset = "";
    }

    public int numSent() {

        return this.dataset.split("[^!?.]+").length - 1;
    }

    public int numWords() {

        return this.dataset.split(" ").length;
    }


    public int numLetters() {

        int iterator = 0;

        for (int i = 0; i < this.dataset.length(); i++) {
            if (Character.isLetter(dataset.charAt(i))) {
                iterator++;
            }
        }

        return iterator;
    }


    public int numVocals() {

        int iterator = 0;

        String str = this.dataset;
        str = str.toLowerCase();

        for (int i = 0; i < this.dataset.length(); i++) {
            Character ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                iterator++;
            }
        }

        return iterator;
    }


    public int numCons() {

        int iterator = 0;

        String str = this.dataset;
        str = str.toLowerCase();

        for (int i = 0; i < this.dataset.length(); i++) {
            Character ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch != 'a' && ch != 'e' && ch != 'i' && ch != '0' && ch != 'u') {
                    iterator++;
                }
            }
        }

        return iterator;
    }


    public void longestWord() {
        String str = this.dataset;
        String[] word = str.split("([,.!?;|0-9\\s])");
        Arrays.toString(word);
        String longWord = "";
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() >= longWord.length()) {
                longWord = word[i];
            }
        }
        System.out.println(longWord);
    }


    public void oftenWords() {

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        ArrayList<String> arrayList = new ArrayList(Arrays.asList(this.dataset.toLowerCase().split("[,.!?;[0-9]\\s]+")));

        for (int i = 1; i <= 5; i++) {

            int maxValue = 0;

            for (String word : arrayList) {
                Integer number = map.get(word);
                if (number == null) number = 1;
                else number = ++number;
                map.put(word, number);
            }

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                int value = entry.getValue();
                if (value > maxValue) {
                    maxValue = value;
                }
            }

            String key = getKeyFromValue(map, maxValue);

            System.out.println(key);

            map.remove(key);
            arrayList.removeAll(Collections.singleton(key));
        }
    }

    public static String getKeyFromValue (Map < String, Integer > hashMap, Integer value){
        for (String word : hashMap.keySet()) {
            if (hashMap.get(word).equals(value)) {
                return word;
            }
        }
        return null;
    }


}