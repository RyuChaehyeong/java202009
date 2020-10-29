package chap06.lecture.annotation;

@MyAnnotation //클래스에도!
public class AnnotationEx1 {
	@MyAnnotation //필드에도 붙일 수 있따.
	//Annotation 첨가된 글
	// annotation @다른 프로그램, 컴파일러가 보라고 닮. 실행 시 영향을 미침
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	//클래스 타입의 클래스 변수에 클래스를 담아서 그 클래스 객체로 어노테이션까지 알수 있다고 해서 지금 이걸 배운다.
	
	
	@MyAnnotation(value ="abc", number = 5, names = {"c","d"}) //하나 넣을 때는 value 생략, 여러개 넣을 때는 써야 함
	public static void mymethod() {
		
	}
}
