public class Zadatak {


    public static boolean Palindrom(String broj){
        char[] niz = broj.toCharArray();

        for (int i = 0; i < niz.length; i++) {
            if(niz[i]!=niz[niz.length-1-i]){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String broj = "1134311";

        System.out.println(Palindrom(broj));



    }
}
