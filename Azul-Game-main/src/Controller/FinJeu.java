package Controller;

import Model.Jeu;
import Model.Joueur;
import View.GameGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FinJeu implements ActionListener {

    Jeu jeuEnCours;

    public FinJeu(Jeu j){
        this.jeuEnCours = j;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(FinVerif(jeuEnCours) == true){
            popupFinPhase(jeuEnCours);
        }

    }

    public static boolean FinVerif(Jeu jeu){
        boolean fin = false;
        for(Joueur j : jeu.getJoueurs()) {
            for (int i = 0; i < 5; i++) {
                if (GameGUI.ligneComplete(j.getMotifIHMsolo(i)) == "X") {
                    System.out.println("ligne complete");
                    fin = true;
                }
            }
            for (int i = 5; i < 10; i++) {
                if (GameGUI.ligneComplete(j.getMotifIHMsolo(i)) == "X") {
                    System.out.println("ligne complete");
                    fin = true;
                }
            }
            for (int i = 10; i < 15; i++) {
                if (GameGUI.ligneComplete(j.getMotifIHMsolo(i)) == "X") {
                    System.out.println("ligne complete");
                    fin = true;
                }
            }
            for (int i = 15; i < 20; i++) {
                if (GameGUI.ligneComplete(j.getMotifIHMsolo(i)) == "X") {
                    System.out.println("ligne complete");
                    fin = true;
                }
            }
            for (int i = 20; i < 25; i++) {
                if (GameGUI.ligneComplete(j.getMotifIHMsolo(i)) == "X") {
                    System.out.println("ligne complete");
                    fin = true;
                }
            }
        }
        return fin;
    }

    static void popupFinPhase(Jeu jeu){
        JDialog dialog = new JDialog();
        JPanel corps = new JPanel();
        corps.setLayout(new GridLayout(2, 1));
        JLabel txt = new JLabel("Bravo "+ quiAGagné(jeu) +", tu as gagné !!!");
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

    public static String quiAGagné(Jeu jeu){
        String gagnant = null;
        int s = 0;
        for(Joueur j : jeu.getJoueurs()) {
            int sj = j.getScore();
            int idJ = j.getId()+1;
            if(sj > s){
                s = sj;
                gagnant = "Etudiant " + idJ;
            }
        }

        return gagnant;
    }

}
