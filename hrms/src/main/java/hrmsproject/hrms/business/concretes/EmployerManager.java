package hrmsproject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrmsproject.hrms.business.abstracts.EmployerService;
import hrmsproject.hrms.core.unilities.results.DataResult;
import hrmsproject.hrms.core.unilities.results.Result;
import hrmsproject.hrms.core.unilities.results.SuccessDataResult;
import hrmsproject.hrms.core.unilities.results.SuccessResult;
import hrmsproject.hrms.dataAccess.abstracts.EmployerDao;
import hrmsproject.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{

	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {		
		this.employerDao = employerDao;
	}


	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll());
	}


	@Override
	public Result add(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult("Kişi başarıyla eklendi");
	}

}
