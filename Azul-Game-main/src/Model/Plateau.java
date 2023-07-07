package Model;

public class Plateau {
    protected Motif motifPlateau=new Motif();
    protected Escalier escalierPlateau=new Escalier();
    protected UV[] tabMinus=new UV[6];


    Plateau(){    }

    Plateau(Motif m,Escalier e,UV[] tabm){
        motifPlateau=m;
        escalierPlateau=e;
        tabMinus=tabm;
    }

    public Motif getMotifPlateau() {
        return motifPlateau;
    }
}