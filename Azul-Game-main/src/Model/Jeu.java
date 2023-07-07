package Model;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Jeu {
    private static int Nbjoueurs;
    private int Nbdisques;
    private Centre centrejeu = new Centre();
    private int joueurEnCours =0;
    private int TourEnCours =1;
    private Joueur[] joueurs;
    private ArrayList<Disque> TabDisques = new ArrayList();

    protected JButton[] disque1IHM;

    protected Component[] disquesIHM;

    protected JButton centreIHM;
    protected int phase = 1;

    protected JButton suivIHM;
    protected String choixDisqueOuCentre = null;

    public Jeu(){}

    public Jeu(int nj, int nd, Centre cj){
        Nbjoueurs=nj;
        Nbdisques=nd;
        centrejeu=cj;
    }

    public void setJeton1Component(java.awt.Component Jeton1Component){
        centrejeu.setJeton1Component(Jeton1Component);
    }
    public java.awt.Component getJeton1Component(){
        return centrejeu.getJeton1Component();
    }
    public void addCentreUv(UV uv){
        this.centrejeu.addUv(uv);
    }
    public ArrayList<UV> getCentreTabUv(){
        return this.centrejeu.getTabUv();
    }

    public Centre getCentrejeu() {
        return centrejeu;
    }

    public void setCentrejeu(Centre centrejeu) {
        this.centrejeu = centrejeu;
    }

    public String getChoixDisqueOuCentre() {
        return choixDisqueOuCentre;
    }

    public void setChoixDisqueOuCentre(String choixDisqueOuCentre) {
        this.choixDisqueOuCentre = choixDisqueOuCentre;
    }

    public JButton getSuivIHM() {
        return suivIHM;
    }

    public void setSuivIHM(JButton suivIHM) {
        this.suivIHM = suivIHM;
    }

    public ArrayList<java.awt.Component> getCentreTabUvComponent(){
        return this.centrejeu.getTabUvComponent();
    }
    public java.awt.Component getCentreUvComponent(int i){
       return  this.centrejeu.getUvComponent(i);
    }
    public void addCentreUvComponent(java.awt.Component component){
        this.centrejeu.addUvComponent(component);
    }

    public void addMinusUvComponent(int n, java.awt.Component component){
        Joueur tempJoueur =  this.getJoueurs(n);
        tempJoueur.addMinusUvComponent(component);
    }
    public void addEscalierUvLigneComponent(int n, java.awt.Component Component){
        Joueur tempJoueur =  this.getJoueurs(n);
        tempJoueur.addEscalierUvLigneComponent(Component);
    }
    public void addEscalierLigneComponent(int n, java.awt.Component Component){
       Joueur tempJoueur =  this.getJoueurs(n);
       tempJoueur.addEscalierLigneComponent(Component);
    }

    public void  initializeDisqueUv(int n){
        for(int i=0;i<n;i++){
            this.TabDisques.add(new Disque());
        }
    }
    public ArrayList<java.awt.Component> getDisquesTabComponent(){
        ArrayList<java.awt.Component> temp = new ArrayList<java.awt.Component>();
        for(Disque tempDisque: this.TabDisques)temp.add(tempDisque.getComponentDisque());
        return temp;
    }



    public ArrayList<Disque> getTabDisques(){return this.TabDisques;}
    public Disque getDisque(int i){return (Disque)this.TabDisques.get(i);}

    public JButton getCentreIHM() {
        return centreIHM;
    }

    public void setCentreIHM(JButton centreIHM) {
        this.centreIHM = centreIHM;
    }

    public void  addDisqueUvComponent(int i,java.awt.Component ComponentDisqueUv){
        Disque tempDis =  (Disque) this.TabDisques.get(i);
        tempDis.addTabComponentDisqueUv(ComponentDisqueUv);
    }
    public ArrayList<java.awt.Component> getDisqueUvTabComponent(int i){
        Disque tempDisque = this.TabDisques.get(i);
        return tempDisque.getTabComponentDisqueUv();
    }

//    public JButton[] getDisqueUvTabButton(int i){
//        JButton tempDisque = this.disque1IHM[i];
//        return tempDisque;
//    }
    public java.awt.Component getDisqueUvComponent(int i){
        Disque tempDisque = this.getDisque(i);
        return tempDisque.getComponentDisqueUv(i);
    }
    public java.awt.Component getDisqueComponent(int i){
        Disque tempDisque = this.TabDisques.get(i);
        return tempDisque.getComponentDisque();
    }
    public void  setDisqueComponent(int i,java.awt.Component ComponentDisque){
        Disque tempdis =  (Disque) this.TabDisques.get(i);
        tempdis.setComponentDisque(ComponentDisque);
    }
    public void  setDisqueUvTab(int i,UV[] TabUv){
        Disque tempdis =  (Disque) this.TabDisques.get(i);
        tempdis.setDisqueTabUv(TabUv);
    }

    public Component[] getDisquesIHM() {
        return disquesIHM;
    }

    public void setDisquesIHM(Component[] disquesIHM) {
        this.disquesIHM = disquesIHM;
    }

    public Joueur[] getJoueurs() {
        return this.joueurs;
    }
    public Joueur getJoueurs(int i) {
        return joueurs[i];
    }
    public void setJoueurs(Joueur[] joueurs) {
        this.joueurs = joueurs;
    }
    public int getJoueurEnCours() {
        return joueurEnCours;
    }

    public void setJoueurEnCours(int joueurEnCours) {
        this.joueurEnCours = joueurEnCours;
    }

    public int getNbdisques() {
        return Nbdisques;
    }

    public int getNbjoueurs() {
        return Nbjoueurs;
    }

    public void setNbjoueurs(int nbjoueurs) {
        Nbjoueurs = nbjoueurs;
    }

    public int getTourEnCours() {
        return TourEnCours;
    }

    public void setTourEnCours(int tourEnCours) {
        TourEnCours = tourEnCours;
    }

    public int getPhase() {
        return phase;
    }

    public void setPhase(int phase) {
        this.phase = phase;
    }

    public JButton[] getDisque1IHM() {
        return disque1IHM;
    }

    public void setDisque1IHM(JButton[] disque1IHM) {
        this.disque1IHM = disque1IHM;
    }






    //************************************rawan

    public Joueur[] getJoueursTab() {
        return joueurs;
    }

    public Disque disqueselonjoueur(){
        if(Nbjoueurs==2){
            Disque d1 =new Disque();
            Disque d2 =new Disque();
            Disque d3 =new Disque();
            Disque d4 =new Disque();
            Disque d5 =new Disque();

        }
        else if(Nbjoueurs==3){
            Disque d6 =new Disque();
            Disque d7 =new Disque();
            Disque d8 =new Disque();
            Disque d9 =new Disque();
            Disque d10 =new Disque();
            Disque d11 =new Disque();
            Disque d12 =new Disque();

        }
        else if(Nbjoueurs==4){
            Disque d13 =new Disque();
            Disque d14 =new Disque();
            Disque d15 =new Disque();
            Disque d16 =new Disque();
            Disque d17 =new Disque();
            Disque d18 =new Disque();
            Disque d19 =new Disque();
            Disque d20 =new Disque();
            Disque d21 =new Disque();

        }
        else{
            try{
                System.out.println("ERROR");

            }catch(Exception e){

            }
        }

        return null;
    }
    public Plateau plateauselonjoueurs(){
        if(Nbjoueurs==2){
            Plateau p1 = new Plateau();
            Plateau p2= new Plateau();


        }
        else if(Nbjoueurs==3){
            Plateau p3 = new Plateau();
            Plateau p4= new Plateau();
            Plateau p5 = new Plateau();


        }
        else if(Nbjoueurs==4){
            Plateau p6 = new Plateau();
            Plateau p7 = new Plateau();
            Plateau p8 = new Plateau();
            Plateau p9 = new Plateau();


        }
        else{/*j'essaie de ne pas avoir des erreurs et des bugs c pk j'ai utilisÃ© les exceptions*/
            try{
                System.out.println("ERROR");
            }catch(Exception e){

            }
        }
        return null;
    }
    public UV aleasacdisque(){
        Random UV= new Random();
        UV[] UVtabalea = new UV[0];//revoir resolution
        int induv1=UV.nextInt(UVtabalea.length);
        int induv2=UV.nextInt(UVtabalea.length);
        int induv3=UV.nextInt(UVtabalea.length);
        int induv4=UV.nextInt(UVtabalea.length);

        return null;
    }

    /**Partie commencer une nouvelle phase
     * Si ts les disques sont vides et le centre est vide on passe à une nouvelle phase
     * à la fin de la phase le jeton1 est avec l'un des joueurs et c'est lui qui commmence par jouer
     * lors du début de la phase suivante le jeton1 revient au centre
     * tous les lignes pleins sont vider et de méme pour le tableau de pts négatifs*/
    public  void commencernouvphase(Jeu jeu){
        if(disqueselonjoueur().empty==true){ //si les disques sont vides
            System.out.println("Les disques sont vides");
            if(centrejeu.isEmptycentre()==true){ //et si le centre est vide
                System.out.println("Les disques et le centre sont vides une nouvelle phase va commencer");
            }
            Joueur[] tabJ = jeu.getJoueursTab();//on récupère le joueur
            for(Joueur j: tabJ){ //et pou chaque joueur on vérifie si la ligne est pleine on la vide sinon on ne fait rien
                /**Vérification de la première ligne*/
                if(j.plateaujoueur.escalierPlateau.tabl1!=null){
                    j.plateaujoueur.escalierPlateau.setTabl1(null);
                }
                /**Vérification de la deuxième ligne*/
                for(int i=0 ; i<j.plateaujoueur.escalierPlateau.tabl2.length ; i++){
                    if (null != j.plateaujoueur.escalierPlateau.tabl2[i]) {
                        System.out.println("Pas Vide");
                        j.plateaujoueur.escalierPlateau.setTabl2(null);
                    }
                }
                /**Vérification de la troisième ligne*/
                for(int i=0 ; i<j.plateaujoueur.escalierPlateau.tabl3.length ; i++){
                    if (null != j.plateaujoueur.escalierPlateau.tabl3[i]) {
                        System.out.println("Pas Vide");
                        j.plateaujoueur.escalierPlateau.setTabl3(null);
                    }
                }
                /**Vérification de la quatrième ligne*/
                for(int i=0 ; i<j.plateaujoueur.escalierPlateau.tabl4.length ; i++){
                    if (null != j.plateaujoueur.escalierPlateau.tabl4[i]) {
                        System.out.println("Pas Vide");
                        j.plateaujoueur.escalierPlateau.setTabl4(null);
                    }
                }
                /**Vérification de la cinquième ligne*/
                for(int i=0 ; i<j.plateaujoueur.escalierPlateau.tabl5.length ; i++){
                    if (null != j.plateaujoueur.escalierPlateau.tabl5[i]) {
                        System.out.println("Pas Vide");
                        j.plateaujoueur.escalierPlateau.setTabl5(null);
                    }
                }
                VidagetabMinus.vidertabminus(j.plateaujoueur.tabMinus);//on vide le tableau négatif
                j.jeton1=false;//initialisation pour qu'aucun des joueurs n'a le jeton 1
            }
        }
        //rendre le jeton1 au centre
        jeu.centrejeu.jeton1=true;//on replace le jeton 1 au centre
        /**Remplissage des disques par 4 UVs aleatoires de nouveau
         * en utilisant la méthode QuatresUVAleatoires de la classe PremiereDistributionModel*/
        PremiereDistributionModel.QuatresUVAleatoires();
    }
    //*********************************************888

}
