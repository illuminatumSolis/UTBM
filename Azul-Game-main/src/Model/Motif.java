package Model;

public class Motif {
    protected  static UV[][] tabMotif=new UV [5][5];


    Motif(){
        tabMotif[0][0] = new UV("Bleu",6);
        tabMotif[0][1] = new UV("Orange",6);
        tabMotif[0][2] = new UV("Rouge",6);
        tabMotif[0][3] = new UV("Noir",6);
        tabMotif[0][4] = new UV("White",6);

        tabMotif[1][0] = new UV("White",6);
        tabMotif[1][1] =  new UV("Bleu",6);
        tabMotif[1][2] = new UV("Orange",6);
        tabMotif[1][3] = new UV("Rouge",6);
        tabMotif[1][4] = new UV("Noir",6);

        tabMotif[2][0] = new UV("Noir",6);
        tabMotif[2][1] = new UV("White",6);
        tabMotif[2][2] = new UV("Bleu",6);
        tabMotif[2][3] = new UV("Orange",6);
        tabMotif[2][4] = new UV("Rouge",6);

        tabMotif[3][0] = new UV("Rouge",6);
        tabMotif[3][1] = new UV("Noir",6);
        tabMotif[3][2] = new UV("White",6);
        tabMotif[3][3] = new UV("Bleu",6);
        tabMotif[3][4] = new UV("Orange",6);

        tabMotif[4][0] = new UV("Orange",6);
        tabMotif[4][1] = new UV("Rouge",6);
        tabMotif[4][2] = new UV("Noir",6);
        tabMotif[4][3] = new UV("White",6);
        tabMotif[4][4] = new UV("Bleu",6);

    }

    public static UV getTabMotif(int i,int k) {
        return tabMotif[i][k];
    }
    Motif(UV[][] tabM){
        tabMotif=tabM;
    }

    public void isDone(){
        //renvoie si le motif est atteinu ou non
    }
}