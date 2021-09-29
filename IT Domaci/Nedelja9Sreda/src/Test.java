import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        List<Integer> list1 = list.stream().filter(x -> x % 3 == 0).map(x -> x + 2).collect(Collectors.toList());

        List<Integer> list2 = list.stream().map(x -> x * 2).filter(x -> x % 3 != 0).collect(Collectors.toList());

        List<Integer> arr = Arrays.asList(1, 2, 3, 3, 4, 2, 5, 6, 9, 10, 12, 7, 5);
        HashSet<Integer> set3 = arr.stream().filter(x -> x % 2 == 0).map(x -> x * 2).collect(Collectors.toCollection(HashSet::new));

        System.out.println(set3);



    }
}
