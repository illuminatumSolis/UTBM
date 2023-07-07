package View;

import Controller.ChangeWindowListner;
import Controller.NbPlayeursListener;
import Model.Jeu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.util.Map;

public class PlayersNbGUI {

    static JFrame frame = new JFrame("AZUL UTBM");

    static int nbJoueur = 0;


    public void Show(Jeu jeu)
    {
        createAndShowGUI(jeu);
        frame.setVisible(true);
    }

    public void Next()
    {
        frame.setVisible(false);
    }



    public static void createAndShowGUI(Jeu jeu) {


        JPanel panel = new JPanel(new GridBagLayout());
        JPanel panel2 = new JPanel();

        panel.setLayout(new GridLayout(2, 1, 5, 5));
        panel2.setLayout(new GridLayout(1, 3, 10, 10));

        JLabel instruction = new JLabel("NOMBRE DE JOUEURS ?", SwingConstants.CENTER);
        instruction.setFont(new Font("Roboto", Font.BOLD, 34));


        JButton un = new JButton();
        un.setText("2");
        un.setFont(new Font("Roboto", Font.BOLD, 34));
        NbPlayeursListener listener1 = new NbPlayeursListener(jeu, 2);
        un.addActionListener(listener1);

        JButton deux = new JButton();
        deux.setText("3");
        deux.setFont(new Font("Roboto", Font.BOLD, 34));
        NbPlayeursListener listener2 = new NbPlayeursListener(jeu, 3);
        deux.addActionListener(listener2);

        JButton trois = new JButton();
        trois.setText("4");
        trois.setFont(new Font("Roboto", Font.BOLD, 34));
        NbPlayeursListener listener3 = new NbPlayeursListener(jeu, 4);
        trois.addActionListener(listener3);



        frame.add(panel);
        panel.add(instruction);
        panel2.add(un);
        panel2.add(deux);
        panel2.add(trois);
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
    }
}
