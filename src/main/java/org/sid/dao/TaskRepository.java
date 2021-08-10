package org.sid.dao;


import org.sid.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TaskRepository extends JpaRepository<Task, Long> {
	
	
	
}
