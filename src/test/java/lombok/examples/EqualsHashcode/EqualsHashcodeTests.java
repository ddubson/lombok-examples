package lombok.examples.EqualsHashcode;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

public class EqualsHashcodeTests {
  static class Person {
    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }
    private final String name;
    private final int age;

    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Person person = (Person) o;
      return age == person.age &&
        Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
      return Objects.hash(name, age);
    }
  }

  @Test
  public void test_equals() {
    Person alice = new Person("Alice", 43);

    assertThat(alice).isEqualTo(alice);
    assertThat(alice).isEqualTo(new Person("Alice", 43));
  }

  @Test
  public void test_hashCode() {
    Set<Person> set = new HashSet<>();

    addPeople(set, 1000);

    assertThat(set).hasSize(1000);
  }

  @Test
  public void test_hashCode_performance() {
    Set<Person> set = new HashSet<>();

    timeFunction(() -> addPeople(set, 1000));
  }

  private void addPeople(Set<Person> set, int count) {
    for (int index = 0; index < count; index++) {
      set.add(new Person("Person#" + index, index));
    }
  }

  private void timeFunction(Runnable lambda) {
    long before = System.nanoTime();
    lambda.run();
    long after = System.nanoTime();

    long elapsed = after - before;

    System.out.println("Total time taken was: " + TimeUnit.MILLISECONDS.convert(elapsed, TimeUnit.NANOSECONDS) + " milliseconds");
  }
}
