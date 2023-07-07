package Model;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Centre {

    //rawan
    boolean emptyc = false;
    boolean jeton1=true;//le jeton est tjrs au centre au debut
    //
    ArrayList<UV> tabUv = new ArrayList<UV>();
    ArrayList<java.awt.Component> TabUvComponent = new ArrayList<Component>();
    public java.awt.Component Jeton1Component;

    public Centre(){}
    public Centre(boolean jeton1, ArrayList<UV> tabUv) {
        this.jeton1 = jeton1;
        this.tabUv = tabUv;
    }



    public void setJeton1Component(Component Jeton1Componentjeton1) {
        this.Jeton1Component = Jeton1Component;
    }
    public java.awt.Component getJeton1Component(){
        return this.Jeton1Component;
    }

    public void setEmptyc(boolean emptyc) {
        this.emptyc = emptyc;
    }

    public UV getTabUv(int i){
        return this.tabUv.get(i);
    }

    public ArrayList<UV> getTabUv(){
        return this.tabUv;
    }

    //public ArrayList<UV> getUvTab(){
    //    return this.tabUv;
    //}

    public UV getCentreUV(int i){return this.tabUv.get(i);}
    public void addUv(UV uv){
        this.tabUv.add(uv);
    }
    public ArrayList<java.awt.Component> getTabUvComponent(){return this.TabUvComponent;}
    public java.awt.Component getUvComponent(int i){return this.TabUvComponent.get(i);}

    public void addUvComponent(java.awt.Component comp){this.TabUvComponent.add(comp);}

    //rawan
    public void setJeton1(boolean jeton1) {
        this.jeton1 = jeton1;
    }

    public boolean isEmptycentre() {
        if(emptyc==true){
            return true;
        }
        else {
            return false;
        }
    }
    //
}
