package hrmsproject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrmsproject.hrms.business.abstracts.JobService;
import hrmsproject.hrms.core.unilities.results.DataResult;
import hrmsproject.hrms.core.unilities.results.Result;
import hrmsproject.hrms.core.unilities.results.SuccessDataResult;
import hrmsproject.hrms.core.unilities.results.SuccessResult;
import hrmsproject.hrms.dataAccess.abstracts.JobDao;
import hrmsproject.hrms.entities.concretes.Job;


@Service
public class JobManager implements JobService{

	private JobDao jobDao;	
	
	@Autowired
	public JobManager(JobDao jobDao) {		
		this.jobDao = jobDao;
	}



	@Override
	public DataResult<List<Job>> getall() {
		
		return new SuccessDataResult<List<Job>>
		(this.jobDao.findAll(),"Data listelendi");
				
	}



	@Override
	public Result add(Job job) {
		this.jobDao.save(job);
		return new SuccessResult("Ürün Eklendi");
	}

}
