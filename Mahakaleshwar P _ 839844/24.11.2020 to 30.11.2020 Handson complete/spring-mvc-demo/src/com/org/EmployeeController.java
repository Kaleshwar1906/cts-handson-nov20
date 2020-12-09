package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@RequestMapping(value = "/time", method = RequestMethod.GET)
	public ModelAndView viewDateTime() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.fetchDateTimeService());
		return mav;
	}
	
	@RequestMapping(value = "/sortByNameReverse", method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesNameInReverseOrder() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getAllEmployeesNamesInReverseOrder());
		return mav;
	}
	
	@RequestMapping(value="/employee", method = RequestMethod.POST)
	public ModelAndView extractEmployee(@RequestParam("employeeId") int id) {
		ModelAndView mav = new ModelAndView("hello","msg",service.fetchEmployee(id));
		return mav;
	}
	
	@RequestMapping(value="multipleKeys",method = RequestMethod.GET)
	public ModelAndView fetchMultipleKeys() {
		ModelAndView mav=null;
		ModelMap modelMap =new ModelMap();
		modelMap.put("title", "Something");
		modelMap.put("emp", new Employee(100,"Ravi",233400));
		modelMap.put("empList", service.getAllEmployeesNamesInReverseOrder());
		mav=new ModelAndView("welcome","model", modelMap);
		return mav;
	}
}

