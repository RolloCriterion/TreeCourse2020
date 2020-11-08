import java.util.Scanner;

public class Anagrams {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert first string: ");
        String stringa1 = sc.next();
        System.out.print("Insert second string: ");
        String stringa2 = sc.next();
        anagramma(stringa1, stringa2);
    }

    public static void anagramma(String strg1, String strg2){
        strg1 = strg1.toLowerCase();
        strg2 = strg2.toLowerCase();
        char[] copia = strg2.toCharArray();
        int counter=0;

        if(strg1.length() == strg2.length()){
            for(int i=0; i<strg1.length(); i++){
                for(int k=0; k<strg1.length(); k++){
                    if(strg1.charAt(i) == copia[k]){
                        counter++;
                        copia[k] = ' ';
                        break;
                    }
                }
            }
        }
        if(counter == strg1.length()){
            System.out.print(strg1+" is the anagram of "+strg2);
        }
        else{
            System.out.print("Is not an anagram");
        }
    }
}