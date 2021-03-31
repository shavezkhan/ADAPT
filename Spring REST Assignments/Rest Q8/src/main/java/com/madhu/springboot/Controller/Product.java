package com.madhu.springboot.Controller;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Document(collection="products")
public class Product 
{
	@Id
	private String id;
	private String title;
	private String description;
	private boolean placed;
	
	public Product()
	{
		
	}
	
	

	public Product(String title, String description, boolean placed) {
		super();
		this.title = title;
		this.description = description;
		this.placed = placed;
	}



	public String getid() {
		return id;
	}

	public void setProductId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isPlaced() {
		return placed;
	}

	public void setPlaced(boolean placed) {
		this.placed = placed;
	}



/*	@Override
	public String toString() {
		return "Order [orderId=" + id + ", title=" + title + ", description=" + description + ", placed=" + placed
				+ "]";
	}

	*/
	
	
}
