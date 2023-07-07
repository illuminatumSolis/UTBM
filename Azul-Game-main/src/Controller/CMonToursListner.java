package Controller;

import Model.Disque;
import Model.Jeu;
import Model.Joueur;
import Model.UV;
import View.GameGUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static View.GameGUI.frame;
import static View.GameGUI.suivantAffichageDisquesVide;

public class CMonToursListner implements ActionListener {
    Jeu jeuEnCours;
    GameGUI game = new GameGUI();


    public static void blockOthersEscalier(Jeu jeuEnCours){
        //System.out.println(jeuEnCours.getJoueurEnCours());
        Joueur tempJoueur = jeuEnCours.getJoueurs(jeuEnCours.getJoueurEnCours());
        for(Joueur Joueur : jeuEnCours.getJoueurs()){
            if( tempJoueur == Joueur){
                for(java.awt.Component tempComponent :Joueur.getEscalierLignesTabComponent()) {
                    tempComponent.setEnabled(true);}
            }
            else{
                for(java.awt.Component tempComponent :Joueur.getEscalierLignesTabComponent()) tempComponent.setEnabled(false);
            }
        }
    }
    public CMonToursListner(Jeu jeu) {
        this.jeuEnCours = jeu;
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        java.awt.Component tempComp = (java.awt.Component) e.getSource();
        tempComp.setEnabled(false);

        int nbJoueurs = this.jeuEnCours.getNbjoueurs();
        int n = this.jeuEnCours.getJoueurEnCours();
        game.suivantAffichageCentre(jeuEnCours.getCentreIHM());
        for(java.awt.Component comp: jeuEnCours.getDisquesTabComponent()){
            game.suivantAffichageDisques(comp);
            }

        for(Disque d : jeuEnCours.getTabDisques()){
            game.suivantAffichageDisquesVide(d, d.getComponentDisque());
        }

        if (jeuEnCours.getTourEnCours() > 1 || jeuEnCours.getTourEnCours() ==1 && jeuEnCours.getJoueurEnCours() != 0){
            GameGUI.choixCentrePossible(jeuEnCours.getCentreIHM());
        }

        switch (nbJoueurs) {

            case 1:
                System.out.println("Erreur");
                break;
            case 2:
                if (n == 0){
                    this.jeuEnCours.setJoueurEnCours(1);
                    game.cPasMonTour(this.jeuEnCours.getJoueurs(0).getPlateauJoueurIHM());
                    game.cMonTour(this.jeuEnCours.getJoueurs(1).getPlateauJoueurIHM());
                }
                else if (n == 1){
                    this.jeuEnCours.setJoueurEnCours(0);
                    game.cPasMonTour(this.jeuEnCours.getJoueurs(1).getPlateauJoueurIHM());
                    game.cMonTour(this.jeuEnCours.getJoueurs(0).getPlateauJoueurIHM());
                    int tour = jeuEnCours.getTourEnCours() + 1;
                    jeuEnCours.setTourEnCours(tour);
                }



                break;
            case 3:
                if (n == 0){
                    this.jeuEnCours.setJoueurEnCours(1);
                    game.cPasMonTour(this.jeuEnCours.getJoueurs(0).getPlateauJoueurIHM());
                    game.cMonTour(this.jeuEnCours.getJoueurs(1).getPlateauJoueurIHM());
                }
                else if (n == 1){
                    this.jeuEnCours.setJoueurEnCours(2);
                    game.cPasMonTour(this.jeuEnCours.getJoueurs(1).getPlateauJoueurIHM());
                    game.cMonTour(this.jeuEnCours.getJoueurs(2).getPlateauJoueurIHM());
                }
                else if (n == 2){
                    this.jeuEnCours.setJoueurEnCours(0);
                    game.cPasMonTour(this.jeuEnCours.getJoueurs(2).getPlateauJoueurIHM());
                    game.cMonTour(this.jeuEnCours.getJoueurs(0).getPlateauJoueurIHM());
                    int tour = jeuEnCours.getTourEnCours() + 1;
                    jeuEnCours.setTourEnCours(tour);
                }

                break;
            case 4:
                if (n == 0){
                    this.jeuEnCours.setJoueurEnCours(1);
                    game.cPasMonTour(this.jeuEnCours.getJoueurs(0).getPlateauJoueurIHM());
                    game.cMonTour(this.jeuEnCours.getJoueurs(1).getPlateauJoueurIHM());
                }
                else if (n == 1){
                    this.jeuEnCours.setJoueurEnCours(2);
                    game.cPasMonTour(this.jeuEnCours.getJoueurs(1).getPlateauJoueurIHM());
                    game.cMonTour(this.jeuEnCours.getJoueurs(2).getPlateauJoueurIHM());
                }
                else if (n == 2){
                    this.jeuEnCours.setJoueurEnCours(3);
                    game.cPasMonTour(this.jeuEnCours.getJoueurs(2).getPlateauJoueurIHM());
                    game.cMonTour(this.jeuEnCours.getJoueurs(3).getPlateauJoueurIHM());
                }
                else if (n == 3){
                    this.jeuEnCours.setJoueurEnCours(0);
                    game.cPasMonTour(this.jeuEnCours.getJoueurs(3).getPlateauJoueurIHM());
                    game.cMonTour(this.jeuEnCours.getJoueurs(0).getPlateauJoueurIHM());
                    int tour = jeuEnCours.getTourEnCours() + 1;
                    jeuEnCours.setTourEnCours(tour);
                }
                break;
            default:
                System.out.println("Erreur");
        }
        //System.out.println("tour" + jeuEnCours.getTourEnCours());
        blockOthersEscalier(this.jeuEnCours);

    }
}
