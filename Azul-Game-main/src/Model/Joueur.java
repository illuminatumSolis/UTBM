package Model;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Joueur {

    //*****************************rawan

    protected int tournextphase;
    protected int tourjoueur;
    //*****************************
    protected  int id;
    protected  int nbpassage;
    private  int score=0;

    private JLabel scoreIHM;
    protected  boolean jeton1=false;
    protected Plateau plateaujoueur=new Plateau();  // Nouvel objet ???
    protected JPanel plateauJoueurIHM;
    protected JButton[] motifIHM = new JButton[25];
    protected String colorButton;

    protected JButton[] Stairs1;
    protected JButton[] Stairs2;

    protected JButton[] Stairs3;
    protected JButton[] Stairs4;
    protected JButton[] Stairs5;

    private int DisqueChoix=99;
    private ArrayList<UV> DisqueTabUvChoix = new ArrayList<UV>();
    private ArrayList<UV> CentreTabUvChoix = new ArrayList<UV>();
    private ArrayList<java.awt.Component> EscalierLignesTabComponent= new ArrayList<java.awt.Component>();
    private ArrayList<java.awt.Component> EscalierUvLignesTabComponent = new ArrayList<java.awt.Component>();

    private ArrayList<java.awt.Component> MinusUvTabComponent = new ArrayList<java.awt.Component>();

    public Joueur(int iD){
        this.id = iD;
    }

    public Joueur(int iD, int np, Plateau pj){
        this.id = iD;
        nbpassage=np;
        score=0;
        jeton1= false;
        plateaujoueur=pj;
    }

    public int getId() {
        return id;
    }


    public JButton[] getStairs1() {
        return Stairs1;
    }

    public void setStairs1(JButton[] stairs1) {
        Stairs1 = stairs1;
    }

    public JButton[] getStairs2() {
        return Stairs2;
    }

    public void setStairs2(JButton[] stairs2) {
        Stairs2 = stairs2;
    }

    public int getTourjoueur() {
        return tourjoueur;
    }

    public void setTourjoueur(int tourjoueur) {
        this.tourjoueur = tourjoueur;
    }

    public JButton[] getStairs3() {
        return Stairs3;
    }

    public void setStairs3(JButton[] stairs3) {
        Stairs3 = stairs3;
    }

    public JButton[] getStairs4() {
        return Stairs4;
    }

    public void setStairs4(JButton[] stairs4) {
        Stairs4 = stairs4;
    }

    public JButton[] getStairs5() {
        return Stairs5;
    }

    public void setStairs5(JButton[] stairs5) {
        Stairs5 = stairs5;
    }

    public UV[] getEscalierLigne(int i){
        switch(i){
            case 0: {
                return this.plateaujoueur.escalierPlateau.tabl1;
                    }
            case 1: {
                return this.plateaujoueur.escalierPlateau.tabl2;
            }
            case 2: {
                return this.plateaujoueur.escalierPlateau.tabl3;
            }
            case 3: {
                return this.plateaujoueur.escalierPlateau.tabl4;
            }
            case 4: {
                return this.plateaujoueur.escalierPlateau.tabl5;
            }
            default:{
                return null;
            }
        }
    }
    public UV[] getTabUvMinus(){
        return this.plateaujoueur.tabMinus;
    }
    public ArrayList<java.awt.Component> getMinusUvTabComponent(){return this.MinusUvTabComponent;}
    public java.awt.Component getMinusUvTabComponent(int i){return this.MinusUvTabComponent.get(i);}
    public void addMinusUvComponent(java.awt.Component comp){this.MinusUvTabComponent.add(comp);}

    public ArrayList<java.awt.Component> getEscalierUvLignesTabComponent(){return this.EscalierUvLignesTabComponent;}
    public java.awt.Component getEscalierUvLignesTabComponent(int i){return this.EscalierUvLignesTabComponent.get(i);}
    public void addEscalierUvLigneComponent(java.awt.Component comp){this.EscalierUvLignesTabComponent.add(comp);}

    public ArrayList<java.awt.Component> getEscalierLignesTabComponent(){ return this.EscalierLignesTabComponent;}
    public java.awt.Component getEscalierLigneComponent(int i){ return this.EscalierLignesTabComponent.get(i);}


    public void addEscalierLigneComponent(java.awt.Component EscalierLigneComponent){this.EscalierLignesTabComponent.add(EscalierLigneComponent); }

    public ArrayList<UV> getDisqueUvTabChoix() {
        return DisqueTabUvChoix;
    }
    public void addDisqueUvTabChoix(UV DisqueUvChoix) {
        this.DisqueTabUvChoix.add(DisqueUvChoix);
    }

    public void addCentreUvTabChoix(UV CentreUvChoix) {
        this.CentreTabUvChoix.add(CentreUvChoix);
    }

    public ArrayList<UV> getCentreTabUvChoix() {
        return CentreTabUvChoix;
    }

    public void emptyDisqueUvTabChoix(){
        this.getDisqueUvTabChoix().clear();
    }
    public void emptyCentreUvTabChoix(){this.getCentreTabUvChoix().clear();}
    public int getDisqueChoix() {
        return DisqueChoix;
    }
    public void setDisqueChoix(int DisqueChoix) {this.DisqueChoix = DisqueChoix; }

    public JPanel getPlateauJoueurIHM() {
        return plateauJoueurIHM;
    }

    public Plateau getPlateaujoueur() {
        return plateaujoueur;
    }

    public void setPlateauJoueurIHM(JPanel plateauJoueurIHM) {
        this.plateauJoueurIHM = plateauJoueurIHM;
    }

    public int getScore(){ return this.score;}

    public JLabel getScoreIHM() {
        return scoreIHM;
    }

    public void setScoreIHM(JLabel scoreIHM) {
        this.scoreIHM = scoreIHM;
    }

    protected void addOnScore(int score){ this.score += score;}

    public void setPlateaujoueur(Plateau Plateau){ this.plateaujoueur=Plateau;}


    public JButton getMotifIHMsolo(int i) {
        return motifIHM[i];
    }

    public String getColorButton(int i){
        if(getMotifIHMsolo(i).getBackground().equals(new Color(60, 0, 255))) {
            colorButton = "Bleu";
        }
        if(getMotifIHMsolo(i).getBackground().equals(new Color(255, 255, 3))) {
            colorButton = "Jaune";
        }
        if(getMotifIHMsolo(i).getBackground().equals(new Color(255, 0, 0))) {
            colorButton = "Rouge";
        }
        if(getMotifIHMsolo(i).getBackground().equals(new Color(129, 0, 127))) {
            colorButton = "Violet";
        }
        if(getMotifIHMsolo(i).getBackground().equals(new Color(76, 187, 23))) {
            colorButton = "Vert";
        }
        return colorButton;
    }



    public void setMotifIHMsolo(int i, JButton b) {
        this.motifIHM[i] = b;
    }




    //patience
    public void avoirJeton1(Centre c){
        if(!c.jeton1 && jeton1){
            nbpassage=1;
        }

    }
//

    //*****************************rawan
    protected int getTournextphase(){
        return tournextphase;
    }
    public int setTournextphase(int tour){
        this.tournextphase=tour;
        return tour;
    }

    /* *chosir le centre en tant que le premier joueur ou bien le chosir après qu'il y'aura qq1 qui a joué
     * à condition qu'iln n'ya aucun joueur qui a chosir le centre avant */
    public void choisircentre(Centre c,Jeu jeu){
        int j= jeu.getJoueurEnCours();
        if( c.jeton1==true){
            if(jeu.getJoueurEnCours()==1 && tourjoueur==1){//si le joeur est le premier à il ne peut pas choisir le centre
                System.out.println("Le joueur n'a pas le droit de choisir le centre et il est le premier à jouer");
            }
        }
        else {
            System.out.println("Le joueur joue le premier dans la phase suivante");
            setTournextphase(1);//le premier à jouer pr la phase suivante
            c.setJeton1(false);
            Joueur jr=jeu.getJoueurs(jeu.getJoueurEnCours());
            jr.jeton1=true;//le jeton1 sera avec le joueur qui a choisir le centre4wfv    dfwe
        }
    }
    //*****************************






}
