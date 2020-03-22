package lombok.examples.SafeDuplication;

import lombok.NonNull;
import lombok.Value;
import lombok.With;

@Value
public class NewUserProfile {
	@With
	@NonNull
	private String firstName;

	@With
	@NonNull
	private String lastName;

	@With
	@NonNull
	private String homePhone;

	@With
	@NonNull
	private String mobilePhone;
}
