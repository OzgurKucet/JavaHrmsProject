package hrmsproject.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrmsproject.hrms.business.abstracts.VerificationCodeService;
import hrmsproject.hrms.core.unilities.results.DataResult;
import hrmsproject.hrms.core.unilities.results.Result;
import hrmsproject.hrms.core.unilities.results.SuccessDataResult;
import hrmsproject.hrms.core.unilities.results.SuccessResult;
import hrmsproject.hrms.dataAccess.abstracts.VerificationCodeDao;
import hrmsproject.hrms.entities.concretes.VerificationCode;

@Service
public class VerificationCodeManager implements VerificationCodeService{

	private VerificationCodeDao verificationCodeDao;
	
	@Autowired
	public VerificationCodeManager(VerificationCodeDao verificationCodeDao) {		
		this.verificationCodeDao = verificationCodeDao;
	}

	@Override
	public Result add(VerificationCode code) {
		this.verificationCodeDao.save(code);
		return new SuccessResult("VerificationCode eklendi");
	}

	@Override
	public Result update(VerificationCode code) {
		this.verificationCodeDao.save(code);
		return new SuccessResult("VerificationCode güncellendi");
	}

	@Override
	public Result delete(VerificationCode code) {
		this.verificationCodeDao.delete(code);
		return new SuccessResult("VerificationCode silindi");
	}

	@Override
	public DataResult<VerificationCode> findByUserIdAndCode(int userId, String code) {
		
		return new SuccessDataResult<VerificationCode>(this.verificationCodeDao.findByUserIdAndCode(userId, code));
	}

}
