package maven.demo.practice;



public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private String branchName;
	//private int age;
	private char grade;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	
	
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	
	public Student(int id, String name, String branchName, char grade) {
		super();
		this.id = id;
		this.name = name;
		this.branchName = branchName;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", branchName=" + branchName + ", grade=" + grade + "]";
	}
	@Override
	public int compareTo(Student obj) {
		//return this.id - obj.id;
		//return this.name.compareTo(obj.name);
		return this.grade - (obj.grade);
//		
	}

}
