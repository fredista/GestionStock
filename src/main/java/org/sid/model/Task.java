package org.sid.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Task implements Serializable {
	
	@Id
	@GeneratedValue
	Long id;
	String label;
	boolean completed; 
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id =  id;
	}
	
	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	public boolean isCompleted() {
		return completed;
	}
	
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public Task(String label, boolean completed) {
		super();
		this.label = label;
		this.completed = completed;
	}

	
	public Task() {
		super();
	}
	
	
	

}
