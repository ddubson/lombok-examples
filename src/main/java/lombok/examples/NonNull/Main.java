package lombok.examples.NonNull;

import static lombok.examples.Helpers.withLombok;
import static lombok.examples.Helpers.withoutLombok;

public class Main {
	public static void main(String[] args) {
		try {
			OldUserProfile oldUserProfile = new OldUserProfile("James", null, "111-111-1111", "222-222-2222");
		} catch (NullPointerException e) {
			withoutLombok("Null pointer exception was thrown with message: " + e.getMessage());
		}

		try {
			NewUserProfile newUserProfile = new NewUserProfile("James", null, "111-111-1111", "222-222-2222");
		} catch (NullPointerException e) {
			withLombok("Null pointer exception was thrown with message: " + e.getMessage());
		}
	}
}
