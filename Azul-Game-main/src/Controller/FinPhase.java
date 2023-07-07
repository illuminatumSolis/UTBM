package Controller;

import Model.*;
import View.GameGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Model.FinPhaseVerif.DisquesVides;

public class FinPhase implements ActionListener {

    Jeu jeuEnCours;

    public FinPhase(Jeu j){
        this.jeuEnCours = j;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // && jeuEnCours.getCentrejeu().isEmptycentre() == true
        if(DisquesVides(jeuEnCours) == true && jeuEnCours.getCentrejeu().isEmptycentre() == true) {
            int n = jeuEnCours.getPhase();
            popupFinPhase(n);
            jeuEnCours.setPhase(n + 1);

            //Deplacement vers motif
            for(Joueur j : jeuEnCours.getJoueurs()){
//                System.out.println("Avant");
//                for( int i =0; i < 5 ;i++){
//                    for( int k =0; k < 5 ;k++){
//                        System.out.println(j.getPlateaujoueur().getMotifPlateau().getTabMotif(i,k).getEmpty());
//                    }
//                }

//                DeplacementVersMotif.deplacementUvEscalierMotif(j);


                String[] ligneColor = new String[5];

                UV[] l1 = j.getEscalierLigne(0);
                UV[] l2 = j.getEscalierLigne(1);
                UV[] l3 = j.getEscalierLigne(2);
                UV[] l4 = j.getEscalierLigne(3);
                UV[] l5 = j.getEscalierLigne(4);

                if (isComplete(l1)) {
                    if(l1[0] != null){
//                        System.out.println("1"+l1[0].getCouleur());
                        String a = l1[0].getCouleur();
                        for(int i = 0; i < 5; i++){
                            System.out.println(j.getColorButton(i));
                            if(j.getColorButton(i) == a){
                                System.out.println("okok");
                                GameGUI.motifComplete(j.getMotifIHMsolo(i));

                                // Vidage des escalier pleins
                                VidageEscalier.viderLigne(l1);
                                GameGUI.videLigneEscalier(j.getStairs1()[0]);
                            }
                        }


                    }
                }
                if (isComplete(l2)) {
                    if(l2[0] != null){
//                        System.out.println("2"+l2[0].getCouleur())
                        String a = l2[0].getCouleur();
                        for(int i = 5; i < 10; i++){
                            System.out.println(j.getColorButton(i));
                            if(j.getColorButton(i) == a){
                                System.out.println("okok");
                                GameGUI.motifComplete(j.getMotifIHMsolo(i));

                                // Vidage des escalier pleins
                                VidageEscalier.viderLigne(l2);
                                GameGUI.videLigneEscalier(j.getStairs2()[0]);
                                GameGUI.videLigneEscalier(j.getStairs2()[1]);
                            }
                        };
                    }
                }
                if (isComplete(l3)) {
                    if(l3[0] != null){
//                        System.out.println("3"+l3[0].getCouleur());
                        String a = l3[0].getCouleur();
                        for(int i = 10; i < 15; i++){
                            System.out.println(j.getColorButton(i));
                            if(j.getColorButton(i) == a){
                                System.out.println("okok");
                                GameGUI.motifComplete(j.getMotifIHMsolo(i));

                                // Vidage des escalier pleins
                                VidageEscalier.viderLigne(l3);
                                GameGUI.videLigneEscalier(j.getStairs3()[0]);
                                GameGUI.videLigneEscalier(j.getStairs3()[1]);
                                GameGUI.videLigneEscalier(j.getStairs3()[2]);
                            }
                        }
                    }
                }
                if (isComplete(l4)) {
                    if(l4[0] != null){
//                        System.out.println("4"+l4[0].getCouleur());
                        String a = l4[0].getCouleur();
                        for(int i = 15; i < 20; i++){
                            System.out.println(j.getColorButton(i));
                            if(j.getColorButton(i) == a){
                                System.out.println("okok");
                                GameGUI.motifComplete(j.getMotifIHMsolo(i));

                                // Vidage des escalier pleins
                                VidageEscalier.viderLigne(l3);
                                GameGUI.videLigneEscalier(j.getStairs4()[0]);
                                GameGUI.videLigneEscalier(j.getStairs4()[1]);
                                GameGUI.videLigneEscalier(j.getStairs4()[2]);
                                GameGUI.videLigneEscalier(j.getStairs4()[3]);
                            }
                        }
                    }
                }
                if (isComplete(l5)) {
                    if(l5[0] != null){
//                        System.out.println("5"+l5[0].getCouleur());
                        String a = l5[0].getCouleur();
                        for(int i = 20; i < 25; i++){
                            System.out.println(j.getColorButton(i));
                            if(j.getColorButton(i) == a){
                                System.out.println("okok");
                                GameGUI.motifComplete(j.getMotifIHMsolo(i));

                                // Vidage des escalier pleins
                                VidageEscalier.viderLigne(l3);
                                GameGUI.videLigneEscalier(j.getStairs5()[0]);
                                GameGUI.videLigneEscalier(j.getStairs5()[1]);
                                GameGUI.videLigneEscalier(j.getStairs5()[2]);
                                GameGUI.videLigneEscalier(j.getStairs5()[3]);
                                GameGUI.videLigneEscalier(j.getStairs5()[4]);
                            }
                        }
                    }
                }

//                System.out.println("Apres");
//                for( int i =0; i < 5 ;i++){
//                    for( int k =0; k < 5 ;k++){
//                        System.out.println(j.getPlateaujoueur().getMotifPlateau().getTabMotif(i,k).getEmpty());
//                    }
//                }
                System.out.println("Score joueur" + j.getScore());
                GameGUI.reloadScore(j);

            }

            // Remplissage des disques
//            GameGUI.newAleaDisque(jeuEnCours, 1, jeuEnCours.getDisquesTabComponent())
//            for(int i = 0; i<jeuEnCours.getNbdisques(); i++){
//                GameGUI.newAleaDisque(jeuEnCours , 1, jeuEnCours.getDisque1IHM());
//            }

            for(Disque d : jeuEnCours.getTabDisques() ){
                d.setEmpty(false);
                String[] newUV = new String[4];
//                for(JButton uv : d.getTabButtonDisqueUv()){
                for(int i=0; i< d.getTabButtonDisqueUv().length; i++){
                    String a = GameGUI.newAleaDisque(jeuEnCours , d.getId() , d.getTabButtonDisqueUv()[i]);
                    newUV[i]=a;
                }
                int y = 0;
                for(UV uv: d.getDisqueTabUv()){
                    System.out.println("Avant" + uv.getCouleur());
                    uv.setCouleur(newUV[y]);
                    y+=1;
                    System.out.println("Apres"+uv.getCouleur());
                }
            }
            for(Component c : jeuEnCours.getDisquesIHM()){
                c.setEnabled(true);
            }


            //Refaire l'ordre des joueurs en fonction du jeton1
        }
    }

    static void popupFinPhase(int n){
        JDialog dialog = new JDialog();
        JPanel corps = new JPanel();
        corps.setLayout(new GridLayout(2, 1));
        JLabel txt = new JLabel("Phase terminée");
        JButton okButton = new JButton("OK");
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });

        corps.add(txt);
        corps.add(okButton, BorderLayout.CENTER);
        dialog.add(corps);

        dialog.setLocationRelativeTo(null);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setSize(300, 200);
        dialog.setVisible(true);
    }


    public static boolean isComplete(UV[] array){
        boolean isComplete = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                isComplete = false;
                break;
            }
        }
        return isComplete;
    }


}
