package chap06.lecture.staticKeyword;

public class MyClass {
	//===============instance member=============
	int var1; //instance field
	void method1() {//instance method
		System.out.println(var1);
		System.out.println(var2); 
			//↳It is possible to approach to static member in a instance member
	} 
	
	
	//===========class member==============
	//↳Just adding static in front of instance member
	//↳Without making any objects, you can use class member
	static int var2; //class field (static field)
	static void method2 () { //class method
		System.out.println(var2);
		//System.out.println(var1);
			//↳compile error (It is impossible to approach to static member in a instance member)
	}
	
	
	//===============static block==============
		//↳Executing first!, 
		//↳Write down the codes that initialize class field in this block.
	static {
		System.out.println("static block");
		var2 = 3000;
	}
	
	
	
	/*static method or static block can be executed without objects,
	 instance members cannot be used in static methods or the static block.*/
	 
	//Solution========How to approach to instance member in a static member========
		//↳After creating an object in static method, 
		// you can approach to instance member by using obj(reference variable)
	static void method3() {
		MyClass obj = new MyClass();
		obj.var1=200; 
	}
}
