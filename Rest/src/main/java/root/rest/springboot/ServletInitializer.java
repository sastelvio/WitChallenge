package root.rest.springboot;

import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 *
 * @author Sastelvio Serafim Manuel
 */
public class ServletInitializer {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RestApplication.class);
	}

}
