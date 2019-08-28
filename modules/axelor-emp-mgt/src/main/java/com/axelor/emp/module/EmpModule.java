package com.axelor.emp.module;

import com.axelor.app.AxelorModule;
import com.axelor.emp.db.repo.EmployeeRepository;
import com.axelor.emp.db.repo.ProjectRepository;
import com.axelor.emp.db.repository.MyEmployeeRepository;
import com.axelor.emp.db.repository.MyProjectRepository;

public class EmpModule extends AxelorModule{

	@Override
	protected void configure() {
		bind(EmployeeRepository.class).to(MyEmployeeRepository.class);
		bind(ProjectRepository.class).to(MyProjectRepository.class);
	}

}
