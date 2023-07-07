package Controller;
import Model.Jeu;
import View.HomeGUI;
import View.PlayersNbGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ChangeWindowListner implements ActionListener {

    private HomeGUI H;
    Jeu jeuEnCours;

    public ChangeWindowListner(Jeu jeu) {
        this.jeuEnCours = jeu;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        HomeGUI home = new HomeGUI();
        PlayersNbGUI player = new PlayersNbGUI();
        home.Next();
        player.Show(jeuEnCours);
    }
}
