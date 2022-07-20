
package com.createiq.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.createiq.model.Employee;

@Controller
public class WelcomeController {

	
	@Value("${msg}")
private String msg;
	
		
		
	
	@GetMapping("/welcome")
	public String welcome(Model model) {
		model.addAttribute("msg", msg);
		
		return "welcome";
	}
	
	

	
  List<Employee> findAll(){
			
	
		List<Employee> employees = Stream.of(new Employee(1001, "ramkkumar", 1200.00 ), new Employee(1003, "ravi", 1400.00 ),
			new	Employee(1002, "saikumar", 1000.00 ), new Employee(1005, "mahesh", 1000.00 )).collect(Collectors.toList());
		
		return employees;
		
		
}
  
  @GetMapping("/findAll")
  String getemps(Model model) {
	  
	  model.addAttribute("emps", findAll());
	return "findAll";
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}