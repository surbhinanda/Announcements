package org.cinglevue.announcement;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Announcement")
public class Announcement {

	@Id
	@GeneratedValue
	private Integer autoid;
	

private String id;
	
public Integer getAutoid() {
	return autoid;
}
public void setAutoid(Integer autoid) {
	this.autoid = autoid;
}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	private String title;
	private String body;
	private String startDate;
	private String expiryDate;
	

    
   
}
