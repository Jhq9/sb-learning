package may.i.jhq;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class SbAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbAdminServerApplication.class, args);
	}
}
