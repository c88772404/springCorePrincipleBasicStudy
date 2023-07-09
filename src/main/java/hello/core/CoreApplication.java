package hello.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoreApplication {
    public CoreApplication() {
        //branch test
    }

    public static void main(String[] args) {
        SpringApplication.run(CoreApplication.class, args);
    }
}
