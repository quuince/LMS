package valueObject;

import model.Mmember;

public class Omember {
		private String id;
		private String password;
		private String address;
		private String department;
		private String name;

	public Omember() {	}

	public String getId() {return id;}
	public void setId(String id) {this.id = id;	}
	public String getAddress() {return address;}
	public void setAddress(String address) {this.address = address;}
	public String getDepartment() {return department;}
	public void setDepartment(String department) {this.department = department;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;	}
	public String getPassword() {	return password;}
	public void setPassword(String password) { this.password = password;}

	public void set(Mmember mmember) {
		this.setAddress(mmember.getAddress());
		this.setDepartment(mmember.getDepartment());
		this.setId(mmember.getId());
		this.setName(mmember.getName());
		this.setPassword(mmember.getPassword());
		
	}

}
