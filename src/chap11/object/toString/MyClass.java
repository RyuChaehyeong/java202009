package chap11.object.toString;

public class MyClass {
	private int age;
	private String name;
	private String password;
	
	//인스턴스 필드의 경로를 얻는 데 사용
	public void setFields(int age, String name, String password) {
		this.age = age;
		this.name = name;
		this.password = password;
	}

	@Override
	public String toString() {
		return "MyClass [age=" + age + ", name=" + name + ", password=" + password + "]";
	}
	//필드에 있는 정보를 리턴해줄 문구 완성

}
