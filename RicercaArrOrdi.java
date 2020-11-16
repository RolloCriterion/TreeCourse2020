import java.util.Scanner;

public class RicercaArrOrdi {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 3, 10, 33, 44, 45, 100};
        System.out.print("Che posizione dell'array vuoi stampare? ");
        int a = sc.nextInt();
        //System.out.print("\n"+Ricerca(arr, a));
        System.out.print("\n"+Ricerca2(arr, a, 0, arr.length-1));
    }

    /*
    public static int Ricerca(int[] a, int cerca){
        for(int i =0; i<a.length; i++){
            if(cerca==a[i]){
                return i;
            }
        }
        return -1;
    }
     */
    public static int Ricerca2(int[] a, int cerca, int inizio, int fine){
        int mid=(inizio+fine)/2;
        if(inizio>fine){
            return -1;
        }
        else if(cerca == a[mid]){
            return mid;
        }
        else if(cerca<a[mid]){
            return Ricerca2(a, cerca, inizio, mid-1);
        }
        else{
            return Ricerca2(a, cerca, mid+1, fine);
        }
    }
}
