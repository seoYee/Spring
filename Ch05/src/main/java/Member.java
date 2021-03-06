package main.java;

import java.util.Date;

public class Member {
	
	private Long id;
	private String email;
	private String password;
	private String name;
	private Date rgisterDate;
	
	public Member(String email, String password, String name, Date rgisterDate) {
		this.email = email;
		this.password = password;
		this.name = name;
		this.rgisterDate = rgisterDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public Date getRgisterDate() {
		return rgisterDate;
	}
	
	public void changePassword(String oldPassword, String newPassword){
		if(!password.equals(oldPassword)){
			throw new IdPasswordNotMatchingException();
		}
		this.password = newPassword; 
		}
	}

