package chap13.textbook.s130601;

public class GenericEx4WildCard {
	public static void main(String[] args) {
		Course<Person> coursePerson = new Course<Person>("일반인", 5);
		Course<Student> courseStudent = new Course<Student>("학생", 5);
		
		Person p = new Person("일반");
		Student s = new Student("학생");		
		p=s;
		
		
		courseStudent.add(new Student("hong"));
		coursePerson.add(new Person("kim"));
			
		
//		coursePerson = courseStudent;
		coursePerson.add(new Person("lee"));
		//17번이 일어나고 나면 courseStundent에 Person이 들어갈 수 없으니까 17번에서 에러가 나는 것이다.
		//그래서 courseStudent는 coursePerson의 하위타입이 아니다. 
		// => 그래서 와일드 카드를 쓰는 것임
		
		System.out.println("wildCard");
		//Studet포함 상위 클래스만
		Course<? super Student> courseW = new Course<Person>("a", 1);
		Course<? super Student> courseW2 = new Course<Student>("a", 1);
		Course<? super Student> courseW3 = new Course<HighStudent>("a", 1);
		
		
		courseW.add(new Student("a"));
		courseW.add(new HighStudent("b"));
		/*********************************/
		courseW.add(new Object());
		courseW.add(new Person("d"));
	}
}
