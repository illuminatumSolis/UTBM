package Model;

public class FinPhaseVerif {
    public static boolean DisquesVides(Jeu jeu){
        boolean disquesEmpty = false;
        boolean allEqual = true;
        boolean[] disqueEmptyTab = new boolean[jeu.getTabDisques().size()];
        for(int i = 0; i < jeu.getTabDisques().size(); i++){
            disqueEmptyTab[i] = jeu.getDisque(i).isEmpty();
        }

        for (int i = 1; i < disqueEmptyTab.length; i++) {
            if (disqueEmptyTab[i] != disqueEmptyTab[0]) {
                allEqual = false;
                break;
            }
        }
        if (allEqual) {
            if(disqueEmptyTab[0] == true){
                disquesEmpty = true;
               // System.out.println("Tous les disques sont vides");
            }else{
               // System.out.println("Tous les disques ne sont pas vides");
            }
        } else {
            //System.out.println("Tous les disques ne sont pas vides");
        }

        return disquesEmpty;
    }
}
