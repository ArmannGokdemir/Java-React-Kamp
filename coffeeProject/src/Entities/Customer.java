package Entities;

import java.util.Date;

import Abstract.ICustomerService;
import Abstract.IEntity;

public class Customer implements IEntity { // somut siniflar imp ya extend almiyorsa genelde ilerde nesnellik zaafiyeti yasanir
	private int id;
	private String FirstName;
	private String LastName;
	private Date DateOfBirth;
	private String NationalityId;
	public Customer(int id, String firstName, String lastName, Date dateOfBirth, String nationalityId) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		DateOfBirth = dateOfBirth;
		NationalityId = nationalityId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public Date getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}
	

}
