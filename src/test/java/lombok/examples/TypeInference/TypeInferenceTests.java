package lombok.examples.TypeInference;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TypeInferenceTests {
	@Test
	public void withLombok_valPseudokeyword() {
		val someInput = "This is some input";
		assertEquals(someInput, "This is some input");
	}
}
