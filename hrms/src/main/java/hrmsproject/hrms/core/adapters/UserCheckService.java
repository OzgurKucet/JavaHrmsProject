package hrmsproject.hrms.core.adapters;

import java.time.LocalDate;

public interface UserCheckService {
	boolean checkUser(long nationalityId, String firstName, String lastName,LocalDate dateOfBirth);
}
