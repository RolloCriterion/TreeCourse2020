import java.util.Random;
import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to encrypt(1) of decrypt(2)? ");
        int a = sc.nextInt();
        String strg;
        int cryptCode;
        switch(a){
            case 1:
                System.out.println("Insert the word to encrypt: ");
                strg = sc.next();
                System.out.println("Set the encryption value (between 1 and 25): ");
                cryptCode = sc.nextInt();
                if(cryptCode>=1 && cryptCode<=25)
                    System.out.println("The encrypt word id "+Encrypt(strg, cryptCode));
                else
                    System.out.println("Comand not valid");
                break;
            case 2:
                System.out.println("Insert the word to encrypt: ");
                strg = sc.next();
                System.out.println("Set the encryption value (between 1 and 25): ");
                cryptCode = sc.nextInt();
                if(cryptCode>=1 && cryptCode<=25)
                    System.out.println("The encrypt word id "+Decrypt(strg, cryptCode));
                else
                    System.out.println("Comand not valid");
                break;
            default:
                System.out.println("Comand not valid");
                break;
        }
    }
    public static String Encrypt(String s, int cryptCode){
            char[] word = s.toCharArray();
        for(int i=0; i<s.length(); i++)
                word[i]+=cryptCode;
        s = String.valueOf(word);
        return s;
    }
    public static String Decrypt(String s, int cryptCode){
            char[] word = s.toCharArray();
            for(int i=0; i<s.length(); i++)
                word[i]-=cryptCode;
            s = String.valueOf(word);
            return "The encrypt word id "+s;
    }
}
