package com.demo.DAO;

import com.demo.model.RegVO;
import java.util.*;

public interface InsertDAO {

	public void insertdata(RegVO regVO);
	
	public List searchdata(RegVO regVO);
	
	public void delete(RegVO regVO);
	
	public List editdata(RegVO regVO);
	
	public void updatedata(RegVO regVO);
}
