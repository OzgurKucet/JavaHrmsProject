package hrmsproject.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrmsproject.hrms.business.abstracts.JobService;
import hrmsproject.hrms.core.unilities.results.DataResult;
import hrmsproject.hrms.entities.concretes.Job;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import hrmsproject.hrms.core.unilities.results.Result;

@RestController
@RequestMapping("/api/jobs")
public class JobsController {

	private JobService jobService;
	
	@Autowired
	public JobsController(JobService jobService) {		
		this.jobService = jobService;
	}



	@GetMapping("/getall")
	public DataResult<List<Job>> getAll(){
		
		return this.jobService.getall();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Job job) {
		return this.jobService.add(job);
	}
	
}
