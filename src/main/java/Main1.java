import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Alex", 35));
        users.add(new User("Max", 22));
        users.add(new User("John", 17));
        users.add(new User("Andrew", 33));
        users.add(new User("Jack", 44));
        users.add(new User("Nick", 80));
        users.add(new User("Alice", 46));
        users.add(new User("Helen", 11));

        int[] array = {3,1,3,5,14};
        Arrays.stream(array);

        users.stream()
                .filter((user -> user.getName().contains("l")))
                .findAny()
                .ifPresentOrElse(System.out::println, () -> System.out.println("User not found"));

    }
}
