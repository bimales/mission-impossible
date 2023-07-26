import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        Stream.of(str).forEach(System.out::println);
    }
}
