package lombok.examples.Builder;

import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
class Person {
  String name;
  int age;
  PhoneNumber phoneNumber;
}

@Value
@Builder
class PhoneNumber {
  String countryCode;
  String areaCode;
  String number;
}

public class BuilderTests {
  private Person alice = new Person(
    "Alice",
    42,
    new PhoneNumber("1", "718", "555-5555")
  );

  private Person aliceWithBuilder = Person.builder()
    .age(42)
    .name("Alice")
    .phoneNumber(PhoneNumber.builder()
      .countryCode("1")
      .areaCode("555")
      .number("555-5555")
      .build())
    .build();

  private Person aliceAfterBirthday =
    aliceWithBuilder.toBuilder().age(43).build();
}
