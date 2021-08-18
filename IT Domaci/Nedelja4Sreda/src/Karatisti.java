import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Karatisti {

    private String ime;
    private int godine;
    private String rang;
    private String[] kata;


    public Karatisti(String ime, int godine, String rang, String[] kata) {
        this.ime = ime;
        if (godine>0){ this.godine = godine;}
            else{ this.godine = 1; System.out.println("Greska! Godine su 1 za "+this.ime);}
        if (rangCheck(rang)){ this.rang = rang;}
            else{ this.rang = "10Kyu"; System.out.println("Greska! Rang je 10Kyu za "+this.ime);}
        this.kata = kata;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        if (godine>0){ this.godine = godine;}
        else{ System.out.println("Greska! Godine su "+this.godine+" za "+this.ime);}
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        if (rangCheck(rang)){ this.rang = rang;}
        else{ System.out.println("Greska! Rang je "+this.rang+" za "+this.ime);}
    }

    public String[] getKata() {
        return kata;
    }

    public void setKata(String[] kata) {
        this.kata = kata;
    }

    public void napadni(int index){
        System.out.println("Karatista "+ime+" napada sa "+kata[index]+" katom");
    }

    public void vatreniNapad(){
        Random x = new Random();
        napadni(x.nextInt(kata.length));
    }

    public void log(){
        System.out.println("Karatistia: "+ime+", "+godine+", "+rang+" - zna naredne kate "+Arrays.toString(kata));
    }

    public static boolean rangCheck(String rang){
        if (rang.length()<4) return false;

        if (Character.isDigit(rang.charAt(1))){
            if(Integer.parseInt(rang.substring(0,2))<=10 && (rang.substring(2).equals("Dan") || rang.substring(2).equals("Kyu"))){
                return true;
            }
        }else{
            if(Integer.parseInt(rang.substring(0,1))>0 && Integer.parseInt(rang.substring(0,1))<10 && (rang.substring(1).equals("Dan") || rang.substring(1).equals("Kyu"))) {
                return true;
            }
        }

        return false;

    }



}
