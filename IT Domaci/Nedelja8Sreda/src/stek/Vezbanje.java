package stek;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Vezbanje {
    /*
     * 1. Linije u obrnutom redosledu
     * Напиши програм који исписује све линије које се учитају са стандардног улаза
     * у обратном редоследу од редоследа учитавања.
     * Улаз: Са стандардног улаза се учитавају линије текста, све до краја улаза. (ctrl+d)
     * Излаз: На стандардни излаз исписати учитане линије у обратном редоследу.
     * */
    public static void obrnuto(Scanner sc){
        Stack<String> stack = new Stack<>();
        while(sc.hasNextLine())
            stack.push(sc.nextLine());
        System.out.println("---------");
        while(!stack.isEmpty())
            System.out.println(stack.pop());
    }

    /*
    * 2. Uparenost zagrada
    * Napisi program koji proverava da li su zagrade dobro uparene.
    *
    * ()()() -> jesu
    * (((([{}()])))) -> jesu
    * ((( -> nisu
    * ) -> nisu
    * ()(() -> nisu
    * */

    /*
    * stack = []
    * (([{}]))
    * */
    public static boolean uparene(String s){
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char trenutni = chars[i];
            if (trenutni == '(' || trenutni == '[' || trenutni == '{'){
                stack.push(trenutni);
            }
            else{
                if(stack.isEmpty())
                    return false;
                else{
                    char otvorena = stack.pop();
                    switch (trenutni){
                        case ')':
                            if (otvorena != '(')
                                return false;
                            break;
                        case ']':
                            if (otvorena != '[')
                                return false;
                            break;
                        default: //'}'
                            if (otvorena != '{')
                                return false;
                            break;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        //obrnuto(sc);
        System.out.println(uparene("()()()"));
        //System.out.println(uparene("(((([{}()]))))"));
        //System.out.println(uparene("((("));
        //System.out.println(uparene(")"));
        //System.out.println(uparene("()(()"));
    }
}
