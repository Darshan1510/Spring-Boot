package com.demo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.RegVO;
import com.demo.service.InsertService;

@Controller
public class InsertController {
	
	@Autowired InsertService service;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView loadInsert()
	{
		return new ModelAndView ("insert","data",new RegVO());
	}
	
	@RequestMapping(value="/dataInsert",method=RequestMethod.POST)
	public ModelAndView dataInsert(@ModelAttribute RegVO regVO)
	{
		this.service.insert(regVO);		
		return new ModelAndView("insert","data",new RegVO());
	}
	
	
	@RequestMapping(value="/search",method=RequestMethod.GET)
	public ModelAndView SearchData(@ModelAttribute RegVO regVO)
	{
		List ls = this.service.datasearch(regVO);
		return new ModelAndView("search","showrecord",ls); 		
	}
	
	@RequestMapping(value="delete", method=RequestMethod.GET)
	public ModelAndView deletedata(@ModelAttribute RegVO regVO, @RequestParam ("insertId") int id)
	{
		regVO.setId(id);
		this.service.deletedata(regVO);
		return new ModelAndView("search","data",new RegVO());
				
	}
	
	@RequestMapping(value="edit", method = RequestMethod.GET)
	public ModelAndView editInformation(@ModelAttribute RegVO regVO, @RequestParam ("id")int id)
	{
		regVO.setId(id);
		List ls = this.service.dataedit(regVO);
		return new ModelAndView("edit","data",(RegVO)ls.get(0));
	}
	
	@RequestMapping(value="update", method = RequestMethod.POST)
	public ModelAndView updateInformation(@ModelAttribute RegVO regVO)
	{
		this.service.dataupdate(regVO);
		return new ModelAndView("search","data",new RegVO());
	}
	
	

}
