package chap06.textbook.s061504;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD}) //메소드에만 적용
@Retention(RetentionPolicy.RUNTIME) //런타임시까지 어노테이션 정보유지
public @interface PrintAnnotation {
	String value() default "-";
	int number() default 15;
	
}
