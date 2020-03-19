package lombok.examples.ValueClass;

import lombok.Value;

@Value
public class NewUserProfile {
	String firstName;
	String lastName;
	String homePhone;
	String mobilePhone;
}
