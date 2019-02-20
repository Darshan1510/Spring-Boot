package com.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.DAO.InsertDAO;
import com.demo.model.RegVO;

@Service
public class InsertService {
	
    @Autowired InsertDAO dao;
	
	
	@Transactional
	public void insert(RegVO regVO)
	{
		this.dao.insertdata(regVO);
	}
	
	@Transactional
	public List datasearch(RegVO regVO)
	{
		return this.dao.searchdata(regVO);
		
	}
	
	@Transactional
	public void deletedata(RegVO regVO)
	{
		this.dao.delete(regVO);
	}
	
	@Transactional
	public List dataedit(RegVO regVO)
	{
		List ls = this.dao.editdata(regVO);
		return ls;
	}
	
	@Transactional
	public void dataupdate(RegVO regVO)
	{
		this.dao.updatedata(regVO);
	}
}
