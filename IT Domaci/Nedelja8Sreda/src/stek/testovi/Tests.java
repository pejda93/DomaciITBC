package stek.testovi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import stek.zadaci.Zadaci;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    /*
     * Placinke
     * */
    @Test
    void PalacinkeTest1(){
        assertEquals(
                "Sunka\n" +
                        "Nutela",
                Zadaci.palacinke(
                        "Nutela\n" +
                                "Sunka\n" +
                                "Nutela\n" +
                                "Dzem", 2)
        );
    }

    @Test
    void PalacinkeTest2(){
        assertEquals(":(", Zadaci.palacinke("Nutela\n" + "Nutela\n", 6));
    }

    @Test
    void PlacinkeRandomTest(){
        assertEquals("Keks\n" + "Keks\n" + "Dzem\n" + "Keks\n" + "Nutela\n" + "Keks\n" + "Nutela", Zadaci.palacinke("Nutela\n" + "Keks\n" + "Nutela\n" + "Keks\n" + "Dzem\n" + "Keks\n" + "Keks\n" + "Nutela\n" + "Dzem\n" + "Nutela", 3));
        assertEquals("Nutela", Zadaci.palacinke("Nutela\n" + "Keks\n" + "Nutela\n" + "Keks", 3));
        assertEquals("Nutela", Zadaci.palacinke("Nutela\n" + "Dzem", 1));
        assertEquals("Dzem\n" + "Keks", Zadaci.palacinke("Keks\n" + "Dzem\n" + "Nutela\n" + "Dzem\n" + "Keks\n" + "Keks\n" + "Nutela\n" + "Nutela", 6));
        assertEquals("Keks", Zadaci.palacinke("Keks", 0));
        assertEquals("Dzem\n" + "Dzem\n" + "Keks\n" + "Dzem\n" + "Keks\n" + "Nutela\n" + "Nutela\n" + "Nutela\n" + "Dzem", Zadaci.palacinke("Dzem\n" + "Nutela\n" + "Nutela\n" + "Nutela\n" + "Keks\n" + "Dzem\n" + "Keks\n" + "Dzem\n" + "Dzem\n" + "Nutela", 1));
        assertEquals("Nutela", Zadaci.palacinke("\n" + "Nutela\n" + "Keks\n" + "Nutela\n" + "Dzem\n" + "Keks", 4));
        assertEquals("Nutela", Zadaci.palacinke("Nutela", 0));
        assertEquals("Nutela", Zadaci.palacinke("Nutela", 0));
        assertEquals("Keks", Zadaci.palacinke("Keks", 0));

    }


    /*
    * Web istorija
    * */
    @Test
    void WebTest1() {
        Assertions.assertEquals( // []
                                // trenutni sajt: -
                "http://www.google.com\n" +
                        "http://www.rts.rs\n" +
                        "http://www.google.com\n" +
                        "http://www.petlja.org\n" +
                        "http://www.matf.bg.ac.rs\n" +
                        "http://www.petlja.org\n" +
                        "http://www.google.com\n" +
                        "-\n" +
                        "-",
                Zadaci.history(
                        "http://www.google.com\n" +
                                "http://www.rts.rs\n" +
                                "back\n" +
                                "http://www.petlja.org\n" +
                                "http://www.matf.bg.ac.rs\n" +
                                "back\n" +
                                "back\n" +
                                "back\n" +
                                "back")
        );
    }

    @Test
    void WebTest2(){
        assertEquals(
                "http://www.google.rs\n" +
                        "http://www.itbootcamp.rs\n" +
                        "http://www.nyaa.si\n" +
                        "http://www.itbootcamp.rs\n" +
                        "http://www.9anime.to\n" +
                        "http://www.itbootcamp.rs\n" +
                        "http://www.google.rs",
                Zadaci.history(
                        "http://www.google.rs\n" +
                                "http://www.itbootcamp.rs\n" +
                                "http://www.nyaa.si\n" +
                                "back\n" +
                                "http://www.9anime.to\n" +
                                "back\n" +
                                "back\n"
                )
        );
    }


    /*
    * Uparenost zagrada
    * */
    @Test
    void UparenostTest1() {
        assertEquals(true, Zadaci.uparenost("[3*(2+4)]*5"));
    }

    @Test
    void UparenostTest2(){
        assertEquals(false, Zadaci.uparenost("{3*(2+4)}*[5+7)+(4*5)"));
    }

    @Test
    void UparenostTest3(){
        assertEquals(true, Zadaci.uparenost("(3(1(2({5}))[5[]5]))"));
    }

    @Test
    void UparenostTest4(){
        assertEquals(false, Zadaci.uparenost("(((({}121))[[333]]}))"));
    }


    /*
     * Uzastopni brojevi
     * */
    @Test
    void UzastopniTest1() {
        assertEquals("1 3 3 2 1", Zadaci.uzastopni(new int[]{1, 1, 2, 2, 2, 2, 1, 3, 4, 4, 5, 5, 4, 4, 3, 2, 1, 1, 1}));
    }

    @Test
    void UzastopniTest2() {
        assertEquals("1 2", Zadaci.uzastopni(new int[]{1, 2}));
    }

    @Test
    void UzastopniRandomTests(){
        assertEquals("7 8 5", Zadaci.uzastopni(new int[]{7, 8, 5}));
        assertEquals("9 8 1 6 8 6 10 3 9 9 1 5 1", Zadaci.uzastopni(new int[]{9, 8, 1, 6, 8, 6, 10, 3, 9, 1, 1, 9, 1, 5, 1}));
        assertEquals("10 9 4 5", Zadaci.uzastopni(new int[]{10, 9, 4, 5}));
        assertEquals("6 8 9 5 2 6 5 6 8 1 10 4 3 1 7 2", Zadaci.uzastopni(new int[]{6, 8, 9, 5, 2, 6, 5, 6, 8, 1, 10, 4, 3, 1, 7, 2}));
        assertEquals("4 2 3 10 8 10 8 6 10 1 3 10 5 1 8 4 10 6", Zadaci.uzastopni(new int[]{4, 2, 3, 10, 8, 10, 8, 6, 10, 1, 3, 6, 6, 10, 5, 1, 8, 4, 10, 6}));
        assertEquals("2 9 10 5 9 5 6", Zadaci.uzastopni(new int[]{2, 9, 10, 5, 3, 3, 9, 5, 2, 2, 6}));
        assertEquals("8 5 7 10 7 2 1 7 1 10 5 6 7 5 9 7", Zadaci.uzastopni(new int[]{8, 5, 7, 10, 7, 2, 1, 7, 1, 10, 5, 6, 7, 5, 9, 7}));
        assertEquals("8 7 3 4 7 10 8 7 8 3 10 1 5 7", Zadaci.uzastopni(new int[]{8, 7, 3, 4, 7, 5, 5, 10, 8, 7, 8, 3, 10, 8, 8, 1, 5, 7}));
        assertEquals("2 6 2", Zadaci.uzastopni(new int[]{2, 6, 2}));
        assertEquals("3 1 4 5 8 9 1 6 1 5 2 3", Zadaci.uzastopni(new int[]{3, 1, 3, 3, 4, 5, 8, 9, 1, 6, 1, 5, 2, 3}));
    }


    /*
     * Linijski editor
     * */
    @Test
    void LinijskiTest1(){
        assertEquals("cb", Zadaci.console("iaib<bic>>"));
    }

    @Test
    void LinijskiTest2(){
        assertEquals("!bravo", Zadaci.console("izidiriaivio<<<<<dbib<<<i!>>>>>"));
    }

    @Test
    void LinijskiRandomTests(){
        assertEquals("Du", Zadaci.console("ddiD<>dddiud"));
        assertEquals("", Zadaci.console("><>"));
        assertEquals("S]", Zadaci.console("b<dddiSi]>"));
        assertEquals("", Zadaci.console("iqdbb<<<>"));
        assertEquals("", Zadaci.console("<>"));
        assertEquals("t", Zadaci.console("biEbit>d"));
        assertEquals("yS", Zadaci.console(">b>iS>iy<<"));
        assertEquals("", Zadaci.console("<imbbi]db"));
        assertEquals("lr", Zadaci.console("dbiL<dilird"));
        assertEquals("", Zadaci.console("dbdb"));
    }

    @Test
    void LinijskiRandomTests2(){
        assertEquals("gKrUvn", Zadaci.console("igiKiriUiZb>iv>in"));
        assertEquals("PdtfcME", Zadaci.console("iPd>iditdificiMiE"));
        assertEquals("R", Zadaci.console("<iR<"));
        assertEquals("", Zadaci.console("b"));
        assertEquals("`dv", Zadaci.console(">>i`idiv"));
        assertEquals("mHe", Zadaci.console("ddimiHie"));
        assertEquals("HsGgt", Zadaci.console("isiGiH<igit"));
        assertEquals("Ww", Zadaci.console("biWiw"));
        assertEquals("awGW", Zadaci.console("iaiwiGiHb>iW"));
        assertEquals("tNc", Zadaci.console("it>iNic"));
    }


    /*
    * Vrednost izraza
    * */
    @Test
    void IzrazTest1(){
        assertEquals(9, Zadaci.eval("12+3*"));
    }

    @Test
    void IzrazTest2(){
        assertEquals(31, Zadaci.eval("11+2*345+*+"));
    }

    @Test
    void IzrazTest3(){
        assertEquals(7, Zadaci.eval("23*7*111111+++++/"));
        assertEquals(8, Zadaci.eval("22+2*"));
        assertEquals(6, Zadaci.eval("222*+"));
        assertEquals(0, Zadaci.eval("012+3+4+5+6+7+8+9+*"));
    }


    /*
    * Hartije
    * */
    @Test
    void HartijeTest1(){
        assertEquals(new int[]{1, 1, 1, 2, 1, 4, 6}, Zadaci.hartije(100, 80, 60, 70, 60, 75, 85));
    }

    @Test
    void HartijeTest2(){
        assertEquals(new int[]{1, 2, 3, 4}, Zadaci.hartije(10, 11, 20, 22));
    }

    @Test
    void HartijeTest3(){
        assertEquals(null, Zadaci.hartije());
    }

    @Test
    void HartijeRandomTest(){
        assertEquals(new int[]{1, 1, 3, 1, 1, 1, 4, 8}, Zadaci.hartije(93, 26, 97, 79, 54, 51, 86, 97));
        assertEquals(new int[]{1, 2, 1}, Zadaci.hartije(25, 64, 7));
        assertEquals(new int[]{1, 1, 2, 4, 1, 6, 5, 2, 1, 3}, Zadaci.hartije(71, 61, 64, 87, 59, 93, 91, 66, 23, 74));
        assertEquals(new int[]{1}, Zadaci.hartije(80));
        assertEquals(new int[]{1, 2, 1, 1, 1, 4}, Zadaci.hartije(97, 98, 58, 51, 2, 86));
        assertEquals(new int[]{1, 2, 3, 2, 1}, Zadaci.hartije(17, 61, 91, 67, 40));
        assertEquals(new int[]{1, 1, 3, 1, 5}, Zadaci.hartije(57, 24, 66, 31, 93));
        assertEquals(new int[]{1, 2, 1, 2, 1}, Zadaci.hartije(13, 83, 63, 70, 37));
        assertEquals(new int[]{1}, Zadaci.hartije(61));
        assertEquals(new int[]{1, 2, 1, 1, 5, 6, 2}, Zadaci.hartije(14, 93, 39, 1, 95, 100, 39));
    }

}
