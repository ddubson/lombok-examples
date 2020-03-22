package lombok.examples.Logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class OldUserProfileService {
	private static final Logger log = LoggerFactory.getLogger(OldUserProfileService.class);

	public void add(UserProfile userProfile) {
		log.info("Adding a user profile.");
	}

	public List<UserProfile> fetchAll() {
		log.info("Fetching all user profiles.");
		return new ArrayList<>();
	}
}
