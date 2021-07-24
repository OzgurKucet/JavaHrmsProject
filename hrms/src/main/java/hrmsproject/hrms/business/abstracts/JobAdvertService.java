package hrmsproject.hrms.business.abstracts;

import java.util.List;

import hrmsproject.hrms.core.unilities.results.DataResult;
import hrmsproject.hrms.core.unilities.results.Result;
import hrmsproject.hrms.entities.concretes.JobAdvert;

public interface JobAdvertService {

	Result add(JobAdvert jobAdvert);
	Result update(JobAdvert jobAdvert);
	Result delete(int id);
	Result changeOpenToClose(int id);
	DataResult<JobAdvert> getById(int id);	
	DataResult<List<JobAdvert>> getAll();
	DataResult<List<JobAdvert>> getAllOpenJobAdvertList();
	DataResult<List<JobAdvert>> findAllByOrderByPublishedAt();
	DataResult<List<JobAdvert>> getAllOpenJobAdvertByEmployer(int id);
	
}
