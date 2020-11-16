package OOP1.Lampadina;

public class AttStacCorrente {

    Corrente corrente;

    public AttStacCorrente(){
        corrente = Corrente.NONCE;
    }
    public Corrente StatoCorrente(){
        return corrente;
    }
    public Corrente SwitchCorrente(){
        switch (corrente){
            case NONCE: corrente = Corrente.CE; break;
            case CE: corrente = Corrente.NONCE; break;
        }
        return corrente;
    }
}
