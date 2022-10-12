package youtubeEgitim;

public class Person extends Customer {
	String nationalIdentity;
	String firstName;
	String lastName;

	public String getFirtName() {
		return firstName;
	}

	public void setFirtName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
}
