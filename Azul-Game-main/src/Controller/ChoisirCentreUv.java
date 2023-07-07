package Controller;

import Model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ChoisirCentreUv implements ActionListener {

    private Jeu jeuEnCours;
    private int centreUvId = 99;

    public ChoisirCentreUv(Jeu j, int cUvId) {
        this.centreUvId = cUvId;
        this.jeuEnCours = j;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        java.awt.Component tempComp = (JButton) e.getSource();
        Joueur tempJoueur = jeuEnCours.getJoueurs(jeuEnCours.getJoueurEnCours());
        tempJoueur.emptyCentreUvTabChoix();
        Centre tempCentre = jeuEnCours.getCentrejeu();

        ArrayList<java.awt.Component> tempCentreTabUvComponent = tempCentre.getTabUvComponent();

        for (int i = 0; i < tempCentre.getTabUv().size(); i++) {
            if (tempCentreTabUvComponent.get(i).getBackground().equals(tempComp.getBackground())) {
                tempCentreTabUvComponent.get(i).setEnabled(false);
                tempJoueur.addCentreUvTabChoix(tempCentre.getTabUv(i));
            } else {
                tempCentreTabUvComponent.get(i).setEnabled(false);
               }
            }

        ArrayList<Component> Test = tempCentre.getTabUvComponent();
        ArrayList<UV> uvArray = tempCentre.getTabUv();
        for(int i = 0; i < tempCentre.getTabUv().size(); i++){
            if(Test.get(i).getBackground() == tempComp.getBackground()){
//                tempJoueur.addCentreUvTabChoix(uvArray.get(i));
//                Test.get(i).setBackground(null);
                uvArray.remove(i);
            }
        }

        ArrayList<Component> TestEnable = tempCentre.getTabUvComponent();
        for(int i=0;i<Test.size();i++){
            TestEnable.get(i).setEnabled(false);
        }

//        for(Component c : tempCentreTabUvComponent){
//            if(c.getBackground() == tempComp.getBackground()){
//                c.setBackground(null);
//            }
//        }
//        for(UV uv : jeuEnCours.getCentrejeu().getTabUv()){
//            if(uv.getCouleur() == getColorButton(tempComp)){
//                uv.setCouleur(null);
//                tempJoueur.addCentreUvTabChoix(uv);
//            }
//            System.out.println(uv);
//        }

         }

    public static String getColorButton(Component tempComp){
        String colorButton = null;
        if(tempComp.getBackground().equals(new Color(60, 0, 255))) {
            colorButton = "Bleu";
        }
        if(tempComp.getBackground().equals(new Color(255, 255, 3))) {
            colorButton = "Jaune";
        }
        if(tempComp.getBackground().equals(new Color(255, 0, 0))) {
            colorButton = "Rouge";
        }
        if(tempComp.getBackground().equals(new Color(129, 0, 127))) {
            colorButton = "Violet";
        }
        if(tempComp.getBackground().equals(new Color(76, 187, 23))) {
            colorButton = "Vert";
        }
        return colorButton;
    }
    }

