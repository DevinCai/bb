import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 * @author ssj
 *
 */
@SpringBootApplication(scanBasePackages="com")
@EnableScheduling
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);

	}
	@Bean
	RestTemplate restTemplate(){
		HttpComponentsClientHttpRequestFactory httpRequestFactory = new HttpComponentsClientHttpRequestFactory();
		httpRequestFactory.setConnectionRequestTimeout(30000);
		httpRequestFactory.setConnectTimeout(30000);
		httpRequestFactory.setReadTimeout(30000);
		return new RestTemplate(httpRequestFactory);
	}


}
