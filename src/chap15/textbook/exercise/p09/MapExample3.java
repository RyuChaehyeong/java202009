package chap15.textbook.exercise.p09;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample3 {
	//entry set이용
		public static void main(String[] args) {
			Map<String, Integer> map = new HashMap<String, Integer>();
			map.put("blue", 96);
			map.put("hong", 86);
			map.put("white", 92);
			
			String name = null; //최고 점수를 받은 아이디 저장
			int maxScore = 0; //최고 점수 저장
			int total = 0; // 점수 합계 저장
		
			for(Map.Entry<String, Integer> entry : map.entrySet()) {
				String id = entry.getKey();
				int score = entry.getValue();
				
				total += score;
				if(score > maxScore) {
					maxScore = score;
					name = id;
				}
			} 
			int avg =  total /map.size();
			System.out.println("평균: "+avg);
			System.out.println("최고점수: " +maxScore);
			System.out.println("최고점수 아이디: "+name);
	}
		
}
