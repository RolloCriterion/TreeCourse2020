package Labirynth;
import java.util.Random;
import java.util.Scanner;

public class Labirinto {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean gameOver=false;
        char[][] labirinto = {{'w', 'w', 'w', 'w', 'w'},
                              {'w', 'p', 'w', '-', 'e'},
                              {'w', '-', '-', '-', 'w'},
                              {'w', '-', 'w', '-', 'w'},
                              {'w', 'w', 'w', 'w', 'w'},};

        //char[][] labirinto2 = new char[10][10];
        while(!gameOver){
            stampaLabirinto(labirinto);
            System.out.println("Usa WASD per muoverti");
            String wasd = sc.next();
            movement(labirinto, wasd);
            gameOver=checkGO(labirinto);
        }
        //stampaLabirintoCasuale(labirinto2);
    }
    public static void stampaLabirinto(char[][] labirint){
        for(int row=0; row<labirint.length; row++){
            for(int column=0; column<labirint.length; column++){
                    System.out.print(labirint[row][column] +" ");
            }
            System.out.println();
        }
    }
    public static void movement(char[][] labirint, String inputMovimento){
        switch(inputMovimento){
            case "w": muoviSu(labirint);break;
            case "a": muoviSinistra(labirint);break;
            case "s": muoviGiu(labirint);break;
            case "d": muoviDestra(labirint);break;
        }
    }
    public static void muoviGiu(char[][] labirint){
        int x = PosX(labirint);
        int y = PosY(labirint);
        if(labirint[x+1][y] != 'w'){
            labirint[x+1][y] = 'p';
            labirint[x][y] = '-';
        }
    }
    public static void muoviSu(char[][] labirint){
        int x = PosX(labirint);
        int y = PosY(labirint);
        if(labirint[x-1][y] != 'w'){
            labirint[x-1][y] = 'p';
            labirint[x][y] = '-';
        }
    }
    public static void muoviDestra(char[][] labirint){
        int x = PosX(labirint);
        int y = PosY(labirint);
        if(labirint[x][y+1] != 'w'){
            labirint[x][y+1] = 'p';
            labirint[x][y] = '-';
        }
    }
    public static void muoviSinistra(char[][] labirint){
        int x = PosX(labirint);
        int y = PosY(labirint);
        if(y-1<0) y=0;
        if(labirint[x][y-1] != 'w'){
            labirint[x][y-1] = 'p';
            labirint[x][y] = '-';
        }
    }
    public static int PosX(char[][] labirint){
        int x=0;
        for(int row=0; row<labirint.length; row++){
            for(int column=0; column<labirint.length; column++){
                if(labirint[row][column] == 'p'){
                    return x=row;
                }
            }
        }
        return x;
    }
    public static int PosY(char[][] labirint){
        int y=0;
        for(int row=0; row<labirint.length; row++){
            for(int column=0; column<labirint.length; column++){
                if(labirint[row][column] == 'p'){
                    return y=column;
                }
            }
        }
        return y;
    }
    public static boolean checkGO(char[][] labirint){
        if(labirint[1][4] == 'p'){
            System.out.println("Bravo, sei fuori!");
            return true;
        }
        return false;
    }

    public static void stampaLabirintoCasuale(char[][] labirint2){
        Random rand = new Random();
        for(int row=0; row<labirint2.length; row++){
            for(int column=0; column<labirint2.length; column++){
                int random = rand.nextInt(2);
                if(row==0 || row== labirint2.length-1){
                    System.out.print('w');
                }
                else if(column==0 || column== labirint2.length-1){
                    System.out.print('w');
                }
                else if(random==0) System.out.print('w');
                else System.out.print('-');

                System.out.print(labirint2[row][column] +" ");
            }
            System.out.println();
        }
    }
}
