package reactor.notebook.mono;

import reactor.core.publisher.Mono;

public class MonoJust<T> {

  public MonoJust() {

    super();
  }

  public Mono<T> createMono(final T element) {

    return Mono.just(element);
  }
}
