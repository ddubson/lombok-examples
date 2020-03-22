package lombok.examples.Logging;

import lombok.examples.NonNull.OldUserProfile;
import org.junit.jupiter.api.Test;

public class LoggingTests {
	@Test
	public void withoutLombok_printsLogToConsole() {
		OldUserProfileService service = new OldUserProfileService();
		service.add(new UserProfile("James", "Doe", "111-111-1111", "222-222-2222"));
	}

	@Test
	public void withLombok_printsLogToConsole() {
		NewUserProfileService service = new NewUserProfileService();
		service.add(new UserProfile("James", "Doe", "111-111-1111", "222-222-2222"));
	}
}
