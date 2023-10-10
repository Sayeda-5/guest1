package com.project.parking.Model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class Admin {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private Integer adminID;
	
	@NotNull
	@NotBlank
	@Size(min = 2, max = 15, message = "Name should be min 2 and maximum 15 characters long")
	private String adminName;
	
	@NotNull
	@Email
	private String email;
	
	
	@NotBlank
	private String password;
	
	
	@Pattern(regexp = "(^$|[0-9]){10}")
	private String mobile;


	public Integer getAdminID() {
		// TODO Auto-generated method stub
		return null;
	}


	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}


	public String getAdminName() {
		return adminName;
	}


	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public void setAdminID(Integer adminID) {
		this.adminID = adminID;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	

//	@OneToMany(mappedBy = "admin" ,cascade = CascadeType.ALL)
//	@JsonIgnore
//	private List<Report> reports = new ArrayList<>();
	
}
	