package com.example.polls.model;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.CreatedDate;

import com.example.polls.model.audit.DateAudit;

@Entity
@Table(name = "employees")
public class Employee extends DateAudit{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2177086672580892203L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 15)
    private String name;
    
    @NotBlank
    @Size(max = 15)
    private String gender;
    
    @CreatedDate    
    private Instant dob;
    
    public Employee() {
    	
    }

	/**
	 * @param id
	 * @param name
	 * @param gender
	 * @param dob
	 */
	public Employee(Long id, @NotBlank @Size(max = 15) String name, @NotBlank @Size(max = 15) String gender,
			Instant dob) {
		
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dob = dob;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the dob
	 */
	public Instant getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(Instant dob) {
		this.dob = dob;
	}
    
    

}
