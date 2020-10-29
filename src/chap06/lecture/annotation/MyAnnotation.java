package chap06.lecture.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



//Target annotation을 사용하여 어디에 붙이고 싶은지 ElementType 중에서 열거 상수 잘 골래서 
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
	//annotation 옆에 둥근괄호에 값넣고 싶으면 이렇게씀
	String value() default "123"; 
	//기본값 넣으면 내가 안써줘도 들어감 default "뭐시기";
	int number() default 3; //여러개
	String[] names() default { "a", "b"}; //여러개 값을 넣을 때는 배열로 
}
