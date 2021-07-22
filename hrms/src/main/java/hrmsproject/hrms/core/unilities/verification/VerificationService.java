package hrmsproject.hrms.core.unilities.verification;

public interface VerificationService {
	
	void sendVerificationCode(String email);
	
	String codeGenerator();
}
