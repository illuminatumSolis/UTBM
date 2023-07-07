package Controller;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Model.*;

public class ChoisirDisqueUv implements ActionListener {
    private Jeu Jeu;
    private int DisqueUvId=99;
    public ChoisirDisqueUv(){}
    public ChoisirDisqueUv(int DisqueUvId,Jeu Jeu){this.DisqueUvId=DisqueUvId;this.Jeu=Jeu;}
    @Override
    public void actionPerformed(ActionEvent e) {
        Joueur tempJoueur = Jeu.getJoueurs(Jeu.getJoueurEnCours());
        tempJoueur.emptyDisqueUvTabChoix();

        java.awt.Component tempComp = (java.awt.Component)e.getSource();
        Disque tempDisque = Jeu.getDisque(tempJoueur.getDisqueChoix());

         ArrayList<Component> TabcomponentsDisqueUv = tempDisque.getTabComponentDisqueUv();

        for(int i=0;i<TabcomponentsDisqueUv.size();i++){
            TabcomponentsDisqueUv.get(i).setEnabled(false);
            if(TabcomponentsDisqueUv.get(i).getBackground().equals(tempComp.getBackground())){
                tempJoueur.addDisqueUvTabChoix(tempDisque.getDisqueUV(this.DisqueUvId));
            }else{
                Jeu.addCentreUv(tempDisque.getDisqueUV(i));
            }
        }

        ArrayList<Component> Test = tempDisque.getTabComponentDisqueUv();

        for(int i=0;i<Test.size();i++){
                TabcomponentsDisqueUv.get(i).setBackground(null);
        }

    }
}
