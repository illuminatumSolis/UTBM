package Controller;

import Model.*;
import View.GameGUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoisirCentre implements ActionListener {

    protected Jeu Jeu;
    protected Centre centre;
    public ChoisirCentre(Jeu Jeu){
        this.Jeu=Jeu;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Jeu.setChoixDisqueOuCentre("Centre");
        Centre tempCentre = Jeu.getCentrejeu();
        tempCentre.setJeton1(false);
        //gestion jeton 1
        Jeu.getJoueurs(Jeu.getJoueurEnCours()).setTourjoueur(1);
        for (Joueur j : Jeu.getJoueurs()){
            if(j.getId() == 0 && j.getTourjoueur() != 1){
                j.setTourjoueur(2);
            }
            if(j.getId() == 1 && j.getTourjoueur() != 1){
                j.setTourjoueur(3);
            }
            if(j.getId() == 2 && j.getTourjoueur() != 1){
                j.setTourjoueur(4);
            }
        }

//        tempCentre.Jeton1Component.setBackground(null);



        if (Jeu.getTourEnCours() > 1 || Jeu.getTourEnCours() ==1 && Jeu.getJoueurEnCours() != 0){
            GameGUI.choisisCentre(Jeu.getCentreIHM());
        }
        else{
            System.out.println("Erreur, il n'y a rien dans le centre");
        }

        for(Component c : Jeu.getCentrejeu().getTabUvComponent()){
            c.setEnabled(true);
        }

        for(Component d : Jeu.getDisquesTabComponent()){
            d.setEnabled(false);
        }

    }
}
