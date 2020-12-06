package Dictionary;

public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();

        dictionary.addWord('c', "calcio", "sport");
        dictionary.addWord('c', "calcio", "elemento chimico");

        dictionary.addWord('d', "dado", "oggetto");
        dictionary.addWord('d', "domodossola", "citta");
        dictionary.addWord('d', "domodossola", "cosa");
        dictionary.addWord('d', "dentista", "male");

        dictionary.addWord('a', "aereo", "oggetto");

        dictionary.printDictionary();
    }
}
