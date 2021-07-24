package hrmsproject.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrmsproject.hrms.entities.concretes.City;

public interface CityDao extends JpaRepository<City, Integer>{
	City getById(int id);
}
