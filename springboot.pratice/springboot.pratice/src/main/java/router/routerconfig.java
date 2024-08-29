package router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class routerconfig {
	@Bean
	public RouterFunction<ServerResponse> routerFunction() {
		return route(GET("/route"),
				request -> ServerResponse.ok().bodyValue("This is Router Function"));
	}
}
