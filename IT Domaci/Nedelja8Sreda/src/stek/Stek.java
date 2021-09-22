package stek;

import java.util.Scanner;
import java.util.Stack;

public class Stek {

    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        //Ubacivanje
        stack.push(1); //[1]
        stack.push(2); //[1, 2]


        //Izbacivanje
        int i = stack.pop(); //i = 2 [1] brisanje & cuvanje
        stack.pop(); // brisanje
        // []


        stack.push(1);
        stack.push(2);

        //isEmpty
        boolean b = stack.isEmpty();

        int x = stack.peek(); // x = 5 [1, 2, 3, 4, 5]

    }

}
