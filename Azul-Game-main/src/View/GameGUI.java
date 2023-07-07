package View;

import Controller.*;
import Model.*;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

import static Model.FinPhaseVerif.DisquesVides;

public class GameGUI{

//    Creation du frame principal
    public static JFrame frame = new JFrame("AZUL UTBM");

    private static int disqueId=0;

//    Creation du panel principal
    static JPanel table = new JPanel(new GridBagLayout());
    static JButton milieuButton = new JButton();
    static JButton suiv = new JButton("Suivant");


    public void Show(Jeu jeu)
    {
        createAndShowGUI(jeu);
        frame.setVisible(true);
    }


    public static void createAndShowGUI(Jeu jeu) {
//        Creation de la table de jeu en fonction du nombre de joueur
        if(jeu.getNbjoueurs() ==2){
            Joueur j1 = new Joueur(0);
            Joueur j2 = new Joueur(1);

            Joueur[] tabJ = {j1,j2};
            jeu.setJoueurs(tabJ);

            table.setLayout(new GridLayout(1,3,5,5));
            frame.add(table);

            JPanel c1 = createPlateau(0, jeu, j1);
            j1.setPlateauJoueurIHM(c1);

            createCentre(jeu.getNbjoueurs(), jeu);
            jeu.setCentreIHM(milieuButton);

            JPanel c2 = createPlateau(1, jeu, j2);
            j2.setPlateauJoueurIHM(c2);

        }
        if(jeu.getNbjoueurs() ==3){
            Joueur j1 = new Joueur(0);
            Joueur j2 = new Joueur(1);
            Joueur j3 = new Joueur(2);

            Joueur[] tabJ = {j1,j2,j3};
            jeu.setJoueurs(tabJ);

            JPanel c1 = createPlateau(0, jeu, j1);
            JPanel c2 = createPlateau(1, jeu, j2);

            j1.setPlateauJoueurIHM(c1);
            j2.setPlateauJoueurIHM(c2);

            table.setLayout(new GridLayout(1,3,5,5));
            frame.add(table);

            JPanel partiePlateau1 = new JPanel();
            partiePlateau1.setLayout(new GridLayout(2, 1, 5, 5));
            partiePlateau1.add(c1);
            partiePlateau1.add(c2);
            table.add(partiePlateau1);
            createCentre(jeu.getNbjoueurs(), jeu);
            jeu.setCentreIHM(milieuButton);

            JPanel c3 = createPlateau(2, jeu, j3);
            j3.setPlateauJoueurIHM(c3);


        }
        if(jeu.getNbjoueurs() ==4){
            Joueur j1 = new Joueur(0);
            Joueur j2 = new Joueur(1);
            Joueur j3 = new Joueur(2);
            Joueur j4 = new Joueur(3);

            Joueur[] tabJ = {j1,j2,j3,j4};
            jeu.setJoueurs(tabJ);

            JPanel c1 = createPlateau(0, jeu, j1);
            JPanel c2 = createPlateau(1, jeu, j2);

            j1.setPlateauJoueurIHM(c1);
            j2.setPlateauJoueurIHM(c2);

            table.setLayout(new GridLayout(1,3,5,5));
            frame.add(table);

            JPanel partiePlateau1 = new JPanel();
            JPanel partiePlateau2 = new JPanel();
            partiePlateau1.setLayout(new GridLayout(2, 1, 5, 5));
            partiePlateau2.setLayout(new GridLayout(2, 1, 5, 5));

            partiePlateau1.add(c1);
            partiePlateau1.add(c2);

            table.add(partiePlateau1);
            createCentre(jeu.getNbjoueurs(), jeu);
            jeu.setCentreIHM(milieuButton);
            table.add(partiePlateau2);

            JPanel c3 = createPlateau(2, jeu, j3);
            JPanel c4 = createPlateau(3, jeu, j4);

            j3.setPlateauJoueurIHM(c3);
            j4.setPlateauJoueurIHM(c4);

            partiePlateau2.add(c3);
            partiePlateau2.add(c4);

        }



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

//      Format de l'application
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setSize(screenSize);

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static JPanel createPlateau(int n, Jeu jeu, Joueur j){
        JPanel plateau = new JPanel();
        plateau.setMaximumSize(new Dimension(50, 50));
        plateau.setMinimumSize(new Dimension(50, 50));
        plateau.setSize(new Dimension(50, 50));

        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel escalier = new JPanel();
        JPanel motif = new JPanel();
        JPanel negativePts = new JPanel();


        plateau.setLayout(new GridLayout());
        panel2.setLayout(new GridLayout(3, 1, 5, 5));
        panel3.setLayout(new GridLayout(1, 2, 5, 5));
        escalier.setLayout(new GridLayout(5, 1));
        motif.setLayout(new GridLayout(5, 5));
        negativePts.setLayout(new GridLayout(1, 6));

//        contour plateau rouge pour premier joueur
        if(n == jeu.getJoueurEnCours()){
            cMonTour(plateau);
        }

        //creation boutons de chaque ligne de l'escalier
        JButton Stairs1 = new JButton();
        Stairs1.setEnabled(false);
        jeu.addEscalierUvLigneComponent(n,Stairs1);
        j.setStairs1(new JButton[]{Stairs1});

        JButton[] Stairs2 = new JButton[2];
        JButton[] Stairs3 = new JButton[3];
        JButton[] Stairs4 = new JButton[4];
        JButton[] Stairs5 = new JButton[5];

        for (int i = 0; i < Stairs2.length; i++) {
            Stairs2[i] = new JButton();
            Stairs2[i].setEnabled(false);
            jeu.addEscalierUvLigneComponent(n,Stairs2[i]);
            j.setStairs2(Stairs2);
        }

        for (int i = 0; i < Stairs3.length; i++) {
            Stairs3[i] = new JButton();
            Stairs3[i].setEnabled(false);
            jeu.addEscalierUvLigneComponent(n,Stairs3[i]);
            j.setStairs3(Stairs3);
        }

        for (int i = 0; i < Stairs4.length; i++) {
            Stairs4[i] = new JButton();
            Stairs4[i].setEnabled(false);
            jeu.addEscalierUvLigneComponent(n,Stairs4[i]);
            j.setStairs4(Stairs4);
        }

        for (int i = 0; i < Stairs5.length; i++) {
            Stairs5[i] = new JButton();
            Stairs5[i].setEnabled(false);
            jeu.addEscalierUvLigneComponent(n,Stairs5[i]);
            j.setStairs5(Stairs5);
        }
        //creation JPanel pour chaque ligne de l'escalier
        JPanel S1 = new JPanel();
        JPanel S2 = new JPanel();
        JPanel S3 = new JPanel();
        JPanel S4 = new JPanel();
        JPanel S5 = new JPanel();

        S1.setLayout(new FlowLayout(FlowLayout.RIGHT));
        S2.setLayout(new FlowLayout(FlowLayout.RIGHT));
        S3.setLayout(new FlowLayout(FlowLayout.RIGHT));
        S4.setLayout(new FlowLayout(FlowLayout.RIGHT));
        S5.setLayout(new FlowLayout(FlowLayout.RIGHT));

        //insertion des bouttons de chaque ligne dans son panel correspondant
        S1.add(Stairs1);

        for (JButton button : Stairs2) {
            S2.add(button);
        }
        for (JButton button : Stairs3) {
            S3.add(button);
        }
        for (JButton button : Stairs4) {
            S4.add(button);
        }
        for (JButton button : Stairs5) {
            S5.add(button);
        }

//        JButton mainButton = new JButton();
//        mainButton.add(S2);

        //creation boutton pour chaque ligne
        JButton[] buttonStairsSteps = new JButton[5];
        for (int i = 0; i < buttonStairsSteps.length; i++) {
            buttonStairsSteps[i] = new JButton();
            jeu.addEscalierLigneComponent(n,buttonStairsSteps[i]);
            //System.out.println("n:" + (n-1) + " i:"+ i +"  " +jeu.getJoueurs(n-1).getEscalierLignesTabComponent().isEmpty());
        }
//insertion de chaque ligne  dans son boutton correspondant
        buttonStairsSteps[0].add(S1);
        buttonStairsSteps[0].addActionListener(new ChoisirLigne(0,jeu));
        buttonStairsSteps[1].add(S2);
        buttonStairsSteps[1].addActionListener(new ChoisirLigne(1,jeu));
        buttonStairsSteps[2].add(S3);
        buttonStairsSteps[2].addActionListener(new ChoisirLigne(2,jeu));
        buttonStairsSteps[3].add(S4);
        buttonStairsSteps[3].addActionListener(new ChoisirLigne(3,jeu));
        buttonStairsSteps[4].add(S5);
        buttonStairsSteps[4].addActionListener(new ChoisirLigne(4,jeu));

//insertion de l'ensemble dans panel escalier
        for (int i = 0; i < buttonStairsSteps.length; i++) {
            escalier.add(buttonStairsSteps[i]);
        }

        if(n == jeu.getNbjoueurs()-1) CMonToursListner.blockOthersEscalier(jeu);

//creation bouttons motif
        JButton[] buttons = new JButton[25];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            buttons[i].setEnabled(false);
            j.setMotifIHMsolo(i, buttons[i]);



            if (i == 0 || i == 6 || i == 12 || i == 18 || i == 24){
                buttons[i].setBackground(Color.decode("#3C00FF")); // Blue
            }
            if (i == 1 || i == 7 || i == 13 || i == 19 || i == 20){
                buttons[i].setBackground(Color.decode("#FFFF03")); // Yellow
            }
            if (i == 2 || i == 8 || i == 14 || i == 15 || i == 21){
                buttons[i].setBackground(Color.decode("#FF0000")); // Red
            }
            if (i == 3 || i == 9 || i == 10 || i == 16 || i == 22){
                buttons[i].setBackground(Color.decode("#81007F")); // Purple
            }
            if (i == 4 || i == 5 || i == 11 || i == 17 || i == 23){
                buttons[i].setBackground(Color.decode("#4CBB17")); // Green
            }

        }
        for (int i = 0; i < buttons.length; i++) {
            motif.add(buttons[i]);
        }

//        JButton[] negativeButtons = new JButton[9];
//        for (int i = 0; i < buttons.length; i++) {
//            negativeButtons[i] = new JButton();
//        }
//        for (int i = 0; i < negativeButtons.length; i++) {
//            negativePts.add(negativeButtons[i]);
//        }

        int[] values = {-1, -1, -2, -2, -3, -3};
        JButton[] buttonsNegatives = new JButton[values.length];

        for (int i = 0; i < values.length; i++) {
            buttonsNegatives[i] = new JButton(String.valueOf(values[i]));
            buttonsNegatives[i].setEnabled(false);
            jeu.addMinusUvComponent(n,buttonsNegatives[i]);
        }

        for (JButton button : buttonsNegatives) {
            negativePts.add(button);
        }

        int score = j.getScore();
        n +=1;

        JLabel etuScore = new JLabel("Etudiant " + n + " - Crédits " + score, SwingConstants.CENTER);
        j.setScoreIHM(etuScore);
        etuScore.setFont(new Font("Roboto", Font.BOLD, 34));

//        int[] arrayNegative = {-1, -1, -2, -2, -3, -3};
//        JButton negativeButtons = new JButton(Arrays.toString(arrayNegative));



        table.add(plateau);
        panel3.add(escalier);
        panel3.add(motif);
        panel2.add(etuScore);
        panel2.add(panel3);
        panel2.add(negativePts);
        plateau.add(panel2);

        return plateau;
    }

    public static void createCentre(int n, Jeu jeu){
//        Centre objetCentre = new Centre();
        JPanel centre = new JPanel(new GridBagLayout());
        JPanel disquesPart1 = new JPanel();
        JPanel disquesPart2 = new JPanel();
        JPanel milieu = new JPanel(new GridBagLayout());

        centre.setLayout(new GridLayout(3, 1, 5, 5));
        disquesPart1.setLayout(new GridLayout(2, 2, 5, 5));
        disquesPart2.setLayout(new GridLayout(3, 2, 5, 5));

        if(n == 2){
            jeu.initializeDisqueUv(5);
            java.awt.Component[] tabComponent = new Component[5];
           for(int i=0;i<5;i++){
               tabComponent[i] = createDisque(jeu,n, jeu.getTabDisques().get(i));
           }
            jeu.setDisquesIHM(tabComponent);

            disquesPart1.add(tabComponent[0]);
            disquesPart1.add(tabComponent[1]);
            disquesPart1.add(tabComponent[2]);

            disquesPart2.add(tabComponent[3]);
            disquesPart2.add(tabComponent[4]);
        }
        if(n == 3){
            jeu.initializeDisqueUv(7);
            java.awt.Component[] tabComponent = new Component[7];
            for(int i=0;i<7;i++){
                tabComponent[i] = createDisque(jeu,n,jeu.getTabDisques().get(i));
            }
            jeu.setDisquesIHM(tabComponent);

            disquesPart1.add(tabComponent[0]);
            disquesPart1.add(tabComponent[1]);
            disquesPart1.add(tabComponent[2]);
            disquesPart1.add(tabComponent[3]);

            disquesPart2.add(tabComponent[4]);
            disquesPart2.add(tabComponent[5]);
            disquesPart2.add(tabComponent[6]);

        }
        if(n == 4){
            jeu.initializeDisqueUv(9);
            java.awt.Component[] tabComponent = new Component[9];
            for(int i=0;i<9;i++){
                tabComponent[i] = createDisque(jeu,n,jeu.getTabDisques().get(i));
            }

            jeu.setDisquesIHM(tabComponent);


            disquesPart1.add(tabComponent[0]);
            disquesPart1.add(tabComponent[1]);
            disquesPart1.add(tabComponent[2]);
            disquesPart1.add(tabComponent[3]);

            disquesPart2.add(tabComponent[4]);
            disquesPart2.add(tabComponent[5]);
            disquesPart2.add(tabComponent[6]);
            disquesPart2.add(tabComponent[7]);
            disquesPart2.add(tabComponent[8]);

        }
//      Gestion suivant
//        JButton suiv = new JButton("Suivant");
        suiv.setEnabled(false);
        jeu.setSuivIHM(suiv);
        CMonToursListner listener = new CMonToursListner(jeu);
        suiv.addActionListener(listener);
        FinPhase listener2 = new FinPhase(jeu);
        suiv.addActionListener(listener2);
        FinJeu listener3 = new FinJeu(jeu);
        suiv.addActionListener(listener3);

//        JButton refresh = new JButton("Annuler l'action");
//        refresh.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                //TODO
//            }
//        });

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(2, 5, 1, 1));
//        panel2.add(refresh);
        panel2.add(suiv);
        disquesPart2.add(panel2);

        JPanel interieurmilieu = new JPanel();
        interieurmilieu.setLayout(new GridLayout(5, 5, 1, 1));

        JButton jeton1 = new JButton("1");
        jeu.getCentrejeu().setJeton1Component(jeton1);
        jeton1.setForeground(Color.WHITE);
        jeton1.setBackground(Color.BLACK);
        jeton1.setEnabled(false);
        interieurmilieu.add(jeton1);
        jeu.setJeton1Component(jeton1);
        JButton[] UVmilieu = new JButton[24];

        for (int i = 0; i < UVmilieu.length; i++) {
            UVmilieu[i] = new JButton();
            UVmilieu[i].setEnabled(false);
            UVmilieu[i].addActionListener(new ChoisirCentreUv(jeu,i));
            jeu.addCentreUvComponent(UVmilieu[i]);
        }
        for (JButton button : UVmilieu) {
            interieurmilieu.add(button);
        }

//        JButton milieuButton = new JButton();
        milieuButton.add(interieurmilieu);
        milieuButton.addActionListener(new ChoisirCentre(jeu));
        milieuButton.setEnabled(false);

        milieu.add(milieuButton);


        table.add(centre);

        centre.add(disquesPart1);
        centre.add(milieu);
        centre.add(disquesPart2);



    }

    public static Component createDisque(Jeu jeu, int n, Disque d){
        JPanel disque = new JPanel(new GridBagLayout());
        JPanel interieurdisque = new JPanel();
        UV[] tabAleaUv= PremiereDistributionModel.QuatresUVAleatoires();
        jeu.setDisqueUvTab(disqueId,tabAleaUv);
        disque.setLayout(new GridLayout());
        interieurdisque.setLayout(new GridLayout(2, 2, 5, 5));

        JButton[] UVdisque = new JButton[4];
        d.setTabButtonDisqueUV(UVdisque);

        for (int i = 0; i < UVdisque.length; i++) {
            UVdisque[i] = new JButton();
            UVdisque[i].setEnabled(false);
            UVdisque[i].addActionListener(new ChoisirDisqueUv(i,jeu));
//            Gestion de l'affichage des couleurs en fonction de l'UV pioché aléatoirement
            if (tabAleaUv[i].getCouleur() == "Bleu"){
                UVdisque[i].setBackground(Color.decode("#3C00FF")); // Blue
            }
            if (tabAleaUv[i].getCouleur() == "Jaune"){
                UVdisque[i].setBackground(Color.decode("#FFFF03")); // Yellow
            }
            if (tabAleaUv[i].getCouleur() == "Rouge"){
                UVdisque[i].setBackground(Color.decode("#FF0000")); // Red
            }
            if (tabAleaUv[i].getCouleur() == "Violet"){
                UVdisque[i].setBackground(Color.decode("#81007F")); // Purple
            }
            if (tabAleaUv[i].getCouleur() == "Vert"){
                UVdisque[i].setBackground(Color.decode("#4CBB17")); // Green
            }
        }
        for (JButton button : UVdisque) {
            interieurdisque.add(button);
            jeu.addDisqueUvComponent(disqueId,button);
        }

        JButton disqueButton = new JButton();
        disqueButton.add(interieurdisque);
        jeu.setDisqueComponent(disqueId,disqueButton);
        disqueButton.addActionListener(new ChoisirDisque(disqueId,jeu));
        disqueId++;
        disque.add(disqueButton);

        return disque;
    }


//  Bordure rouge pour le joueur qui joue
    public static void cMonTour(JPanel jp){
        jp.setBorder(new LineBorder(Color.RED));
        jp.revalidate();
        jp.repaint();
    }
    public static void cPasMonTour(JPanel jp){
        jp.setBorder(null);
    }

    public static void choisisCentre(JButton jb){
        jb.setBackground(Color.green);
        jb.setEnabled(false);
    }

    public static void choixCentrePossible(JButton jb){
        jb.setEnabled(true);
    }

    public static void choisisPasCentre(JButton jb){
//        jb.setBackground(Color.red);
        jb.setEnabled(false);
    }

    public static void suivantAffichageCentre(JButton centre){
        centre.setBackground(null);
        centre.setEnabled(true);

    }

    public static void suivantAffichageDisques(Component c){
        c.setBackground(null);
        c.setEnabled(true);
    }

    public static void suivantAffichageDisquesVide(Disque d, Component c){
        if (d.isEmpty() == true){
            c.setEnabled(false);
        }
    }

    public static void auSuivant(JButton suivant){
        suivant.setEnabled(true);
    }

    public static void motifComplete(JButton jm){
        jm.setText("X");
        jm.setForeground(Color.BLACK);
    }

    public static String ligneComplete(JButton jm){
        return jm.getText();
    }

    public static void videLigneEscalier(JButton je){
        je.setBackground(null);
    }

    public static String newAleaDisque(Jeu jeu, int disqueId, JButton UVdisque){
        UV AleaUv= PhaseChangementCouleursDisques.UVAleatoires();

            UVdisque.setEnabled(false);

//            Gestion de l'affichage des couleurs en fonction de l'UV pioché aléatoirement
            if (AleaUv.getCouleur() == "Bleu"){
                UVdisque.setBackground(Color.decode("#3C00FF")); // Blue
            }
            if (AleaUv.getCouleur() == "Jaune"){
                UVdisque.setBackground(Color.decode("#FFFF03")); // Yellow
            }
            if (AleaUv.getCouleur() == "Rouge"){
                UVdisque.setBackground(Color.decode("#FF0000")); // Red
            }
            if (AleaUv.getCouleur() == "Violet"){
                UVdisque.setBackground(Color.decode("#81007F")); // Purple
            }
            if (AleaUv.getCouleur() == "Vert"){
                UVdisque.setBackground(Color.decode("#4CBB17")); // Green
            }

            return AleaUv.getCouleur();
        }


    public static void reloadScore(Joueur j){
        j.getScoreIHM().setText("Etudiant " + (j.getId()+1) + " - Crédits " + j.getScore());;
    }







}
