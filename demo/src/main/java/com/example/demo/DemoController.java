package com.example.demo;


import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
@RequestMapping("/")	
public String helloWorld() {
	return "Hello World";
}
@RequestMapping(value= "/emp")
public ResponseEntity<List<Employee>> getEmployeeDetail() {
	List<Employee> eList=new ArrayList<>();
	eList.add(new Employee(1,"Paramesh", "IT", 50000));
	eList.add(new Employee(1,"Naga", "IT", 50000));
	eList.add(new Employee(1,"Thanu", "IT", 5000));
	return ResponseEntity.ok(eList);
}

}
