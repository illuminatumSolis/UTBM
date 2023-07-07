package Controller;

import Model.DeplacementVersEscalier;
import Model.*;
import View.GameGUI;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ChoisirDisque implements ActionListener {

    protected int DisqueId;
    protected Jeu Jeu;
    public ChoisirDisque(int DisqueId,Jeu Jeu){this.DisqueId = DisqueId;this.Jeu=Jeu;}
    @Override
    public void actionPerformed(ActionEvent e) {
        Jeu.setChoixDisqueOuCentre("Disque");
        java.awt.Component tempComp = (java.awt.Component) e.getSource();
        tempComp.setEnabled(false);

        Joueur tempJoueur = Jeu.getJoueurs(Jeu.getJoueurEnCours());
        tempJoueur.setDisqueChoix(this.DisqueId);

        for(java.awt.Component comp: Jeu.getDisquesTabComponent()){

            if(comp.equals(tempComp)) {
                for(java.awt.Component ComponentUv : Jeu.getDisqueUvTabComponent(DisqueId))ComponentUv.setEnabled(true);
                comp.setBackground(Color.green);
                Jeu.getDisque(this.DisqueId).setEmpty(true);
            }else {
                comp.setEnabled(false);
//                comp.setBackground(Color.red);

            }
        }
        GameGUI.choisisPasCentre(Jeu.getCentreIHM());
    }
}
