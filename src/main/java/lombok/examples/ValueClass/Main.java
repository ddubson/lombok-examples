package lombok.examples.ValueClass;

import static lombok.examples.Helpers.withLombok;
import static lombok.examples.Helpers.withoutLombok;

public class Main {
	public static void main(String[] args) {
		OldUserProfile oldUserProfile = new OldUserProfile("James", "Doe", "111-111-1111", "222-222-2222");
		withoutLombok(oldUserProfile.toString());

		NewUserProfile newUserProfile = new NewUserProfile("James", "Doe", "111-111-1111", "222-222-2222");
		withLombok(newUserProfile.toString());
	}
}
