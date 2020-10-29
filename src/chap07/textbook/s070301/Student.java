package chap07.textbook.s070301;

public class Student extends People{
	public int studentNo;
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		//부모생성자가 argument없는 생성자가 없음, 명시적으로!
		this.studentNo = studentNo;
	}

	

}
