package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.app.custom_exceptions.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.app.entities.Catagory;
import com.app.entities.Railways;
import com.app.repository.RailRepository;

@Service
@Transactional
public class RailSrviceImpl implements RaiService{
@Autowired
private RailRepository railp;
@Autowired // by type : field level DI
private ModelMapper mapper;
@Override
public List<Railways> getAllRails() {
	// TODO Auto-generated method stub
	return railp.findAll();
}

@Override
public Railways addRail(Railways transientRail) {
	// TODO Auto-generated method stub
	return railp.save(transientRail);
}

@Override
public Railways updateRail(Railways detachedRail) {
	// TODO Auto-generated method stub
	return railp.save(detachedRail);
}

@Override
public String deletRail(Long railId) {
	String mesg="Invalid id";
	if(railp.existsById(railId)) {
		railp.deleteById(railId);
		mesg=" "+railId+" "; 
	}
	
	return mesg;
	
}



@Override
public List<Railways> getRailbyCat(Catagory c) {
	// TODO Auto-generated method stub
	return railp.findByCtgr(c);
}

}


