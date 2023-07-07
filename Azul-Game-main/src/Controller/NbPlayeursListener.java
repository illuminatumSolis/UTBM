package Controller;

import Model.Centre;
import Model.Jeu;
import View.GameGUI;
import View.HomeGUI;
import View.PlayersNbGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NbPlayeursListener implements ActionListener {

    int joueur;
    Jeu jeuEnCours;

    public NbPlayeursListener(Jeu jeu, int nbJoueursListener) {
        this.joueur = nbJoueursListener;
        this.jeuEnCours = jeu;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        PlayersNbGUI player = new PlayersNbGUI();
        GameGUI game = new GameGUI();
        this.jeuEnCours.setNbjoueurs(this.joueur);
        player.Next();
        game.Show(this.jeuEnCours);
    }
}
