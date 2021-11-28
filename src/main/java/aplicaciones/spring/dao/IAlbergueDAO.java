package aplicaciones.spring.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aplicaciones.spring.entity.Albergue;


@Repository
public interface IAlbergueDAO extends JpaRepository<Albergue, Long>{

	//buscar albergue por region
	List<Albergue> findByRegion(String region);
}
