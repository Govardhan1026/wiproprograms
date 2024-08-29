import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Address address() {
		return new Address("123 Main St", "Springfield");
	}

	@Bean
	public Library library(Address address) {
		return new Library(address);
	}
}
