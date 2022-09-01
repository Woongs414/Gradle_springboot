package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.dao.SpringbootDAO;

@Service("springbootService")
@Transactional(propagation = Propagation.REQUIRED)
public class SpringbootServiceImpl implements SpringbootService {
	@Autowired
	private SpringbootDAO springbootDAO;
	
	
	@Override
	public List listSpringboot() throws DataAccessException {
		List membersList = null;
		membersList = springbootDAO.listSpringboot();
		return membersList;
	}

}
