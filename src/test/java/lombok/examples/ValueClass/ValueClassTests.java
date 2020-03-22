package lombok.examples.ValueClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValueClassTests {
	@Test
	public void withoutLombok_createsImmutableDataClassAndHasAToString() {
		OldUserProfile oldUserProfile = new OldUserProfile("James", "Doe", "111-111-1111", "222-222-2222");
		assertEquals("James", oldUserProfile.getFirstName());
		assertEquals("Doe", oldUserProfile.getLastName());
		assertEquals("111-111-1111", oldUserProfile.getHomePhone());
		assertEquals("222-222-2222", oldUserProfile.getMobilePhone());
	}

	@Test
	public void withLombok_createsImmutableDataClassAndHasAToString() {
		NewUserProfile newUserProfile = new NewUserProfile("James", "Doe", "111-111-1111", "222-222-2222");
		assertEquals("James", newUserProfile.getFirstName());
		assertEquals("Doe", newUserProfile.getLastName());
		assertEquals("111-111-1111", newUserProfile.getHomePhone());
		assertEquals("222-222-2222", newUserProfile.getMobilePhone());
	}
}
