package lombok.examples.Builder;

import lombok.Builder;
import lombok.Value;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BuilderTests {
  @Value
  @Builder(toBuilder = true)
  private static class Person {
    String name;
    int age;
    PhoneNumber phoneNumber;
  }

  @Value
  @Builder
  private static class PhoneNumber {
    String countryCode;
    String areaCode;
    String number;
  }

  @Test
  public void test_builder() {
    Person alice = new Person(
      "Alice",
      42,
      new PhoneNumber("1", "718", "555-5555")
    );

    Person aliceWithBuilder = Person.builder()
      .age(42)
      .name("Alice")
      .phoneNumber(PhoneNumber.builder()
        .countryCode("1")
        .areaCode("555")
        .number("555-5555")
        .build())
      .build();

    Person aliceAfterBirthday =
      aliceWithBuilder.toBuilder().age(43).build();

    assertThat(aliceAfterBirthday.getName()).isEqualTo(aliceWithBuilder.getName());
  }
}
