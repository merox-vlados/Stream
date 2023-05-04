import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainHW {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 1000; i++) {
            numbers.add((int)(Math.random() * 100 + 100));
        }
        List<String> list =  numbers.stream()
                .filter((n) -> n % 2 == 0 && n % 5 == 0)
                .map((n) -> Math.sqrt(n))
                .map((n) -> "Корень: " + n)
                .collect(Collectors.toList());

        for(String s : list) {
            System.out.println(s);
        }
    }
}
