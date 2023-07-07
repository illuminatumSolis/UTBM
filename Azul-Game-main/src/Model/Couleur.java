package Model;

public class Couleur {
    public static String getColor(String color){
        String result="";
        switch(color){
            case "Bleu":{
                result = "#3C00FF";
                break;
            }
            case "Vert":{
                result = "#4CBB17";
                break;
            }
            case "Violet":{
                result = "#81007F";
                break;
            }
            case "Rouge":{
                result ="#FF0000";
                break;
            }
            case "Jaune":{
                result ="#FFFF03";
                break;
            }
        }
        return result;
    }
}