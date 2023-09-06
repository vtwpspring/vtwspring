package api.vtwspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 30)
public class VtwspringApplication {

    public static void main(String[] args) {
        SpringApplication.run(VtwspringApplication.class, args);
    }

}
