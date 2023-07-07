package View;

import Controller.ChangeWindowListner;
import Model.Jeu;

import java.awt.*;
import java.awt.font.TextAttribute;
import java.util.Map;

import javax.swing.*;

public class HomeGUI extends JFrame{

    static JFrame frame = new JFrame("AZUL UTBM");

    public HomeGUI() {
    }

    public void Next()
    {
        frame.setVisible(false);
    }

    public static void createAndShowGUI(Jeu jeu) {

        JPanel panel = new JPanel(new GridBagLayout());
        JPanel panel2 = new JPanel();

        panel.setLayout(new GridLayout(4, 1, 5, 5));

        JLabel bienvenue = new JLabel("BIENVENUE SUR AZUL UTBM", SwingConstants.CENTER);
        bienvenue.setFont(new Font("Roboto", Font.BOLD, 34));

        JLabel regles = new JLabel("Règle du jeu :");
        regles.setFont(new Font("Roboto", Font.BOLD, 20));
        Font font = regles.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        regles.setFont(font.deriveFont(attributes));

        JTextArea description = new JTextArea("Nombre de joueurs : 2 à 4\n" +
                "But du jeu : Cumuler le plus de crédits de victoire.\n" +
                "Principe : Gagner des crédits en plaçant des UVs (mozaiques) dans son semestre (motif)\n" +
                "Phases: Lorsqu’il n’y a plus d’UV au centre ou sur les disque, tout est remis en place, les crédits mis à jours et le jeu continue\n" +
                "Fin : La partie s’arrête lorsqu’un joueur complète une ligne horizontale de 5 UVs.");
        description.setFont(new Font("Serif", Font.ITALIC, 16));
        description.setLineWrap(true);
        description.setWrapStyleWord(true);
        description.setOpaque(false);
        description.setEditable(false);

        JButton suiv = new JButton();
        suiv.setText("Suivant");

        ChangeWindowListner listener = new ChangeWindowListner(jeu);
        suiv.addActionListener(listener);



        frame.add(panel);
        panel.add(bienvenue);
        panel.add(regles);
        panel.add(description);
        panel2.add(suiv);
        panel.add(panel2);
        panel.setBorder(BorderFactory.createEmptyBorder(10, 150, 10, 150));

        try {
            UIManager.setLookAndFeel("javax.swing.plaf.windows.WindowsLookAndFeel");
        } catch (UnsupportedLookAndFeelException e) {
            // handle exception
        } catch (ClassNotFoundException e) {
            // handle exception
        } catch (InstantiationException e) {
            // handle exception
        } catch (IllegalAccessException e) {
            // handle exception
        }


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setSize(screenSize);

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}

