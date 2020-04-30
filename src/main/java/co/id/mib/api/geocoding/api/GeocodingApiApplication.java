package co.id.mib.api.geocoding.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = "file:./config/application.properties")
public class GeocodingApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeocodingApiApplication.class, args);
	}

}
