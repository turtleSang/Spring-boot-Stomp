package WebSocket.Stomp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin("*")
public class StompApplication {

	public static void main(String[] args) {
		SpringApplication.run(StompApplication.class, args);
	}

}
