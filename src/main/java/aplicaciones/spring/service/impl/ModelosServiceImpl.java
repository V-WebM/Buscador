package aplicaciones.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aplicaciones.spring.dao.IAlbergueDAO;
import aplicaciones.spring.entity.Albergue;
import aplicaciones.spring.service.IAlbergueService;

@Service
public class ModelosServiceImpl implements IAlbergueService{
	
	@Autowired
	private IAlbergueDAO albergueDao;
	
	@Override
	public List<Albergue> buscarPorRegion(String region){
		return albergueDao.findByRegion(region);
	}
}
