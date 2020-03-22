package lombok.examples.NonNull;

import java.util.Objects;

public class OldUserProfile {
	private final String firstName;
	private final String lastName;
	private final String homePhone;
	private final String mobilePhone;

	public OldUserProfile(String firstName, String lastName, String homePhone, String mobilePhone) {
		this.firstName = Objects.requireNonNull(firstName);
		this.lastName = Objects.requireNonNull(lastName);
		this.homePhone = Objects.requireNonNull(homePhone);
		this.mobilePhone = Objects.requireNonNull(mobilePhone);
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	@Override
	public String toString() {
		return "OldUserProfile{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", homePhone='" + homePhone + '\'' +
				", mobilePhone='" + mobilePhone + '\'' +
				'}';
	}
}
