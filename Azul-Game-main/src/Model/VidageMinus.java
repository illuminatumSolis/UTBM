package Model;

public class VidageMinus {
    protected static void viderTabMinus(Joueur Joueur){
        for(int i=0; i< Joueur.plateaujoueur.tabMinus.length; i++) Joueur.plateaujoueur.tabMinus[i] = null;
    }

}
