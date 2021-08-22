package prvi;

import java.util.ArrayList;

public class Posta {
    private ArrayList<Poruka> poruke;

    /*Konstruktori*/

    public Posta(ArrayList<Poruka> poruke) {
        this.poruke = poruke;
    }
    /*Metode*/

    public Poruka get(int p) {
        return poruke.get(p);
    }


    //Dodaje poruku p u poruke ako ona vec ne postoji (gledano u odnosu na id)
    public void add(Poruka p){
        //TODO: Implement me
        boolean postoji = false;
        for (Poruka poruka :
                poruke) {
            if (poruka.getId() == p.getId()) {
                postoji = true;
                break;
            }
        }
        if (!postoji)
            poruke.add(p);
        else
            System.out.println("Poruka "+p+" postoji!");
    }

    //Brise poruku p iz poruka ako ona postoji (gledano u odnosu na id)
    public void remove(Poruka p){
        //TODO: Implement me
        boolean postoji = false;
        for (Poruka poruka :
                poruke) {
            if (poruka.getId() == p.getId()) {
                postoji = true;
                break;
            }
        }
        if (postoji)
            poruke.remove(p);
        else
            System.out.println("Poruka "+p+" ne postoji!");

    }

    //Ispisuje poruku p i ibrese je iz poruka, ako ona postoji (gledano u odnosu na id)
    public void send(Poruka p){
        //TODO: Implement me,
        boolean postoji = false;
        for (Poruka poruka :
                poruke) {
            if (poruka.getId() == p.getId()) {
                postoji = true;
                break;
            }
        }
        if (postoji){
            System.out.println(p);
            poruke.remove(p);
        }
        else
            System.out.println("Poruka "+p+" ne postoji!");

    }

    //Menja tekst poruke
    public void change(Poruka p, String msg){
        //TODO: Implement me
        for (Poruka poruka :
                poruke) {
            if (poruka.getId() == p.getId()) {
                poruka.setPoruka(msg);
                return;
            }
        }
        System.out.println("Poruka "+p+" ne postoji!");
    }

    // Vraca sumu poruke p ako ta poruka postoji u listi
    public int isplata(Poruka p){
        //TODO: Implement me
        for (Poruka poruka :
                poruke) {
            if (poruka.getId() == p.getId()) {
                return poruka.getSuma();
            }
        }
        return 0;
    }


    // U konzoli ispisuje, ako je suma nenegativna:
    // {posiljalac} salje {suma} para {primalac}-u, uz poruku:
    // {poruka}
    // a ako je suma negativna:
    // {posiljalac} primac {suma} para od {primalac}-a, uz poruku:
    // {poruka}
    // za svaki element iz liste!
    @Override
    public String toString() {
        String s = "";

        for (Poruka poruka :
                poruke) {
            if (poruka.getSuma()>0){
                s += poruka.getPosiljalac()+" salje "+poruka.getSuma()+" para "+poruka.getPrimalac()+"-u, uz poruku: "+poruka.getPoruka()+"\n";
            }else{
                s += poruka.getPosiljalac()+" prima "+poruka.getSuma()+" para "+poruka.getPrimalac()+"-a, uz poruku: "+poruka.getPoruka()+"\n";
            }

        }
        return s;
    }
}