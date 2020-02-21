package reactor.notebook.flux;

import reactor.core.publisher.Flux;

public class FluxJust<T> {

  public FluxJust() {

    super();
  }

  public Flux<T> create(final T... elements) {

    return Flux.just(elements);
  }
}
