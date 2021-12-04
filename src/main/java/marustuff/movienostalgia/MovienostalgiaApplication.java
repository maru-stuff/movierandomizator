package marustuff.movienostalgia;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovienostalgiaApplication {
    private static final Logger log = LoggerFactory.getLogger(MovienostalgiaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MovienostalgiaApplication.class, args);
    }


}
