package hrmsproject.hrms.business.abstracts;

import java.util.List;

import hrmsproject.hrms.core.unilities.results.DataResult;
import hrmsproject.hrms.core.unilities.results.Result;
import hrmsproject.hrms.entities.concretes.City;

public interface CityService {
	
	DataResult<List<City>> getAll();
	Result add(City city);
}
