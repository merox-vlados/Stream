public class MainWorker {
    public static void main(String[] args) {
        Director director = new Director();
        Worker worker = (n) -> {
            for(int i = 0; i < n; i++) {
                System.out.println("Working...");
            }
            return "Success";
        };

        String result = director.force((worker),5);
        System.out.println(result);
    }
}
