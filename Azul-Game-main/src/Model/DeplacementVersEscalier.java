package Model;

import java.util.ArrayList;

public class DeplacementVersEscalier {

    public static int checkIfLineIsEmpty(Joueur Joueur, int numeroLigne){
        switch(numeroLigne){
            case 0:{
                for(int i=0;i < Joueur.plateaujoueur.escalierPlateau.tabl1.length;i++) if(Joueur.plateaujoueur.escalierPlateau.tabl1[i] == null){ return i;}
            }
            case 1:{
                for(int i=0;i < Joueur.plateaujoueur.escalierPlateau.tabl2.length;i++) if(Joueur.plateaujoueur.escalierPlateau.tabl2[i] == null) { return i;}
            }
            case 2:{
                for(int i=0;i < Joueur.plateaujoueur.escalierPlateau.tabl3.length;i++) if(Joueur.plateaujoueur.escalierPlateau.tabl3[i] == null) { return i;}
                }
            case 3:{
                for(int i=0;i < Joueur.plateaujoueur.escalierPlateau.tabl4.length;i++) if(Joueur.plateaujoueur.escalierPlateau.tabl4[i] == null) {return i;}}

            case 4:{
                for(int i=0;i < Joueur.plateaujoueur.escalierPlateau.tabl5.length;i++) if(Joueur.plateaujoueur.escalierPlateau.tabl5[i] == null) { return i;}
                }
        }
        return -1;
    }

    public static boolean checkIfMinusIsEmpty(Joueur Joueur){
        boolean result = false;
        for(int i=0;i < Joueur.plateaujoueur.tabMinus.length;i++) if(Joueur.plateaujoueur.tabMinus[i] == null) result = true;
        return result;
    }

    public static boolean deplacementDisqueVersEscalier(Disque Disque,Joueur Joueur, int numeroLigne ){

        //Joueur.plateaujoueur.escalierPlateau.tabl5[0] = new UV("Bleu",99);

        UV[] tempTabUvDisque = Disque.getDisqueTabUv();
        ArrayList<UV>  UvJoueur = Joueur.getDisqueUvTabChoix();

        boolean Continue=false;

       switch(numeroLigne){
           case 0:{
               if(Joueur.plateaujoueur.escalierPlateau.tabl1[0] == null){Continue=true;}
               else if(Joueur.plateaujoueur.escalierPlateau.tabl1[0].getCouleur().equals(UvJoueur.get(0).getCouleur())){Continue=true;}
               break;
           }
           case 1:{
               if(Joueur.plateaujoueur.escalierPlateau.tabl2[0] == null){Continue=true;}
               else if(Joueur.plateaujoueur.escalierPlateau.tabl2[0].getCouleur().equals(UvJoueur.get(0).getCouleur())){Continue=true;}
                   break;
           }
           case 2:{
               if(Joueur.plateaujoueur.escalierPlateau.tabl3[0] == null){Continue=true;}
               else if(Joueur.plateaujoueur.escalierPlateau.tabl3[0].getCouleur().equals(UvJoueur.get(0).getCouleur())){Continue=true;}
                   break;
           }
           case 3:{
               if(Joueur.plateaujoueur.escalierPlateau.tabl4[0] == null){Continue=true;}
               else if(Joueur.plateaujoueur.escalierPlateau.tabl4[0].getCouleur().equals(UvJoueur.get(0).getCouleur())){Continue=true;}
                   break;
           }
           case 4:{
               if(Joueur.plateaujoueur.escalierPlateau.tabl5[0] == null){Continue=true;}
               else {
                   if(Joueur.plateaujoueur.escalierPlateau.tabl5[0].getCouleur().equals(UvJoueur.get(0).getCouleur())){Continue=true;
               }}
                   break;
           }

        }

        if(Continue){
            int posMinus=0;
            int posLigneUv=-1;
            switch(numeroLigne){
                case 0: {
                    posLigneUv = checkIfLineIsEmpty(Joueur, numeroLigne);
                    if (posLigneUv != -1) {
                        for (int i = posLigneUv; i < Joueur.plateaujoueur.escalierPlateau.tabl1.length; i++){
                            if(!UvJoueur.isEmpty()) {
                                Joueur.plateaujoueur.escalierPlateau.tabl1[i] = UvJoueur.get(0);
                                UvJoueur.remove(0);
                            }
                        }
                        if(!UvJoueur.isEmpty()){
                            if(checkIfMinusIsEmpty(Joueur)){
                                while(Joueur.plateaujoueur.tabMinus[posMinus] != null) posMinus++;
                                while(UvJoueur.size() != 0 && posMinus < 6){ Joueur.plateaujoueur.tabMinus[posMinus] = UvJoueur.get(0);UvJoueur.remove(0);posMinus++;}
                            }
                        }
                    }
                    else {
                        if(checkIfMinusIsEmpty(Joueur)){
                            while(Joueur.plateaujoueur.tabMinus[posMinus] != null) posMinus++;
                            while(UvJoueur.size() != 0 && posMinus < 6){ Joueur.plateaujoueur.tabMinus[posMinus] = UvJoueur.get(0);UvJoueur.remove(0) ; posMinus++;}
                        }
                    }
                    break;}
                case 1: {
                    posLigneUv = checkIfLineIsEmpty(Joueur, numeroLigne);
                    if (posLigneUv != -1) {
                        for (int i = posLigneUv; i < Joueur.plateaujoueur.escalierPlateau.tabl2.length; i++){
                            if(!UvJoueur.isEmpty()) {
                                Joueur.plateaujoueur.escalierPlateau.tabl2[i] = UvJoueur.get(0);
                                UvJoueur.remove(0);
                            }
                        }
                        if(!UvJoueur.isEmpty()){
                            if(checkIfMinusIsEmpty(Joueur)){
                                while(Joueur.plateaujoueur.tabMinus[posMinus] != null) posMinus++;
                                while(UvJoueur.size() != 0 && posMinus < 6){ Joueur.plateaujoueur.tabMinus[posMinus] = UvJoueur.get(0);UvJoueur.remove(0) ; posMinus++;}
                            }
                        }
                    }
                    else {
                        if(checkIfMinusIsEmpty(Joueur)){
                            while(Joueur.plateaujoueur.tabMinus[posMinus] != null) posMinus++;
                            while(UvJoueur.size() != 0 && posMinus < 6){ Joueur.plateaujoueur.tabMinus[posMinus] = UvJoueur.get(0);UvJoueur.remove(0) ; posMinus++;}
                        }
                    }
                    break;}
                case 2: {
                    posLigneUv = checkIfLineIsEmpty(Joueur, numeroLigne);
                    if (posLigneUv != -1) {
                        for (int i = posLigneUv; i < Joueur.plateaujoueur.escalierPlateau.tabl3.length; i++){
                            if(!UvJoueur.isEmpty()) {
                                Joueur.plateaujoueur.escalierPlateau.tabl3[i] = UvJoueur.get(0);
                                UvJoueur.remove(0);
                            }
                        }
                        if(!UvJoueur.isEmpty()){
                            if(checkIfMinusIsEmpty(Joueur)){
                                while(Joueur.plateaujoueur.tabMinus[posMinus] != null) posMinus++;
                                while(UvJoueur.size() != 0 && posMinus < 6){ Joueur.plateaujoueur.tabMinus[posMinus] = UvJoueur.get(0);UvJoueur.remove(0) ; posMinus++;}
                            }
                        }
                    }
                    else {
                        if(checkIfMinusIsEmpty(Joueur)){
                            while(Joueur.plateaujoueur.tabMinus[posMinus] != null) posMinus++;
                            while(UvJoueur.size() != 0 && posMinus < 6){ Joueur.plateaujoueur.tabMinus[posMinus] = UvJoueur.get(0);UvJoueur.remove(0) ; posMinus++;}
                        }
                    }
                    break;}
                case 3: {
                    posLigneUv = checkIfLineIsEmpty(Joueur, numeroLigne);
                    if (posLigneUv != -1) {
                        for (int i = posLigneUv; i < Joueur.plateaujoueur.escalierPlateau.tabl4.length; i++){
                            if(!UvJoueur.isEmpty()) {
                                Joueur.plateaujoueur.escalierPlateau.tabl4[i] = UvJoueur.get(0);
                                UvJoueur.remove(0);
                            }
                        }
                        if(!UvJoueur.isEmpty()){
                            if(checkIfMinusIsEmpty(Joueur)){
                                while(Joueur.plateaujoueur.tabMinus[posMinus] != null) posMinus++;
                                while(UvJoueur.size() != 0 && posMinus < 6){ Joueur.plateaujoueur.tabMinus[posMinus] = UvJoueur.get(0);UvJoueur.remove(0) ; posMinus++;}
                            }
                        }
                    }
                    else {
                        if(checkIfMinusIsEmpty(Joueur)){
                            while(Joueur.plateaujoueur.tabMinus[posMinus] != null) posMinus++;
                            while(UvJoueur.size() != 0 && posMinus < 6){ Joueur.plateaujoueur.tabMinus[posMinus] = UvJoueur.get(0);UvJoueur.remove(0) ; posMinus++;}
                        }
                    }
                    break;}
                case 4: {
                    posLigneUv = checkIfLineIsEmpty(Joueur, numeroLigne);
                    if (posLigneUv != -1) {
                        for (int i = posLigneUv; i < Joueur.plateaujoueur.escalierPlateau.tabl5.length; i++){
                            if(!UvJoueur.isEmpty()) {
                                Joueur.plateaujoueur.escalierPlateau.tabl5[i] = UvJoueur.get(0);
                                UvJoueur.remove(0);
                            }
                        }
                        if(!UvJoueur.isEmpty()){
                            if(checkIfMinusIsEmpty(Joueur)){
                                while(Joueur.plateaujoueur.tabMinus[posMinus] != null) posMinus++;
                                while(UvJoueur.size() != 0 && posMinus < 6){ Joueur.plateaujoueur.tabMinus[posMinus] = UvJoueur.get(0);UvJoueur.remove(0) ; posMinus++;}
                            }
                        }
                    }
                    else {
                        if(checkIfMinusIsEmpty(Joueur)){
                            while(Joueur.plateaujoueur.tabMinus[posMinus] != null) posMinus++;
                            while(UvJoueur.size() != 0 && posMinus < 6){ Joueur.plateaujoueur.tabMinus[posMinus] = UvJoueur.get(0);UvJoueur.remove(0) ; posMinus++;}
                        }
                    }
                    break;}
            }
        }

        return Continue;
    }

    public static boolean deplacementCentreVersEscalier(Joueur Joueur, int numeroLigne ){

        ArrayList<UV>  UvJoueur = Joueur.getCentreTabUvChoix();

        boolean Continue=false;

        switch(numeroLigne){
            case 0:{
                if(Joueur.plateaujoueur.escalierPlateau.tabl1[0] == null){Continue=true;}
                else if(Joueur.plateaujoueur.escalierPlateau.tabl1[0].getCouleur().equals(UvJoueur.get(0).getCouleur())){Continue=true;}
                break;
            }
            case 1:{
                if(Joueur.plateaujoueur.escalierPlateau.tabl2[0] == null){Continue=true;}
                else if(Joueur.plateaujoueur.escalierPlateau.tabl2[0].getCouleur().equals(UvJoueur.get(0).getCouleur())){Continue=true;}
                break;
            }
            case 2:{
                if(Joueur.plateaujoueur.escalierPlateau.tabl3[0] == null){Continue=true;}
                else if(Joueur.plateaujoueur.escalierPlateau.tabl3[0].getCouleur().equals(UvJoueur.get(0).getCouleur())){Continue=true;}
                break;
            }
            case 3:{
                if(Joueur.plateaujoueur.escalierPlateau.tabl4[0] == null){Continue=true;}
                else if(Joueur.plateaujoueur.escalierPlateau.tabl4[0].getCouleur().equals(UvJoueur.get(0).getCouleur())){Continue=true;}
                break;
            }
            case 4:{
                if(Joueur.plateaujoueur.escalierPlateau.tabl5[0] == null){Continue=true;}
                else {
                    if(Joueur.plateaujoueur.escalierPlateau.tabl5[0].getCouleur().equals(UvJoueur.get(0).getCouleur())){Continue=true;
                    }}
                break;
            }

        }

        if(Continue){
            int posMinus=0;
            int posLigneUv=-1;
            switch(numeroLigne){
                case 0: {
                    posLigneUv = checkIfLineIsEmpty(Joueur, numeroLigne);
                    if (posLigneUv != -1) {
                        for (int i = posLigneUv; i < Joueur.plateaujoueur.escalierPlateau.tabl1.length; i++){
                            if(!UvJoueur.isEmpty()) {
                                Joueur.plateaujoueur.escalierPlateau.tabl1[i] = UvJoueur.get(0);
                                UvJoueur.remove(0);
                            }
                        }
                        if(!UvJoueur.isEmpty()){
                            if(checkIfMinusIsEmpty(Joueur)){
                                while(Joueur.plateaujoueur.tabMinus[posMinus] != null) posMinus++;
                                while(UvJoueur.size() != 0 && posMinus < 6){ Joueur.plateaujoueur.tabMinus[posMinus] = UvJoueur.get(0);UvJoueur.remove(0);posMinus++;}
                            }
                        }
                    }
                    else {
                        if(checkIfMinusIsEmpty(Joueur)){
                            while(Joueur.plateaujoueur.tabMinus[posMinus] != null) posMinus++;
                            while(UvJoueur.size() != 0 && posMinus < 6){ Joueur.plateaujoueur.tabMinus[posMinus] = UvJoueur.get(0);UvJoueur.remove(0) ; posMinus++;}
                        }
                    }
                    break;}
                case 1: {
                    posLigneUv = checkIfLineIsEmpty(Joueur, numeroLigne);
                    if (posLigneUv != -1) {
                        for (int i = posLigneUv; i < Joueur.plateaujoueur.escalierPlateau.tabl2.length; i++){
                            if(!UvJoueur.isEmpty()) {
                                Joueur.plateaujoueur.escalierPlateau.tabl2[i] = UvJoueur.get(0);
                                UvJoueur.remove(0);
                            }
                        }
                        if(!UvJoueur.isEmpty()){
                            if(checkIfMinusIsEmpty(Joueur)){
                                while(Joueur.plateaujoueur.tabMinus[posMinus] != null) posMinus++;
                                while(UvJoueur.size() != 0 && posMinus < 6){ Joueur.plateaujoueur.tabMinus[posMinus] = UvJoueur.get(0);UvJoueur.remove(0) ; posMinus++;}
                            }
                        }
                    }
                    else {
                        if(checkIfMinusIsEmpty(Joueur)){
                            while(Joueur.plateaujoueur.tabMinus[posMinus] != null) posMinus++;
                            while(UvJoueur.size() != 0 && posMinus < 6){ Joueur.plateaujoueur.tabMinus[posMinus] = UvJoueur.get(0);UvJoueur.remove(0) ; posMinus++;}
                        }
                    }
                    break;}
                case 2: {
                    posLigneUv = checkIfLineIsEmpty(Joueur, numeroLigne);
                    if (posLigneUv != -1) {
                        for (int i = posLigneUv; i < Joueur.plateaujoueur.escalierPlateau.tabl3.length; i++){
                            if(!UvJoueur.isEmpty()) {
                                Joueur.plateaujoueur.escalierPlateau.tabl3[i] = UvJoueur.get(0);
                                UvJoueur.remove(0);
                            }
                        }
                        if(!UvJoueur.isEmpty()){
                            if(checkIfMinusIsEmpty(Joueur)){
                                while(Joueur.plateaujoueur.tabMinus[posMinus] != null) posMinus++;
                                while(UvJoueur.size() != 0 && posMinus < 6){ Joueur.plateaujoueur.tabMinus[posMinus] = UvJoueur.get(0);UvJoueur.remove(0) ; posMinus++;}
                            }
                        }
                    }
                    else {
                        if(checkIfMinusIsEmpty(Joueur)){
                            while(Joueur.plateaujoueur.tabMinus[posMinus] != null) posMinus++;
                            while(UvJoueur.size() != 0 && posMinus < 6){ Joueur.plateaujoueur.tabMinus[posMinus] = UvJoueur.get(0);UvJoueur.remove(0) ; posMinus++;}
                        }
                    }
                    break;}
                case 3: {
                    posLigneUv = checkIfLineIsEmpty(Joueur, numeroLigne);
                    if (posLigneUv != -1) {
                        for (int i = posLigneUv; i < Joueur.plateaujoueur.escalierPlateau.tabl4.length; i++){
                            if(!UvJoueur.isEmpty()) {
                                Joueur.plateaujoueur.escalierPlateau.tabl4[i] = UvJoueur.get(0);
                                UvJoueur.remove(0);
                            }
                        }
                        if(!UvJoueur.isEmpty()){
                            if(checkIfMinusIsEmpty(Joueur)){
                                while(Joueur.plateaujoueur.tabMinus[posMinus] != null) posMinus++;
                                while(UvJoueur.size() != 0 && posMinus < 6){ Joueur.plateaujoueur.tabMinus[posMinus] = UvJoueur.get(0);UvJoueur.remove(0) ; posMinus++;}
                            }
                        }
                    }
                    else {
                        if(checkIfMinusIsEmpty(Joueur)){
                            while(Joueur.plateaujoueur.tabMinus[posMinus] != null) posMinus++;
                            while(UvJoueur.size() != 0 && posMinus < 6){ Joueur.plateaujoueur.tabMinus[posMinus] = UvJoueur.get(0);UvJoueur.remove(0) ; posMinus++;}
                        }
                    }
                    break;}
                case 4: {
                    posLigneUv = checkIfLineIsEmpty(Joueur, numeroLigne);
                    if (posLigneUv != -1) {
                        for (int i = posLigneUv; i < Joueur.plateaujoueur.escalierPlateau.tabl5.length; i++){
                            if(!UvJoueur.isEmpty()) {
                                Joueur.plateaujoueur.escalierPlateau.tabl5[i] = UvJoueur.get(0);
                                UvJoueur.remove(0);
                            }
                        }
                        if(!UvJoueur.isEmpty()){
                            if(checkIfMinusIsEmpty(Joueur)){
                                while(Joueur.plateaujoueur.tabMinus[posMinus] != null) posMinus++;
                                while(UvJoueur.size() != 0 && posMinus < 6){ Joueur.plateaujoueur.tabMinus[posMinus] = UvJoueur.get(0);UvJoueur.remove(0) ; posMinus++;}
                            }
                        }
                    }
                    else {
                        if(checkIfMinusIsEmpty(Joueur)){
                            while(Joueur.plateaujoueur.tabMinus[posMinus] != null) posMinus++;
                            while(UvJoueur.size() != 0 && posMinus < 6){ Joueur.plateaujoueur.tabMinus[posMinus] = UvJoueur.get(0);UvJoueur.remove(0) ; posMinus++;}
                        }
                    }
                    break;}
            }
        }

        return Continue;
    }

    }


