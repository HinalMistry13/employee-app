package com.axelor.emp.db.repository;

import java.util.Map;
import java.util.Set;

import com.axelor.emp.db.Employee;
import com.axelor.emp.db.Project;
import com.axelor.emp.db.repo.EmployeeRepository;

public class MyEmployeeRepository extends EmployeeRepository {

	@Override
	public Map<String, Object> populate(Map<String, Object> json, Map<String, Object> context) {
		try {
			Long id = (Long) json.get("id");
			Employee employee = find(id);
			json.put("contacts", employee.getContacts());
			json.put("project", employee.getProjects());
		} catch (Exception e) {
		}
		return json;
	}

	@Override
	public Employee save(Employee entity) {
		Set<Project> projectSet = entity.getProjects();
		for(Project p : projectSet) {
			p.setPriority(10);
		}
		return super.save(entity);
	}
}
