import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Karatisti {

    private String ime;
    private int godine;
    private String rang;
    private String[] kata;


    public static String rangovi =  "10Kyu 9Kyu 8Kyu 7Kyu 6Kyu 5Kyu 4Kyu 3Kyu 2Kyu 1Kyu 1Dan 2Dan 3Dan 4Dan 5Dan 6Dan 7Dan 8Dan 9Dan 10Dan";

    public Karatisti(String ime, int godine, String rang, String[] kata) {
        this.ime = ime;
        if (godine>=0){ this.godine = godine;}
            else{ this.godine = 0; System.out.println("Godine su 0 za "+this.ime);}
        if (rangovi.contains(rang)){ this.rang = rang;}
            else{ this.rang = "10Kyu"; System.out.println("Rang je 10Kyu za "+this.ime);}
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
        if (godine>=0){ this.godine = godine;}
        else{ this.godine = 0; System.out.println("Godine su 0 za "+this.ime);}
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        if (rangovi.contains(rang)){ this.rang = rang;}
        else{ this.rang = "10Kyu"; System.out.println("Rang je 10Kyu za "+this.ime);}
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



}
