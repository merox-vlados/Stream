import java.util.ArrayList;
import java.util.List;

public class Filter {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            numbers.add((int)(Math.random() * 1000));
        }
        List<Integer> filtered = filter(numbers, (n) -> n > 0);
        for(int i : filtered) {
            System.out.println(i);
        }
    }

    private static List<Integer> filter(List<Integer> list, MyPredicate myPredicate) {
        List<Integer> result = new ArrayList<>();
        for(int i : list) {
            if(myPredicate.test(i)) {
                result.add(i);
            }
        }
        return result;
    }
}
