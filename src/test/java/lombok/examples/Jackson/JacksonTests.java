package lombok.examples.Jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Value;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JacksonTests {
  @Value
  @Builder(builderClassName = "Builder")
  @JsonDeserialize(builder = ImmutableThing.Builder.class)
  static class ImmutableThing {
    String cantChangeMe;

    @JsonPOJOBuilder(withPrefix = "")
    public static final class Builder {
    }
  }

  @Test
  public void test_readAndWriteJson() throws JsonProcessingException {
    ObjectMapper mapper = new ObjectMapper();

    String json = "{\"cantChangeMe\":\"foo\"}";

    ImmutableThing thing = mapper.readValue(json, ImmutableThing.class);

    assertThat(mapper.writeValueAsString(thing)).isEqualTo(json);
  }
}
