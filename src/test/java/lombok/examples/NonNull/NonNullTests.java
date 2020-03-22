package lombok.examples.NonNull;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NonNullTests {
	@Test
	public void withoutLombok_throwsANullPointerExceptionWithoutSpecificMessage() {
		Exception e = assertThrows(NullPointerException.class,
				() -> new OldUserProfile("James", null, "111-111-1111", "222-222-2222"));
		assertNull(e.getMessage());
	}

	@Test
	public void withLombok_throwsANullPointerExceptionWithFieldThatIsNullByDefault() {
		Exception e = assertThrows(NullPointerException.class,
				() -> new NewUserProfile("James", null, "111-111-1111", "222-222-2222"));
		assertEquals("lastName is marked non-null but is null", e.getMessage());
	}
}
