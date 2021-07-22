package hrmsproject.hrms.core.adapters;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import hrmsproject.hrms.mernis.FakeMernisService;

@Service
public class MernisServiceAdapter implements UserCheckService{

	@Override
	public boolean checkUser(long nationalityId, String firstName, String lastName, LocalDate dateOfBirth) {
		
		FakeMernisService mernis = new FakeMernisService();
		
		boolean result = mernis.isValid(nationalityId, firstName, lastName, dateOfBirth);
		
		return result;
	}

}
