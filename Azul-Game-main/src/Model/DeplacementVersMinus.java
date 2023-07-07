package Model;

public class DeplacementVersMinus {

    protected static void deplacementVersMinus(Joueur Joueur, int numeroLigne){

        int posTabMinus=0;
        int posTabEscalier=0;

                switch (numeroLigne){
                    case 0:{
                            while(posTabMinus <6 && posTabEscalier < Joueur.plateaujoueur.escalierPlateau.tabl1.length){
                                if(Joueur.plateaujoueur.tabMinus[posTabMinus] != null){
                                Joueur.plateaujoueur.tabMinus[posTabMinus] = Joueur.plateaujoueur.escalierPlateau.tabl1[posTabEscalier];
                                posTabMinus++;
                                posTabEscalier++;
                                }
                                else posTabMinus++;
                            }
                        VidageEscalier.viderLigne(Joueur.plateaujoueur.escalierPlateau.tabl1);
                        break;
                    }
                    case 1:{
                        while(posTabMinus <6 && posTabEscalier < Joueur.plateaujoueur.escalierPlateau.tabl2.length){
                            if(Joueur.plateaujoueur.tabMinus[posTabMinus] != null){
                                Joueur.plateaujoueur.tabMinus[posTabMinus] = Joueur.plateaujoueur.escalierPlateau.tabl2[posTabEscalier];
                                posTabMinus++;
                                posTabEscalier++;
                            }
                            else posTabMinus++;
                        }
                        VidageEscalier.viderLigne(Joueur.plateaujoueur.escalierPlateau.tabl2);
                        break;
                    }
                    case 2:{
                        while(posTabMinus <16&& posTabEscalier < Joueur.plateaujoueur.escalierPlateau.tabl3.length){
                            if(Joueur.plateaujoueur.tabMinus[posTabMinus] != null){
                                Joueur.plateaujoueur.tabMinus[posTabMinus] = Joueur.plateaujoueur.escalierPlateau.tabl3[posTabEscalier];
                                posTabMinus++;
                                posTabEscalier++;
                            }
                            else posTabMinus++;
                        }
                        VidageEscalier.viderLigne(Joueur.plateaujoueur.escalierPlateau.tabl3);
                        break;
                    }
                    case 3:{
                        while(posTabMinus <6 && posTabEscalier < Joueur.plateaujoueur.escalierPlateau.tabl4.length){
                            if(Joueur.plateaujoueur.tabMinus[posTabMinus] != null){
                                Joueur.plateaujoueur.tabMinus[posTabMinus] = Joueur.plateaujoueur.escalierPlateau.tabl4[posTabEscalier];
                                posTabMinus++;
                                posTabEscalier++;
                            }
                            else posTabMinus++;
                        }
                        VidageEscalier.viderLigne(Joueur.plateaujoueur.escalierPlateau.tabl4);
                        break;
                    }
                    case 4:{
                        while(posTabMinus <6 && posTabEscalier < Joueur.plateaujoueur.escalierPlateau.tabl5.length){
                            if(Joueur.plateaujoueur.tabMinus[posTabMinus] != null){
                                Joueur.plateaujoueur.tabMinus[posTabMinus] = Joueur.plateaujoueur.escalierPlateau.tabl5[posTabEscalier];
                                posTabMinus++;
                                posTabEscalier++;
                            }
                            else posTabMinus++;
                        }
                        VidageEscalier.viderLigne(Joueur.plateaujoueur.escalierPlateau.tabl5);
                        break;
                    }
                }



    }

}
