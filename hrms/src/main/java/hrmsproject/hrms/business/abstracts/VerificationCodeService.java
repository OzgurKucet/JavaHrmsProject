package hrmsproject.hrms.business.abstracts;

import hrmsproject.hrms.core.unilities.results.DataResult;
import hrmsproject.hrms.core.unilities.results.Result;
import hrmsproject.hrms.entities.concretes.VerificationCode;

public interface VerificationCodeService {

	Result add(VerificationCode code);
	
	Result update(VerificationCode code);
	
	Result delete(VerificationCode code);
	
	DataResult<VerificationCode> findByUserIdAndCode(int userId, String code);
	
}
