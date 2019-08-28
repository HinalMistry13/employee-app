package com.axelor.emp.db.repository;

import com.axelor.emp.db.Project;
import com.axelor.emp.db.repo.ProjectRepository;

public class MyProjectRepository extends ProjectRepository{

	@Override
	public Project save(Project entity) {
		entity.setPriority(10);
		return super.save(entity);
	}
}
