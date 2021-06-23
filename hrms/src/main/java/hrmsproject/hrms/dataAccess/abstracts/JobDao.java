package hrmsproject.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrmsproject.hrms.entities.concretes.Job;

public interface JobDao extends JpaRepository<Job, Integer>{

	
	
	
}
