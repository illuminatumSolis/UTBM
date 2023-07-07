package Model;

public class UV {
    protected boolean empty=true;
    private  String couleur;
    private  int nbcdts;

    UV(){
        this.couleur="NO_COLOR";
    }

    public String getCouleur(){return this.couleur;}

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getNbcdts(){return this.nbcdts;}
    public boolean getEmpty(){return this.empty;}

    UV(String c,int nc){
        couleur=c;
        nbcdts=nc;
//        empty = false;
    }

}