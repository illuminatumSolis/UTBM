import Model.Jeu;
import View.HomeGUI;

public class main {
    public static void main(String[] args) {
        Jeu jeu = new Jeu();
        javax.swing.SwingUtilities.invokeLater(new Runnable() { public void run() { HomeGUI.createAndShowGUI(jeu); } });
    }
}
