package chap09.lecture.localClass;

public class MyApp2LocalVariable {
	public static void main(final String[] args) {
		//local 클래스에서 local 변수에 접근
		final int i = 1; //암묵적으로 파이널
		
		class LocalClass {
			void method1() {
				System.out.println(i);
				System.out.println(args);
//				i+=1; //메소드에 있는 지역변수 값을 바꿀 수 없음.
					//로컬 클래스에서 쓰는 값은 final
			}
		}
		//args = new String[3];
		//로컬에서 사용하면 값을 못바꿈
//		i+=1;
	}
}
