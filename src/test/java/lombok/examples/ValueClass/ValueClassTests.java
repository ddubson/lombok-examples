package lombok.examples.ValueClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValueClassTests {
	@Test
	public void withoutLombok_createsImmutableDataClassAndHasAToString() {
		OldUserProfile oldUserProfile = new OldUserProfile("James", "Doe", "111-111-1111", "222-222-2222");
		assertEquals("OldUserProfile{firstName='James', lastName='Doe', homePhone='111-111-1111', mobilePhone='222-222-2222'}", oldUserProfile.toString());
	}

	@Test
	public void withLombok_createsImmutableDataClassAndHasAToString() {
		NewUserProfile newUserProfile = new NewUserProfile("James", "Doe", "111-111-1111", "222-222-2222");
		assertEquals("NewUserProfile(firstName=James, lastName=Doe, homePhone=111-111-1111, mobilePhone=222-222-2222", newUserProfile.toString());
	}
}
