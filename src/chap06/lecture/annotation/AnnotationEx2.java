package chap06.lecture.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

public class AnnotationEx2 {
	public static void main(String[] args) throws Exception {
		Class clazz = MyClass.class;
		Method method = clazz.getMethod("method1");
		boolean anno = method.isAnnotationPresent(MyAnnotation.class);
		System.out.println(anno); //true
		//실행하는 순간에도 annotation 남아있게 하려면 MyAnnotation정의시
		//@Retention(RetentionPolicy.RUNTIME)를 써야 함
	}
}
