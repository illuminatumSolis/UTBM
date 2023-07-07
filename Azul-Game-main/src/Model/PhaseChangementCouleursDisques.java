package Model;

import java.util.Random;

public class PhaseChangementCouleursDisques {
    static UV type1 = new UV("Bleu",6);
    static UV type2 = new UV("Jaune",6);
    static UV type3 = new UV("Rouge",6);
    static UV type4 = new UV("Violet",6);
    static UV type5 = new UV("Vert",6);

    protected static UV[] tabTypeUV= {type1, type2, type3, type4, type5};



    public static UV UVAleatoires(){
        Random random = new Random();
        int index1 = random.nextInt(tabTypeUV.length);

        UV uvAlea = tabTypeUV[index1];

        return uvAlea;
    }
}
