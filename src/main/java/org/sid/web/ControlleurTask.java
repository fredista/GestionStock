package org.sid.web;



import java.util.List;
import java.util.Optional;

import org.sid.dao.TaskRepository;
import org.sid.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin("*")

public class ControlleurTask  {
	
	@Autowired
	TaskRepository taskrepository ;

	@PostMapping("/ajouter")
	public void Save(@RequestBody Task task) {
		
		taskrepository.save(task);	
	}
	
	@GetMapping("/task/{Id}")
	public Optional<Task> gettask(@PathVariable  Long Id ) {
		
		return taskrepository.findById(Id);	
	} 
	
	@GetMapping("/task")
	public List<Task> getAll(){
		
		return taskrepository.findAll();
	}
	
	@PutMapping("/modifier/{id}")
	public void modifier(@PathVariable Long id , @RequestBody Task task) {
		
		task.setId(id);
		
		taskrepository.save(task);
		
	}
	
	@DeleteMapping("/deletetask/{id}")
	public void supprimer(@PathVariable Long id) {
		
		taskrepository.deleteById(id);	
	}
	
	// methode permettant d avoir la liste pagineee des task
	
	@RequestMapping(value = "/liste", params = {"page" ,"size"}, method = RequestMethod.GET)
	public Page<Task> getpage(@RequestParam(name="page") int page ,@RequestParam(name="size") int size){
		
		return taskrepository.findAll(PageRequest.of(page, size));
	}
	
	
}
