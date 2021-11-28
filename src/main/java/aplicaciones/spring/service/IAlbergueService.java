package aplicaciones.spring.service;

import java.util.List;

import aplicaciones.spring.entity.Albergue;

public interface IAlbergueService {
	List<Albergue> buscarPorRegion(String region);
}
