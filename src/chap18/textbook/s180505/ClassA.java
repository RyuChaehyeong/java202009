package chap18.textbook.s180505;

import java.io.Serializable;

public class ClassA implements Serializable{
		//직렬화가 가능한 
	static final long serialVersionUID = 1L; //같은 ID를 가질때 직렬화와 역직렬화 
	//이런게 있으면 serial하기 위한 버전정보이구나!
	int field1;
	ClassB field2 = new ClassB();
	static int field3;
	transient int field4;
	//인스턴스 필드만 직렬화 가능, static, transient 붙은 거는 직렬화 불가능
	
}
