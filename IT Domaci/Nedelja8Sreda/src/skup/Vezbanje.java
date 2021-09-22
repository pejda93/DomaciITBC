package skup;

import java.util.*;

public class Vezbanje {

    /*
    * 1. Svake srede i nedelje, Strahinji se javljaju polaznici da su okacili domaci.
    * Jedini problem, cesto se jedna osoba javi vise puta.
    * Napisati funkciju koji za unetu listu imena ispisuje istu, bez ponavljanja
    *
    * ["Marko", "Slobodan", "Slobodan", "Aleksandar", "Milena", "Miljana", "Milena"]
    * -> ["Marko", "Slobodan", "Aleksandar", "Milena", "Miljana"]
    * */

    public static ArrayList<String> bezPonavljanja(ArrayList<String> imena){
        TreeSet<String> skup = new TreeSet<>(imena);
        return new ArrayList<>(skup);
    }

    /*
    * 2. Napraviti funkciju koja ispisuje niz, brisuci sve njegove duplikate, u rastucem poretku.
    *
    * [1, 2, 3, 4, 4, 2, 3, 5, 6] -> 1 2 3 4 5 6
    *
    * */

    public static void ispis(int[] arr){
        TreeSet<Integer> skup = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            skup.add(arr[i]);
        }
        for(Integer i : skup){
            System.out.print(i + " ");
        }
    }


    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> test = new ArrayList<>(Arrays.asList("Marko", "Slobodan", "Slobodan", "Aleksandar", "Milena", "Miljana", "Milena"));
        //ArrayList<String> res = bezPonavljanja(test);
        //System.out.println(res);
        int[] arr = new int[]{6, 1, 4, 2, 3, 5, 4, 2, 3,};
        ispis(arr);
    }
}
