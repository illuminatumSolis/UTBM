package Controller;

import Model.*;
import View.GameGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ChoisirLigne implements ActionListener {
    private Jeu Jeu;
    private Joueur Joueur;
    private int numLigne = 99;

    public ChoisirLigne(int numLigne, Jeu Jeu) {
        this.numLigne = numLigne;
        this.Jeu = Jeu;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(this.Jeu.getCentrejeu().getTabUv().isEmpty()){
            this.Jeu.getCentrejeu().setEmptyc(true);
        }

        this.Joueur = Jeu.getJoueurs(Jeu.getJoueurEnCours());

        GameGUI.auSuivant(Jeu.getSuivIHM());

        if (Jeu.getChoixDisqueOuCentre().equals("Centre")) {

            UV tempUv = Joueur.getCentreTabUvChoix().get(0);

            if (DeplacementVersEscalier.deplacementCentreVersEscalier(this.Joueur, this.numLigne)) {
                for (java.awt.Component tempCompEscalierLignes : this.Joueur.getEscalierLignesTabComponent()) {
                    tempCompEscalierLignes.setEnabled(false);
                }

                ArrayList<java.awt.Component> TabComponentsEscalierUvLignesJoueur = Joueur.getEscalierUvLignesTabComponent();
                UV[] tempTabUvEscalierLigne = Joueur.getEscalierLigne(numLigne);
                ArrayList<java.awt.Component> partieTabComponentsEscalierUvLignesJoueur = new ArrayList<java.awt.Component>();

                switch (numLigne) {
                    case 0: {
                        partieTabComponentsEscalierUvLignesJoueur.add(TabComponentsEscalierUvLignesJoueur.get(0));
                        break;
                    }
                    case 1: {
                        for (int i = 1; i <= numLigne + 1; i++)
                            partieTabComponentsEscalierUvLignesJoueur.add(TabComponentsEscalierUvLignesJoueur.get(i));
                        break;
                    }
                    case 2: {
                        for (int i = 3; i <= numLigne + 3; i++)
                            partieTabComponentsEscalierUvLignesJoueur.add(TabComponentsEscalierUvLignesJoueur.get(i));
                        break;
                    }
                    case 3: {
                        for (int i = 6; i <= numLigne + 6; i++)
                            partieTabComponentsEscalierUvLignesJoueur.add(TabComponentsEscalierUvLignesJoueur.get(i));
                        break;
                    }
                    case 4: {
                        for (int i = 10; i < numLigne + 10; i++)
                            partieTabComponentsEscalierUvLignesJoueur.add(TabComponentsEscalierUvLignesJoueur.get(i));
                        break;
                    }
                }

                ArrayList<java.awt.Component> TabComponentsMinusJoueur = Joueur.getMinusUvTabComponent();
                UV[] tempTabUvMinus = Joueur.getTabUvMinus();

                for (int i = 0; i < tempTabUvEscalierLigne.length; i++) {
                    if (tempTabUvEscalierLigne[i] != null) {
                        partieTabComponentsEscalierUvLignesJoueur.get(i).setBackground(Color.decode(Couleur.getColor(tempTabUvEscalierLigne[i].getCouleur())));
                    }
                }

                for (int i = 0; i < tempTabUvMinus.length; i++) {
                    if (tempTabUvMinus[i] != null) {
                        TabComponentsMinusJoueur.get(i).setBackground(Color.decode(Couleur.getColor(tempTabUvMinus[i].getCouleur())));
                    } else break;
                }

                ArrayList<UV> tempCentreTabUv = Jeu.getCentreTabUv();
                
                for(int i=0;i< tempCentreTabUv.size();i++){
                    if(!tempCentreTabUv.isEmpty()){
                    if(tempCentreTabUv.get(0).getCouleur().equals(tempUv.getCouleur()))
                        tempCentreTabUv.remove(0);
                    }
                }

                ArrayList<java.awt.Component> tempCentreTabUvComponent = Jeu.getCentreTabUvComponent();

                for (int i = 0; i < tempCentreTabUvComponent.size(); i++) {
                    if(i < tempCentreTabUv.size()){
                        tempCentreTabUvComponent.get(i).setBackground(Color.decode(Couleur.getColor(tempCentreTabUv.get(i).getCouleur())));
                }else {
                        tempCentreTabUvComponent.get(i).setBackground(null); }
                }

            }
//            else {
//                // ****************************************  incomplet !!!!
//                JFrame PopUp = new JFrame("Error");
//                PopUp.setVisible(true);
//                // PopUp.setDefaultCloseOperation();
//                PopUp.setSize(500, 500);
//                PopUp.setLayout(new GridLayout(2, 1));
//
//                JLabel ErrorMessage = new JLabel("Please select an empty line or one that already contains the same type of mozaique");
//                ErrorMessage.setEnabled(false);
//                JButton OKbutton = new JButton("Ok");
//                OKbutton.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//
//                    }
//                });
//
//                PopUp.add(ErrorMessage);
//                PopUp.add(OKbutton);
//        }


        } else if (Jeu.getChoixDisqueOuCentre().equals("Disque")) {

            if (DeplacementVersEscalier.deplacementDisqueVersEscalier(this.Jeu.getDisque(Joueur.getDisqueChoix()), this.Joueur, this.numLigne)) {
                for (java.awt.Component tempCompEscalierLignes : this.Joueur.getEscalierLignesTabComponent()) {
                    tempCompEscalierLignes.setEnabled(false);
                }

                ArrayList<java.awt.Component> TabComponentsEscalierUvLignesJoueur = Joueur.getEscalierUvLignesTabComponent();
                UV[] tempTabUvEscalierLigne = Joueur.getEscalierLigne(numLigne);
                ArrayList<java.awt.Component> partieTabComponentsEscalierUvLignesJoueur = new ArrayList<java.awt.Component>();

                switch (numLigne) {
                    case 0: {
                        partieTabComponentsEscalierUvLignesJoueur.add(TabComponentsEscalierUvLignesJoueur.get(0));
                        break;
                    }
                    case 1: {
                        for (int i = 1; i <= numLigne + 1; i++)
                            partieTabComponentsEscalierUvLignesJoueur.add(TabComponentsEscalierUvLignesJoueur.get(i));
                        break;
                    }
                    case 2: {
                        for (int i = 3; i <= numLigne + 3; i++)
                            partieTabComponentsEscalierUvLignesJoueur.add(TabComponentsEscalierUvLignesJoueur.get(i));
                        break;
                    }
                    case 3: {
                        for (int i = 6; i <= numLigne + 6; i++)
                            partieTabComponentsEscalierUvLignesJoueur.add(TabComponentsEscalierUvLignesJoueur.get(i));
                        break;
                    }
                    case 4: {
                        for (int i = 10; i <= numLigne + 10; i++)
                            partieTabComponentsEscalierUvLignesJoueur.add(TabComponentsEscalierUvLignesJoueur.get(i));
                        break;
                    }
                }

                ArrayList<java.awt.Component> TabComponentsMinusJoueur = Joueur.getMinusUvTabComponent();
                UV[] tempTabUvMinus = Joueur.getTabUvMinus();

                for (int i = 0; i < tempTabUvEscalierLigne.length; i++) {
                    if (tempTabUvEscalierLigne[i] != null) {
                        partieTabComponentsEscalierUvLignesJoueur.get(i).setBackground(Color.decode(Couleur.getColor(tempTabUvEscalierLigne[i].getCouleur())));
                    }
                }

                for (int i = 0; i < tempTabUvMinus.length; i++) {
                    if (tempTabUvMinus[i] != null) {
                        TabComponentsMinusJoueur.get(i).setBackground(Color.decode(Couleur.getColor(tempTabUvMinus[i].getCouleur())));
                    } else break;

                }

                ArrayList<UV> tempCentreTabUv = Jeu.getCentreTabUv();
                ArrayList<java.awt.Component> tempCentreTabUvComponent = Jeu.getCentreTabUvComponent();
                for (int i = 0; i < tempCentreTabUv.size(); i++) {
                    if (tempCentreTabUv.get(i) != null) {
                        tempCentreTabUvComponent.get(i).setBackground(Color.decode(Couleur.getColor(tempCentreTabUv.get(i).getCouleur())));
                    }
                }

            } else {
                // ****************************************  incomplet !!!!
                JFrame PopUp = new JFrame("Error");
                PopUp.setVisible(true);
               // PopUp.setDefaultCloseOperation();
                PopUp.setSize(500, 500);
                PopUp.setLayout(new GridLayout(2, 1));

                JLabel ErrorMessage = new JLabel("Please select an empty line or one that already contains the same type of mozaique");
                ErrorMessage.setEnabled(false);
                JButton OKbutton = new JButton("Ok");
                OKbutton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                    }
                });

                PopUp.add(ErrorMessage);
                PopUp.add(OKbutton);
            }

        }
    }
}
