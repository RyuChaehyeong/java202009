package chap07.textbook.s070706;

public class InstanceofOperator {
	
	public static void method1 (Parent parent) {
		//parent instanceof Child 의미: parameter로 받아온 parent가 Child의 인스턴스냐?
		if(parent instanceof Child) {
			Child child = (Child) parent; //parent를 Child로 형변환 후 Child의 child에 할당
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	
	
	
	
	public static void method2 (Parent parent) {
		Child child = (Child) parent; //parent를 Child로 형변환 후 Child의 child에 할당
		System.out.println("method2 - Child로 변환 성공");
	}	//instanceof Operator를 사용하지 않은 경우 ClassCastException이 발생가능
	
	
	
	
	
	public static void main(String[] args) {
		//+) method1과 method2는 static이 아니라 object없이 호출 가능
		Parent parentA = new Child(); //parentA는 Parent type의 Child객체
		method1(parentA); //실제 인스턴스는 Child이기 때문에 Parent type에서 Child type으로 형변환 가능
		method2(parentA); 
		
		
		//method1은 instanceof 사용o 안된다고 알려줌, method2는 사용x 안된다고 안알려줌(프로그램 종료)
		Parent parentB = new Parent(); //parentB는 Parent객체 
		method1(parentB); //실제 인스턴스가 Parent이기 때문에 Child type으로 형변환 불가능
		method2(parentB); //문법적으로 오류는 아니지만 Parent는 Child가 될 수 없음 (ClassCastException 발생)
	}
}
