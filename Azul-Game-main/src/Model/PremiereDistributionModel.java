package Model;

import java.util.Random;

public class PremiereDistributionModel {

    static UV type1 = new UV("Bleu",6);
    static UV type2 = new UV("Jaune",6);
    static UV type3 = new UV("Rouge",6);
    static UV type4 = new UV("Violet",6);
    static UV type5 = new UV("Vert",6);

    protected static UV[] tabTypeUV= {type1, type2, type3, type4, type5};


//    public static void distributionDisques(){
//
//        for(int uvdisque = 0; uvdisque < 3; uvdisque++) {
//            System.out.println("test");
//        }
//    }

    public static UV[] QuatresUVAleatoires(){
        Random random = new Random();
        UV[] tabUValeatoires;

        int index1 = random.nextInt(tabTypeUV.length);
        int index2 = random.nextInt(tabTypeUV.length);
        int index3 = random.nextInt(tabTypeUV.length);
        int index4 = random.nextInt(tabTypeUV.length);

        UV uvAlea1 = tabTypeUV[index1];
        UV uvAlea2 = tabTypeUV[index2];
        UV uvAlea3 = tabTypeUV[index3];
        UV uvAlea4 = tabTypeUV[index4];

        tabUValeatoires = new UV[]{uvAlea1, uvAlea2, uvAlea3, uvAlea4};
        System.out.println(uvAlea1.getCouleur() + uvAlea2.getCouleur()+uvAlea3.getCouleur()+uvAlea4.getCouleur());
        return tabUValeatoires;
    }

}
