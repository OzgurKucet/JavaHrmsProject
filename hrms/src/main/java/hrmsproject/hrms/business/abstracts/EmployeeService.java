package hrmsproject.hrms.business.abstracts;

import java.util.List;

import hrmsproject.hrms.core.unilities.results.DataResult;
import hrmsproject.hrms.core.unilities.results.Result;
import hrmsproject.hrms.entities.concretes.Employee;

public interface EmployeeService {
	DataResult<List<Employee>> getAll();
	Result add(Employee employee);
}
