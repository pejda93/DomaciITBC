package skup.testovi;

import org.junit.jupiter.api.Test;
import skup.zadaci.Zadaci;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    ArrayList<Integer> s1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    ArrayList<Integer> s2 = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
    ArrayList<Integer> s3 = null;
    ArrayList<Integer> s4 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));

    /*
     * Zajednicki elementi
     * */
    @Test
    void IntersectionTest1(){
        assertEquals(new ArrayList<>(Arrays.asList(2, 4)), Zadaci.intersection(s1, s2));
    }

    @Test
    void IntersectionTest2(){
        assertEquals(null, Zadaci.intersection(s2, s3));
    }

    @Test
    void IntersectionTest3(){
        assertEquals(null, Zadaci.intersection(s1, s4));
    }

    @Test
    void IntersectionTest4(){
        assertEquals(new ArrayList<>(Arrays.asList(6, 8, 10)), Zadaci.intersection(s2, s4));
    }

    /*
     * Svi elementi
     * */
    @Test
    void UnionTest1(){
        assertEquals(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 8, 10)), Zadaci.union(s1, s2));
    }

    @Test
    void UnionTest2(){
        assertEquals(new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10)), Zadaci.union(s2, s3));
    }

    @Test
    void UnionTest3(){
        assertEquals(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)), Zadaci.union(s1, s4));
    }

    @Test
    void UnionTest4(){
        assertEquals(new ArrayList<>(Arrays.asList(2, 4, 6, 7, 8, 9, 10)), Zadaci.union(s2, s4));
    }

    @Test
    void UnionTest5(){
        assertEquals(null, Zadaci.union(s3, s3));
    }


    /*
     * Razlika
     * */
    @Test
    void RazlikaTest1(){
        assertEquals(new ArrayList<>(Arrays.asList(1, 3, 5)), Zadaci.razlika(s1, s2));
    }

    @Test
    void RazlikaTest2(){
        assertEquals(new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10)), Zadaci.razlika(s2, s3));
    }

    @Test
    void RazlikaTest3(){
        assertEquals(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)), Zadaci.razlika(s1, s4));
    }

    @Test
    void RazlikaTest4(){
        assertEquals(new ArrayList<>(Arrays.asList(2, 4)), Zadaci.razlika(s2, s4));
    }

    @Test
    void RazlikaTest5(){
        assertEquals(null, Zadaci.razlika(s1, s1));
    }


    /*
    * Duplikati
    * */
    @Test
    void DuplikatiTest1(){
        assertEquals(3, Zadaci.ponavljanjeBroj(new int[]{1, 2, 3, 4, 4, 2, 3, 5, 6}));
    }

    @Test
    void DuplikatiTest2(){
        assertEquals(0, Zadaci.ponavljanjeBroj(new int[]{1, 2, 3}));
    }

    @Test
    void DuplikatiTest3(){
        assertEquals(4, Zadaci.ponavljanjeBroj(new int[]{5, 5, 5, 5, 5, 6}));
    }

    @Test
    void DuplikatiRandomTests(){
        assertEquals(2, Zadaci.ponavljanjeBroj(new int[]{9, 6, 3, 8, 6, 10, 5, 10, 4}));
        assertEquals(2, Zadaci.ponavljanjeBroj(new int[]{8, 6, 10, 3, 5, 7, 2, 1, 3, 3, 4}));
        assertEquals(7, Zadaci.ponavljanjeBroj(new int[]{10, 8, 3, 9, 8, 5, 8, 1, 10, 9, 4, 1, 3, 3}));
        assertEquals(2, Zadaci.ponavljanjeBroj(new int[]{1, 10, 3, 5, 8, 8, 6, 1}));
        assertEquals(2, Zadaci.ponavljanjeBroj(new int[]{10, 2, 2, 10, 7, 5, 1}));
        assertEquals(8, Zadaci.ponavljanjeBroj(new int[]{9, 1, 2, 5, 10, 6, 9, 7, 7, 3, 6, 5, 10, 3, 1, 1}));
        assertEquals(1, Zadaci.ponavljanjeBroj(new int[]{3, 5, 7, 2, 6, 7}));
        assertEquals(4, Zadaci.ponavljanjeBroj(new int[]{5, 4, 6, 9, 6, 9, 7, 3, 9, 6}));
        assertEquals(9, Zadaci.ponavljanjeBroj(new int[]{9, 3, 4, 1, 8, 4, 10, 6, 5, 5, 7, 1, 8, 6, 8, 10, 8, 2, 10}));
        assertEquals(0, Zadaci.ponavljanjeBroj(new int[]{4, 10, 5, 3, 2}));
        assertEquals(1, Zadaci.ponavljanjeBroj(new int[]{7, 8, 10, 8, 4, 6}));
        assertEquals(6, Zadaci.ponavljanjeBroj(new int[]{8, 1, 7, 9, 8, 9, 8, 10, 6, 2, 6, 3, 7, 8}));
        assertEquals(2, Zadaci.ponavljanjeBroj(new int[]{6, 7, 3, 8, 3, 8}));
        assertEquals(10, Zadaci.ponavljanjeBroj(new int[]{8, 5, 1, 4, 2, 6, 10, 3, 9, 1, 4, 8, 7, 5, 4, 4, 2, 8, 1, 2}));
        assertEquals(4, Zadaci.ponavljanjeBroj(new int[]{2, 9, 5, 5, 1, 6, 1, 6, 3, 7, 7, 10}));
        assertEquals(0, Zadaci.ponavljanjeBroj(new int[]{9}));
        assertEquals(4, Zadaci.ponavljanjeBroj(new int[]{5, 8, 3, 8, 8, 3, 9, 6, 2, 3}));
        assertEquals(3, Zadaci.ponavljanjeBroj(new int[]{4, 2, 7, 2, 8, 5, 5, 5}));
        assertEquals(2, Zadaci.ponavljanjeBroj(new int[]{1, 1, 1, 9}));
        assertEquals(1, Zadaci.ponavljanjeBroj(new int[]{9, 4, 6, 6, 1}));
        assertEquals(10, Zadaci.ponavljanjeBroj(new int[]{4, 7, 6, 5, 5, 6, 4, 7, 7, 6, 10, 10, 10, 1, 2, 5, 3, 7}));
        assertEquals(5, Zadaci.ponavljanjeBroj(new int[]{10, 4, 3, 3, 5, 3, 2, 9, 7, 1, 8, 1, 5, 9}));
        assertEquals(9, Zadaci.ponavljanjeBroj(new int[]{1, 3, 5, 9, 10, 1, 8, 6, 7, 7, 7, 3, 3, 2, 1, 1, 4, 6, 1}));
        assertEquals(1, Zadaci.ponavljanjeBroj(new int[]{10, 4, 9, 4}));
        assertEquals(9, Zadaci.ponavljanjeBroj(new int[]{8, 9, 8, 9, 4, 2, 3, 7, 5, 8, 2, 9, 7, 5, 2, 7, 6}));
        assertEquals(11, Zadaci.ponavljanjeBroj(new int[]{9, 2, 10, 2, 8, 6, 10, 5, 5, 5, 7, 5, 7, 5, 9, 5, 5, 8}));
        assertEquals(7, Zadaci.ponavljanjeBroj(new int[]{9, 9, 2, 6, 9, 4, 6, 6, 1, 9, 6, 3, 3}));
        assertEquals(8, Zadaci.ponavljanjeBroj(new int[]{8, 3, 8, 10, 10, 5, 2, 4, 8, 6, 5, 6, 5, 1, 8, 7, 8}));
        assertEquals(13, Zadaci.ponavljanjeBroj(new int[]{6, 6, 5, 3, 8, 4, 4, 3, 9, 6, 4, 8, 7, 7, 4, 3, 9, 3, 9, 7}));
        assertEquals(0, Zadaci.ponavljanjeBroj(new int[]{6, 1, 3, 7}));
        assertEquals(0, Zadaci.ponavljanjeBroj(new int[]{7}));
        assertEquals(3, Zadaci.ponavljanjeBroj(new int[]{9, 7, 7, 10, 7, 1, 10}));
        assertEquals(5, Zadaci.ponavljanjeBroj(new int[]{1, 9, 10, 2, 3, 8, 9, 5, 2, 5, 1, 1}));
        assertEquals(10, Zadaci.ponavljanjeBroj(new int[]{10, 8, 7, 10, 9, 4, 5, 8, 7, 7, 10, 5, 3, 10, 5, 7, 9}));
        assertEquals(2, Zadaci.ponavljanjeBroj(new int[]{2, 3, 3, 8, 5, 10, 2, 4, 7}));
        assertEquals(9, Zadaci.ponavljanjeBroj(new int[]{5, 3, 1, 4, 5, 4, 1, 4, 8, 1, 9, 3, 10, 6, 5, 8, 1}));
        assertEquals(4, Zadaci.ponavljanjeBroj(new int[]{6, 6, 7, 1, 5, 1, 1, 10, 7}));
        assertEquals(4, Zadaci.ponavljanjeBroj(new int[]{5, 10, 8, 8, 2, 4, 9, 6, 2, 4, 4, 1}));
        assertEquals(1, Zadaci.ponavljanjeBroj(new int[]{1, 4, 10, 9, 2, 3, 10, 5}));
        assertEquals(8, Zadaci.ponavljanjeBroj(new int[]{4, 10, 4, 5, 7, 8, 8, 5, 3, 8, 7, 7, 4, 6, 7}));
        assertEquals(1, Zadaci.ponavljanjeBroj(new int[]{8, 5, 2, 10, 5, 4, 6, 7}));
        assertEquals(2, Zadaci.ponavljanjeBroj(new int[]{8, 2, 10, 8, 3, 6, 3}));
        assertEquals(2, Zadaci.ponavljanjeBroj(new int[]{3, 9, 6, 3, 2, 1, 9}));
        assertEquals(10, Zadaci.ponavljanjeBroj(new int[]{5, 4, 2, 7, 6, 2, 7, 9, 3, 2, 8, 1, 10, 10, 2, 2, 10, 10, 8, 5}));
        assertEquals(2, Zadaci.ponavljanjeBroj(new int[]{9, 1, 8, 10, 3, 10, 9, 5}));
        assertEquals(5, Zadaci.ponavljanjeBroj(new int[]{4, 6, 2, 2, 6, 9, 4, 8, 8, 2, 5}));
        assertEquals(11, Zadaci.ponavljanjeBroj(new int[]{3, 3, 10, 4, 3, 5, 9, 5, 10, 1, 1, 4, 9, 6, 2, 4, 1, 9, 6, 8}));
        assertEquals(2, Zadaci.ponavljanjeBroj(new int[]{4, 5, 7, 2, 10, 6, 8, 5, 9, 1, 5}));
        assertEquals(1, Zadaci.ponavljanjeBroj(new int[]{9, 5, 4, 5}));
        assertEquals(2, Zadaci.ponavljanjeBroj(new int[]{1, 9, 4, 3, 4, 8, 10, 9}));
    }

    /*
    * Provera permutacije
    * */
    @Test
    void PermutacijeTest1(){
        assertEquals(true, Zadaci.permutacija(new ArrayList<>(Arrays.asList(1, 2, 221, 101)), new ArrayList<>(Arrays.asList(101, 2, 221, 1))));
    }

    @Test
    void PermutacijeTest2(){
        assertEquals(false, Zadaci.permutacija(new ArrayList<>(Arrays.asList(1, 2, 3, 4)), new ArrayList<>(Arrays.asList(1, 3, 2))));
    }

    @Test
    void PermutacijeTest3(){
        assertEquals(false, Zadaci.permutacija(new ArrayList<>(Arrays.asList(1, 2, 4)), new ArrayList<>(Arrays.asList(1, 3, 2))));
    }


    /*
    * Neuparen
    * */
    @Test
    void NeuparenTest1(){
        assertEquals(2, Zadaci.neuparen(new int[]{1, 1, 2, 3, 3, 4, 4}));
    }

    @Test
    void NeuparenTest2(){
        assertEquals(5, Zadaci.neuparen(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1}));
    }


    /*
    * Anagram
    * */
    @Test
    void AnagramTest1(){
        assertEquals(true, Zadaci.anagram("panta redovno zakasni", "neopravdan izostanak"));
    }

    @Test
    void AnagramTest2(){
        assertEquals(true, Zadaci.anagram("zamalo", "mazalo"));
    }

    @Test
    void AnagramTest3(){
        assertEquals(false, Zadaci.anagram("nije", "anagram"));
    }

    @Test
    void AnagramTest4(){
        assertEquals(false,  Zadaci.anagram("zamalO", "mazalo"));
    }

}
