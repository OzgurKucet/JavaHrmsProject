package hrmsproject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrmsproject.hrms.business.abstracts.JobService;
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
	public List<Job> getall() {
		
		return this.jobDao.findAll();
	}

}
