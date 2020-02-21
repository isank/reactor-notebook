package reactor.notebook.flux;

import org.junit.Test;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

public class FluxJustTest {

  @Test
  public void createIntegerFluxTest() {

    final Integer[] elements = { 1, 2, 3 };

    final Flux<Integer> integerFlux = new FluxJust<Integer>().create(elements);

    StepVerifier.create(integerFlux).expectNext(elements).verifyComplete();
    StepVerifier.create(integerFlux).expectNextCount(elements.length).verifyComplete();
  }

  @Test
  public void createStringFluxTest() {

    final String[] elements = { "John", "Doe" };

    final Flux<String> stringFlux = new FluxJust<String>().create(elements);

    StepVerifier.create(stringFlux).expectNext(elements).verifyComplete();
    StepVerifier.create(stringFlux).expectNextCount(elements.length).verifyComplete();
  }

  @Test
  public void createEmptyFluxTest() {

    final Flux<Integer> integerFlux = new FluxJust<Integer>().create();

    StepVerifier.create(integerFlux).verifyComplete();
    StepVerifier.create(integerFlux).expectNextCount(0).verifyComplete();
  }
}
