import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
    public static void main(String[] args) {
        log.info("In funtional interface app");
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 started");
            }
        });
    }
}
