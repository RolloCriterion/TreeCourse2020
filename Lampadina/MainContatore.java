package OOP1.Lampadina;

import java.util.Scanner;

public class MainContatore {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        AttStacCorrente corrente = new AttStacCorrente();
        Lampadina lampa = new Lampadina(corrente);
        Interruttore ttore = new Interruttore(lampa);
        Interruttore ttore2 = new Interruttore(lampa);
        int bottone=0;

        while (bottone!=2){
            System.out.print("0: Interruttore1\n1: Interruttore2\n2: StopProgramma\n3: Attacca corrente\n4: Stacca corrente\n-");
            bottone = sc.nextInt();
            if(corrente.StatoCorrente() == Corrente.CE || bottone == 3){
                switch (bottone){
                    case 0:
                        ttore.interruttoreCLick();
                        System.out.print(lampa.Stato()+"\n");
                        break;
                    case 1:
                        ttore2.interruttoreCLick();
                        System.out.print("Interruttore2\n"+lampa.Stato()+"\n");
                        break;
                    case 2:
                        System.out.println("Ciao");
                        break;
                    case 3:
                        corrente.SwitchCorrente();
                        System.out.print("Corrente Attivata\n");
                        break;
                    case 4: corrente.SwitchCorrente();
                        System.out.print("Corrente Disattivata\n");
                        break;
                    default: System.out.print("Bottone non valido\n"); break;
                }
            }
            else {
                System.out.print("Non ce corrente\n");
            }
        }
    }
}
