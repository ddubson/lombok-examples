package lombok.examples.SafeDuplication;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SafeDuplicationTests {
	@Test
	public void withoutLombok_duplicationOfAClass() {
		OldUserProfile userProfile = new OldUserProfile("James", "Doe", "111-111-1111", "222-222-2222");
		OldUserProfile anotherUserProfile = userProfile.withFirstName("Jill");
		assertEquals("Jill", anotherUserProfile.getFirstName());
		assertEquals("Doe", anotherUserProfile.getLastName());
		assertEquals("111-111-1111", anotherUserProfile.getHomePhone());
		assertEquals("222-222-2222", anotherUserProfile.getMobilePhone());
	}

	@Test
	public void withLombok_duplicationOfAClassWorks() {
		NewUserProfile userProfile = new NewUserProfile("James", "Doe", "111-111-1111", "222-222-2222");
		NewUserProfile anotherUserProfile = userProfile.withFirstName("Jill").withLastName("Stark");
		assertEquals("Jill", anotherUserProfile.getFirstName());
		assertEquals("Stark", anotherUserProfile.getLastName());
		assertEquals("111-111-1111", anotherUserProfile.getHomePhone());
		assertEquals("222-222-2222", anotherUserProfile.getMobilePhone());
	}
}
