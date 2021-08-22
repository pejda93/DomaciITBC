package prvi;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        Poruka p1 = new Poruka("Vidimo se!", "Cvijan", "Strahinja", 8000, 1);
        Poruka p2 = new Poruka("Hvala!", "Strahinja", "Cvijan", 0, 2);
        ArrayList<Poruka> p = new ArrayList<>();
        p.add(p1); p.add(p2);
        Posta posta = new Posta(p);
        System.out.println("--------1");
        System.out.println(posta);
        System.out.println("--------2");
        posta.add(new Poruka("Gotovo.", "Mafijas1", "Mafijas2", 100000, 3));
        System.out.println("--------3");
        System.out.println(posta);
        System.out.println("--------4");
        posta.remove(p1);
        System.out.println("--------5");
        System.out.println(posta);
        System.out.println("--------6");
        posta.change(posta.get(0), "qwert");
        System.out.println("--------7");
        System.out.println(posta);
        System.out.println("--------8");
        posta.send(posta.get(0));
        System.out.println("--------9");
        System.out.println(posta);
        System.out.println("--------10");
        System.out.println("--------11");
        System.out.println(posta.isplata(posta.get(0)));
        System.out.println("--------12");
    }
}