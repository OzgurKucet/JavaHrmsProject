package hrmsproject.hrms.business.abstracts;

import java.util.List;

import hrmsproject.hrms.core.unilities.results.DataResult;
import hrmsproject.hrms.core.unilities.results.Result;
import hrmsproject.hrms.entities.concretes.Candidate;

public interface CandidateService {
	DataResult<List<Candidate>> getAll();
	
	Result add(Candidate candidate);
	
}
