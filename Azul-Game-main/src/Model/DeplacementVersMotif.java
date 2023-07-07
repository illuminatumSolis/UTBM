package Model;

public class DeplacementVersMotif {

        //appel de cette fonction UNE SEULE fois pour chaque joueur afin de realiser les deplacements si faisable pour chaque ligne
        public static void deplacementUvEscalierMotif(Joueur Joueur){

            int counter =0;
            int posmotif=0;
            boolean skip = true;
            for( int i =0; i < 5 ;i++){
                switch(i){
                    case 0 :{
                        counter=0;
                        posmotif=0;
                        skip = true;
                        if(Joueur.plateaujoueur.escalierPlateau.tabl1[i] != null) counter ++;
                        if(counter >= Joueur.plateaujoueur.escalierPlateau.tabl1.length) {
                            //Modification Motif
                            for (int k = 0; k < Joueur.plateaujoueur.motifPlateau.tabMotif.length; k++) {
                                if (Joueur.plateaujoueur.motifPlateau.tabMotif[i][k].getCouleur().equals(Joueur.plateaujoueur.escalierPlateau.tabl1[0].getCouleur())){
                                    if(Joueur.plateaujoueur.motifPlateau.tabMotif[i][k].empty == true){
                                    Joueur.plateaujoueur.motifPlateau.tabMotif[i][k].empty = false;
                                    posmotif = k;
                                    skip = false;
                                    break;
                                    }
                                }
                            }
                            //Appel calcul score
                            if(!skip){
                            CalculPoints.calculPoints(Joueur,posmotif,0);
                            DeplacementVersMinus.deplacementVersMinus(Joueur,0);
                            }

                        }
                        break;}
                    case 1 :{
                        counter=0;
                        posmotif=0;
                        skip = true;
                        for(int j=0; j < Joueur.plateaujoueur.escalierPlateau.tabl2.length; j++){
                            if(Joueur.plateaujoueur.escalierPlateau.tabl2[j] != null) counter ++;}
                        if(counter >= Joueur.plateaujoueur.escalierPlateau.tabl2.length) {
                            //Modification Motif
                            for (int k = 0; k < Joueur.plateaujoueur.motifPlateau.tabMotif.length; k++) {
                                if (Joueur.plateaujoueur.motifPlateau.tabMotif[i][k].getCouleur().equals(Joueur.plateaujoueur.escalierPlateau.tabl2[0].getCouleur())){
                                    if(Joueur.plateaujoueur.motifPlateau.tabMotif[i][k].empty == true){
                                    Joueur.plateaujoueur.motifPlateau.tabMotif[i][k].empty = false;
                                    posmotif = k;
                                    skip = false;
                                    break;
                                    }
                                }
                            }
                            //Appel calcul score
                            if(!skip) {
                                CalculPoints.calculPoints(Joueur, posmotif, 1);
                                DeplacementVersMinus.deplacementVersMinus(Joueur,1);
                            }

                        }
                        break;}
                    case 2 :{
                        counter=0;
                        posmotif=0;
                        skip = true;
                        for(int j=0; j < Joueur.plateaujoueur.escalierPlateau.tabl3.length; j++){
                            if(Joueur.plateaujoueur.escalierPlateau.tabl3[j] != null) counter ++;}
                        if(counter >= Joueur.plateaujoueur.escalierPlateau.tabl3.length) {
                            //Modification Motif
                            for (int k = 0; k < Joueur.plateaujoueur.motifPlateau.tabMotif.length; k++) {
                                if (Joueur.plateaujoueur.motifPlateau.tabMotif[i][k].getCouleur().equals(Joueur.plateaujoueur.escalierPlateau.tabl3[0].getCouleur())){
                                    if(Joueur.plateaujoueur.motifPlateau.tabMotif[i][k].empty == true) {
                                        Joueur.plateaujoueur.motifPlateau.tabMotif[i][k].empty = false;
                                        posmotif = k;
                                        skip = false;
                                        break;
                                    }
                                }
                            }
                            //Appel calcul score
                            if(!skip){
                            CalculPoints.calculPoints(Joueur,posmotif,2);
                            DeplacementVersMinus.deplacementVersMinus(Joueur,2);
                            }

                        }
                        break;}
                    case 3 :{
                        counter=0;
                        posmotif=0;
                        skip = true;
                        for(int j=0; j < Joueur.plateaujoueur.escalierPlateau.tabl4.length; j++){
                            if(Joueur.plateaujoueur.escalierPlateau.tabl4[j] != null) counter ++;}
                        if(counter >= Joueur.plateaujoueur.escalierPlateau.tabl4.length) {
                            //Modification Motif
                            for (int k = 0; k < Joueur.plateaujoueur.motifPlateau.tabMotif.length; k++) {
                                if (Joueur.plateaujoueur.motifPlateau.tabMotif[i][k].getCouleur().equals(Joueur.plateaujoueur.escalierPlateau.tabl4[0].getCouleur())) {
                                    if (Joueur.plateaujoueur.motifPlateau.tabMotif[i][k].empty == true) {
                                        Joueur.plateaujoueur.motifPlateau.tabMotif[i][k].empty = false;
                                        posmotif = k;
                                        skip = false;
                                        break;
                                    }
                                }
                            }
                            //Appel calcul score
                            if (!skip){
                            CalculPoints.calculPoints(Joueur, posmotif, 3);
                            DeplacementVersMinus.deplacementVersMinus(Joueur,3);
                        }

                        }
                        break;}
                    case 4 :{
                        counter=0;
                        posmotif=0;
                        skip = true;
                        for(int j=0; j < Joueur.plateaujoueur.escalierPlateau.tabl5.length; j++){
                            if(Joueur.plateaujoueur.escalierPlateau.tabl5[j] != null) counter ++;}
                        if(counter >= Joueur.plateaujoueur.escalierPlateau.tabl5.length) {
                            //Modification Motif
                            for (int k = 0; k < Joueur.plateaujoueur.motifPlateau.tabMotif.length; k++) {
                                if (Joueur.plateaujoueur.motifPlateau.tabMotif[i][k].getCouleur().equals(Joueur.plateaujoueur.escalierPlateau.tabl5[0].getCouleur())) {
                                    if (Joueur.plateaujoueur.motifPlateau.tabMotif[i][k].empty == true) {
                                        Joueur.plateaujoueur.motifPlateau.tabMotif[i][k].empty = false;
                                        posmotif = k;
                                        skip = false;
                                        break;
                                    }
                                }
                            }
                            //Appel calcul score
                            if (!skip){
                                CalculPoints.calculPoints(Joueur, posmotif, 4);
                                DeplacementVersMinus.deplacementVersMinus(Joueur,4);
                        }

                        }
                        break;}
                }

            }
        }


}
