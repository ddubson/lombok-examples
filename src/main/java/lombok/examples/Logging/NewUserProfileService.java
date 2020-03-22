package lombok.examples.Logging;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class NewUserProfileService {
	public void add(UserProfile userProfile) {
		log.info("Adding a user profile.");
	}

	public List<UserProfile> fetchAll() {
		log.info("Fetching all user profiles.");
		return new ArrayList<>();
	}
}
