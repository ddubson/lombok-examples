package lombok.examples.Logging;

import lombok.NonNull;
import lombok.Value;

@Value
public class UserProfile {
	@NonNull String firstName;
	@NonNull String lastName;
	@NonNull String homePhone;
	@NonNull String mobilePhone;
}
