import java.util.Scanner;

public class MainTris {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Tris tris = new Tris();
        boolean gameOver = false;
        char[][] scacchie = new char[3][3];

        tris.inizzScacc(scacchie);
        while(!gameOver){
            tris.stampaScac(scacchie);
            int giocaRiga = sc.nextInt();
            int giocaColonna= sc.nextInt();
            tris.inserisciXO(scacchie, giocaRiga, giocaColonna);
            gameOver=tris.checkTris(scacchie);
            if(gameOver==true){
                tris.stampaScac(scacchie);
            }
        }
    }

}
