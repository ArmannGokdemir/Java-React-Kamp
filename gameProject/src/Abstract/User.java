package Abstract;

import java.util.Date;
import java.util.Vector;

public abstract class User {
	private int id;
	private String nickname;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String nationalityId;
	private String authorizationLevel;
	private String mail;
	private Vector games=new Vector();
	
	public User(int id, String firstName, String lastName, Date dateOfBirth, String nationalityId,
			String authorizationLevel, String mail,String nickname) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
		this.authorizationLevel = authorizationLevel;
		this.mail = mail;
		this.nickname=nickname;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getAuthorizationLevel() {
		return authorizationLevel;
	}

	public void setAuthorizationLevel(String authorizationLevel) {
		this.authorizationLevel = authorizationLevel;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Vector getGames() {
		return games;
	}

	public void setGames(Product product) {
		this.games.add(product);
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	

}
