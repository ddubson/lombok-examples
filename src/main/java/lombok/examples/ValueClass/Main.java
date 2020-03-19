package lombok.examples.ValueClass;

public class Main {
	public static void main(String[] args) {
		OldUserProfile oldUserProfile = new OldUserProfile("James", "Doe", "111-111-1111", "222-222-2222");
		System.out.println("Without Lombok: " + oldUserProfile.toString());

		NewUserProfile newUserProfile = new NewUserProfile("James", "Doe", "111-111-1111", "222-222-2222");
		System.out.println("With Lombok: " + newUserProfile.toString());
	}
}
