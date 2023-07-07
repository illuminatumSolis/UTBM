package Model;

public class Escalier {
    protected  UV[] tabl1=new UV[1];
    protected  UV[] tabl2=new UV[2];
    protected  UV[] tabl3=new UV[3];
    protected  UV[] tabl4=new UV[4];
    protected  UV[] tabl5=new UV[5];

    public Escalier(){
        for(UV uv : tabl1) uv = null;
        for(UV uv : tabl2) uv = null;
        for(UV uv : tabl3) uv = null;
        for(UV uv : tabl4) uv = null;
        for(UV uv : tabl5) uv = null;

    }
    public Escalier(UV[] tabl1, UV[] tabl2, UV[] tabl3, UV[] tabl4, UV[] tabl5) {
        this.tabl1 = tabl1;
        this.tabl2 = tabl2;
        this.tabl3 = tabl3;
        this.tabl4 = tabl4;
        this.tabl5 = tabl5;
    }
    //les getters et les setters
    public UV[] getTabl1() {
        return tabl1;
    }

    public UV[] getTabl2() {
        return tabl2;
    }

    public UV[] getTabl3() {
        return tabl3;
    }

    public UV[] getTabl4() {
        return tabl4;
    }

    public UV[] getTabl5() {
        return tabl5;
    }
    public void setTabl1(UV[] tabl1) {
        this.tabl1 = tabl1;
    }

    public void setTabl2(UV[] tabl2) {
        this.tabl2 = tabl2;
    }

    public void setTabl3(UV[] tabl3) {
        this.tabl3 = tabl3;
    }

    public void setTabl4(UV[] tabl4) {
        this.tabl4 = tabl4;
    }

    public void setTabl5(UV[] tabl5) {
        this.tabl5 = tabl5;
    }
}
