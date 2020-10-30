package chap14.textbook.s140503;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionalExample2 {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
			);
			
	public static double avg (ToIntFunction<Student> function) {
		int sum = 0;
		for (Student student : list) {
			sum += function.applyAsInt(student);
			//일부 기능에 따라 하는 일이 결정됨
		}
		double avg = (double) sum / list.size();
		return avg;
		
	}
	
	public static void main(String[] args) {
		double englishAvg = avg(s -> s.getEnglishScore()); 
		//영어 점수를 가져오도록 기능을 정해줌
		double mathAvg = avg(s -> s.getMathScore()); 
		//수학 점수를 가져오도록 기능을 정해줌
		
		System.out.println("영어 평균 점수: "+englishAvg);
		System.out.println("수학 평균 점수: "+mathAvg);
	}
}
