package com.axelor.emp.controller;

import com.axelor.emp.db.repo.DepartmentRepository;
import com.axelor.emp.db.repository.MyEmployeeRepository;
import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;
import com.google.inject.Inject;

public class EmpController {

	@Inject MyEmployeeRepository employeeRepository;
	@Inject DepartmentRepository departmentRepository;
	
	public void getData(ActionRequest request,ActionResponse response) {
		response.setNotify("Controller method call");
		
		/*System.out.println("before error");
		response.setError("hello");
		System.out.println("after error");*/
		
		/*Set<Entry<String, Object>> empset = request.getContext().entrySet();
		for(Entry<String, Object> entry : empset) {
			System.out.println("Entry is : " + entry.toString());
		}*/
	
		/*Department dept = departmentRepository.find((long)1);
		response.setValue("department", dept);*/
		
		//response.setValues(Employee);
		//employeeRepository.save(emp)
		//Beans.get(MyEmployeeRepository.class).save(entity);
	}
	
}
