package com.springbootstarter.topics;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Topic {

	@Id
	private String t_id;
	private String t_name;
	private String t_desc;



	public Topic(String id, String name, String desc) {
		super();
		this.t_id = id;
		this.t_name = name;
		this.t_desc = desc;
	}
	public Topic() {}
	
	
	
	public String getId() {
		return t_id;
	}

	public void setId(String id) {
		this.t_id = id;
	}

	public String getName() {
		return t_name;
	}

	public void setName(String name) {
		this.t_name = name;
	}

	public String getDesc() {
		return t_desc;
	}

	public void setDesc(String desc) {
		this.t_desc = desc;
	}



}
