package Model;

public class CalculPoints {
    protected static void calculPoints(Joueur Joueur, int posmotif,int ligne){

        int j=0;
        int phaseScore =0;
        //Algo phaseScore calcul
        int nbsucc=1;
        j=posmotif+1;
        //Parcours right
        while(j<=4){
            if(Joueur.plateaujoueur.motifPlateau.tabMotif[ligne][j].empty == false){nbsucc++;j++;}
            else break;
        }
        //Parcours left
        j=posmotif-1;
        while(j>=0){
            if(Joueur.plateaujoueur.motifPlateau.tabMotif[ligne][j].empty == false){nbsucc++;j--;}
            else break;
        }

        // Score horiz =>
        phaseScore+= nbsucc;
        //reset nbsucc;
        nbsucc =1;


        //Parcours up
        j=posmotif-1;
        while(j >= 0){
            if(Joueur.plateaujoueur.motifPlateau.tabMotif[ligne][j].empty == false){nbsucc++;j--;}
            else break;
        }
        //Parcours down
        j=posmotif+1;
        while(j<=4){
            if(Joueur.plateaujoueur.motifPlateau.tabMotif[ligne][j].empty == false){nbsucc++;j++;}
            else break;
        }

        // Score Verti =>
        phaseScore += nbsucc;


        //globalScore += phaseScore;
        Joueur.addOnScore(phaseScore);

    }

    protected static void calculPointsBonus(Joueur Joueur){
        int nbsucc=0;
        int nbhorizontale=0;
        int nbverticale=0;
        int j=0;

        //Parcours Ligne horizontale
        for(int i=0; i<Joueur.plateaujoueur.motifPlateau.tabMotif.length; i++){
            nbsucc=0;
            j=0;
            while(Joueur.plateaujoueur.motifPlateau.tabMotif[i][j].empty != true){
                nbsucc++;
                j++;}
            if(nbsucc == 5) nbhorizontale++;
        }
        //Parcours Ligne Verticale
        for(int i=0; i<Joueur.plateaujoueur.motifPlateau.tabMotif.length; i++){
            nbsucc=0;
            j=0;
            while(Joueur.plateaujoueur.motifPlateau.tabMotif[j][i].empty != true){
                nbsucc++;
                j++;}
            if(nbsucc == 5) nbverticale++;
        }
        //ajout points Bonus Completion Lignes
        if(nbhorizontale != 0) Joueur.addOnScore(nbhorizontale * 2);
        if(nbverticale != 0) Joueur.addOnScore(nbverticale * 7);

        int nbR,nbB,nbViolet,nbJ,nbVert;
        nbR=nbB=nbViolet=nbJ=nbVert=0;
        for(int k=0; k < Joueur.plateaujoueur.motifPlateau.tabMotif.length;k++){
            for(int l=0; l < Joueur.plateaujoueur.motifPlateau.tabMotif.length;l++){
                switch(Joueur.plateaujoueur.motifPlateau.tabMotif[k][l].getCouleur()){
                    case "Rouge":{ nbR++;
                        break;}
                    case "Violet":{ nbViolet++;
                        break;}
                    case "Bleu":{ nbB++;
                        break;}
                    case "Jaune":{ nbJ++;
                        break;}
                    case "Vert":{ nbVert++;
                        break;}
                }
            }
        }
        //ajout points Bonus completion 5 pieces
        if(nbR == 5) Joueur.addOnScore(10);
        if(nbJ == 5) Joueur.addOnScore(10);
        if(nbB == 5) Joueur.addOnScore(10);
        if(nbVert == 5) Joueur.addOnScore(10);
        if(nbViolet == 5) Joueur.addOnScore(10);
    }

    protected static void calculPointsMinus(Joueur Joueur){

    for(int i=0;i< Joueur.plateaujoueur.tabMinus.length;i++){

        if(i==0 || i==1 || i==2){
            if(Joueur.plateaujoueur.tabMinus[i] != null) Joueur.addOnScore(-1);
        }
            if(i==3 || i==4 || i==5){
                if(Joueur.plateaujoueur.tabMinus[i] != null) Joueur.addOnScore(-2);
            }
                if(i==6 || i==7 || i==8){
                    if(Joueur.plateaujoueur.tabMinus[i] != null) Joueur.addOnScore(-3);
                }
                    if(i==9){
                        if(Joueur.plateaujoueur.tabMinus[i] != null) Joueur.addOnScore(-4);
                    }
            }
    }

}
