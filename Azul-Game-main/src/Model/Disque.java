package Model;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Disque {

    private static int counter = 0;
    private int id;
    protected boolean empty=false;
    protected UV[] tabUv=new UV[4];
    private java.awt.Component ComponentDisque;
    private ArrayList<java.awt.Component> TabComponentDisqueUv = new ArrayList<java.awt.Component>();

    private JButton[] TabButtonDisqueUV = new JButton[4];

    public Disque(){
        id = ++counter;
    }
    public Disque(UV[] TabUV){this.tabUv=TabUV;}
    public   Disque(boolean m,UV[] tUv){
        empty=m;
        UV[] tabUV = tUv;
    }

    public int getId() {
        return id;
    }


    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public java.awt.Component getComponentDisque(){ return (java.awt.Component)this.ComponentDisque;}
    public void setComponentDisque(java.awt.Component componentDisque){this.ComponentDisque=componentDisque;}


    public ArrayList<java.awt.Component> getTabComponentDisqueUv(){return this.TabComponentDisqueUv;}

    public JButton[] getTabButtonDisqueUv(){return this.TabButtonDisqueUV;}

    public void setTabButtonDisqueUV(JButton[] tabButtonDisqueUV) {
        TabButtonDisqueUV = tabButtonDisqueUV;
    }

    public void addTabComponentDisqueUv(java.awt.Component ComponentDisqueUv){this.TabComponentDisqueUv.add(ComponentDisqueUv);}
    public java.awt.Component getComponentDisqueUv(int i){return (java.awt.Component)this.TabComponentDisqueUv.get(i);}

    public void setTabComponentDisqueUv(ArrayList<Component> tabComponentDisqueUv) {
        TabComponentDisqueUv = tabComponentDisqueUv;
    }

    public void setDisqueTabUv(UV[] TabDisqueUv){this.tabUv = TabDisqueUv;}
    public UV[] getDisqueTabUv(){return this.tabUv;}
    public UV getDisqueUV(int i){return this.tabUv[i];}
    public void setDisqueUV(int i,UV val){this.tabUv[i]=val;}

}
