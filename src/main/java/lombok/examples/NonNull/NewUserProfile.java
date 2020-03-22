package lombok.examples.NonNull;

import lombok.NonNull;
import lombok.Value;

@Value
public class NewUserProfile {
	@NonNull String firstName;
	@NonNull String lastName;
	@NonNull String homePhone;
	@NonNull String mobilePhone;
}
