package hrmsproject.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrmsproject.hrms.business.abstracts.VerificationCodeService;
import hrmsproject.hrms.core.unilities.results.DataResult;
import hrmsproject.hrms.core.unilities.results.Result;
import hrmsproject.hrms.entities.concretes.VerificationCode;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/verificationcodes")
public class VerificationCodesController {

	private VerificationCodeService verificationCodeService;

	@Autowired
	public VerificationCodesController(VerificationCodeService verificationCodeService) {
		this.verificationCodeService = verificationCodeService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody VerificationCode code) {
		
		return this.verificationCodeService.add(code);
	}
	
	@PostMapping("/update")
	public Result update(VerificationCode code) {
		return this.verificationCodeService.update(code);
	}
	
	@DeleteMapping("/delete")
	public Result delete(VerificationCode code) {
		return this.verificationCodeService.delete(code);
	}
	
	@GetMapping("getByUserIdAndVerificationCode")
	public DataResult<VerificationCode> findByUserIdAndCode(int userId, String code) {
		return this.verificationCodeService.findByUserIdAndCode(userId, code);
	}
	
	
	
	
}
