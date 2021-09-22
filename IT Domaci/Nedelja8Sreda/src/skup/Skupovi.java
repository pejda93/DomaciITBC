package skup;

import java.util.Set;
import java.util.TreeSet;

public class Skupovi {

    public static void main(String[] args) {
        TreeSet<Integer> skup = new TreeSet<>();// {}
        skup.add(2); // {2}
        skup.add(2); // {2}
        skup.add(1); // {1, 2}
        skup.add(2); // {1, 2}

        skup.remove(2); // {1}
        skup.add(2); // {1, 2}

        boolean b = skup.isEmpty(); // skup == {}

        boolean b1 = skup.contains(1); // {1} true
        boolean b2 = skup.contains(3); // flase

        skup.clear(); // skup = {}

        int i = skup.size(); // kardinalnost skup <=> broj elemenata skup


    }
}
