package com.demo.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.model.RegVO;

@Repository
public class InsertDAOImp implements InsertDAO {
    @Autowired
	private SessionFactory sessionFactory;

	
	public void insertdata(RegVO regVO) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(regVO);
	}
	
	public List searchdata(RegVO regVO) {
		// TODO Auto-generated method stub
		List ls = new ArrayList();
		try{
			Session session=sessionFactory.getCurrentSession();
			Query q= session.createQuery("FROM RegVO");
			ls = q.list();
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
			return ls;
		}
	public void delete(RegVO regVO){
		try{
			 Session session = this.sessionFactory.getCurrentSession();
			 session.delete(regVO);
			 
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
	public List editdata(RegVO regVO)
	{
		List ls = new ArrayList();
		try{
				Session session = sessionFactory.getCurrentSession();
				Query q = session.createQuery("FROM RegVO where id='"+regVO.getId()+"'");
				ls  = q.list();	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ls;
	}
	public void updatedata(RegVO regVO)
	{
		try{
			
			Session session = sessionFactory.getCurrentSession();
			session.update(regVO);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
	

