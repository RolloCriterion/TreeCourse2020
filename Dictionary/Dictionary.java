package Dictionary;

import java.util.TreeMap;
import java.util.TreeSet;

public class Dictionary {

        TreeMap<Character, TreeMap<String, TreeSet<String>>> dictionary = new TreeMap<>();

        public void addWord(Character letter, String word, String meaning){
                if(dictionary.containsKey(letter)){
                        if(dictionary.get(letter).containsKey(word)){
                                dictionary.get(letter).get(word).add(meaning);
                        }
                        else {
                                TreeSet<String> mean = new TreeSet<>();
                                mean.add(meaning);
                                dictionary.get(letter).put(word, mean);
                        }
                }
                else {
                        TreeMap<String, TreeSet<String>> mapWord = new TreeMap<>();
                        TreeSet<String> mean = new TreeSet<>();
                        mean.add(meaning);
                        mapWord.put(word, mean);
                        dictionary.put(letter, mapWord);
                }

        }
        public void printDictionary(){
              for(Character c : dictionary.keySet()){
                      System.out.println(c);
                      for(String w : dictionary.get(c).keySet()){
                              System.out.println(w+": "+dictionary.get(c).get(w));
                      }
              }
        }
}
