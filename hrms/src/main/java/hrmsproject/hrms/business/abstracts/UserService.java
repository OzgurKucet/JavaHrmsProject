package hrmsproject.hrms.business.abstracts;

import java.util.List;

import hrmsproject.hrms.core.unilities.results.DataResult;
import hrmsproject.hrms.core.unilities.results.Result;
import hrmsproject.hrms.entities.concretes.User;

public interface UserService {

	DataResult<List<User>> getAll();
	Result add(User user);
}
