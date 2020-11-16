
public class Lampadina {

    StatoLampadina stato;
    AttStacCorrente corren;
    int count = 0;
    int rompe = 5;

    public Lampadina(AttStacCorrente corren) {
        this.corren = corren;
        stato = StatoLampadina.SPENTO;
    }
    public StatoLampadina Stato(){
        return stato;
    }
    public void Click(){
        count++;
        if(count<rompe && corren.StatoCorrente() == Corrente.CE){
            switch (stato){
                case SPENTO:
                    stato = StatoLampadina.ACCESO;
                    break;
                case ACCESO:
                    stato = StatoLampadina.SPENTO;
                    break;
            }
        }
        else if(count<rompe && corren.StatoCorrente() == Corrente.NONCE){
            stato = StatoLampadina.SPENTO;
        }
        else{
            stato = StatoLampadina.FULMINATA;
        }
    }

}
