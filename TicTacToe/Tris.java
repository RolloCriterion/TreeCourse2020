
public class Tris {

    private boolean giocatore1 = true;

    public void inizzScacc(char[][] s){
        for(int row=0; row<s.length; row++){
            for(int column=0; column<s.length; column++){
                s[row][column] = '-';
            }
        }
    }
    public void stampaScac(char[][] s){
        for(int row=0; row<s.length; row++){
            for(int column=0; column<s.length; column++){
                System.out.print(s[row][column]);
            }
            System.out.println();
        }
    }

    public void inserisciXO(char[][] s, int riga, int colonna){
        if(s[riga][colonna] == '-'){
            s[riga][colonna] = cambioCharGiocato();
        }
        else {
            System.out.print("Casella già occupata, prova un altra\n");
        }
    }
    public char cambioCharGiocato(){
        if(giocatore1){
            giocatore1 = false;
            return 'X';
        }
        else{
            giocatore1 = true;
            return 'O';
        }
    }

    public boolean checkTris(char[][] s){
        int count=0;
        char XO = 'O';
        if(!giocatore1){
            XO = 'X';
        }
        for(int row=0; row<s.length; row++){
            for(int column=0; column<s.length; column++){
                if(s[row][column]==XO || s[column][row]==XO){
                    count++;
                }
            }
            if(count==3){
                System.out.print("\nGiocatore: "+XO+" ha vinto!\n");
                return true;
            }
            count=0;
        }
        if(s[0][0]==XO && s[1][1]==XO && s[2][2]==XO ||
                s[2][0]==XO && s[1][1]==XO && s[0][2]==XO){
            System.out.print("\nGiocatore: "+XO+" ha vinto!\n");
            return true;
        }
        return false;
    }
}
