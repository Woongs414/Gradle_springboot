package com.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("springbootDAO")
public interface SpringbootDAO {
	public List listSpringboot() throws DataAccessException;


}
