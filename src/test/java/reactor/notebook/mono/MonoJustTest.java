package reactor.notebook.mono;

import org.junit.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

public class MonoJustTest {

  @Test
  public void createIntegerMono() {

    final int number = 3;

    final Mono<Integer> integerMono = new MonoJust<Integer>().createMono(number);

    StepVerifier.create(integerMono).expectNext(number).verifyComplete();
  }

  @Test
  public void createStringMono() {

    final String name = "reactor-notebook";

    final Mono<String> stringMono = new MonoJust<String>().createMono(name);

    StepVerifier.create(stringMono).expectNext(name).verifyComplete();
  }
}