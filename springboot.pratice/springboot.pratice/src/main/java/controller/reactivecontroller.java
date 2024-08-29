package controller;
import javax.management.RuntimeErrorException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController

public class reactivecontroller {

	@GetMapping("/mono")

	public Mono<String> getMono() {

		return Mono.just("This is Mono");
	}

	@GetMapping("/flux")

	public Flux<String> getFlux() {

		return Flux.just("This", "is", "Flux");

	}

	@GetMapping("/error lux")

	public Flux<String> getFluxError() {
		return Flux.just("This", "is", "Flux")
				.concatWith(Flux.error(new RuntimeException("This is error")))
				.onErrorReturn("Error cleared");

	}
}
