package hrmsproject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrmsproject.hrms.business.abstracts.EmployeeService;
import hrmsproject.hrms.core.unilities.results.DataResult;
import hrmsproject.hrms.core.unilities.results.Result;
import hrmsproject.hrms.core.unilities.results.SuccessDataResult;
import hrmsproject.hrms.core.unilities.results.SuccessResult;
import hrmsproject.hrms.dataAccess.abstracts.EmployeeDao;
import hrmsproject.hrms.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService{

	private EmployeeDao employeeDal;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDal) {		
		this.employeeDal = employeeDal;
	}



	@Override
	public DataResult<List<Employee>> getAll() {
		
		return new SuccessDataResult<List<Employee>>(this.employeeDal.findAll());
	}



	@Override
	public Result add(Employee employee) {
		this.employeeDal.save(employee);
		return new SuccessResult("Kişi başarıyla eklendi");
	}

	
	
	
}
