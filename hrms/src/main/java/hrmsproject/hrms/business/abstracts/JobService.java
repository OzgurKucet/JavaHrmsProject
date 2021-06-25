package hrmsproject.hrms.business.abstracts;

import java.util.List;

import hrmsproject.hrms.core.unilities.results.DataResult;
import hrmsproject.hrms.entities.concretes.Job;
import hrmsproject.hrms.core.unilities.results.Result;

public interface JobService {
	DataResult<List<Job>> getall();
	Result add(Job job);
	
}
