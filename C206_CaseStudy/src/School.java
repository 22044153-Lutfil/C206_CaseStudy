
public class School {
	private int schoolID;
	private String schoolName;
	private int schoolContact;
	private String schoolAddress;
	
	public School(int schoolID, String schoolName, int schoolContact, String schoolAddress) {
		
		this.schoolID = schoolID;
		this.schoolName = schoolName;
		this.schoolContact = schoolContact;
		this.schoolAddress = schoolAddress;
	}

	public int getSchoolID() {
		return schoolID;
	}

	public void setSchoolID(int schoolID) {
		this.schoolID = schoolID;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public int schoolContact() {
		return schoolContact;
	}

	public void schoolContact(int schoolContact) {
		this.schoolContact = schoolContact;
	}

	public String getSchoolAddress() {
		return schoolAddress;
	}

	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}

}
