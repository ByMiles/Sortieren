package data;

public class Student {
	private String prename;
	private String surname;
    private int course;
	private int gender;
	private int mn;
	
	
	public Student(String prename, String surname, int course, int gender, int mn) {
		super();
		this.prename = prename;
		this.surname = surname;
		this.course = course;
		this.gender = gender;
		this.mn = mn;
	}
	public String getPrename() {
		return prename;
	}
	public void setPrename(String prename) {
		this.prename = prename;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public int getMn() {
		return mn;
	}
	public void setMn(int mn) {
		this.mn = mn;
	}
	@Override
	public String toString() {
		return "Student [prename=" + prename + ", surname=" + surname + ", course=" + course + ", gender=" + gender
				+ ", mn=" + mn + "]";
	}
	
	

}
