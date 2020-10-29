package chap15.textbook_exer.s150201;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null; //최고 점수를 받은 아이디 저장
		int maxScore = 0; //최고 점수 저장
		int totalScore = 0; //점수 합계 저장
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			String id = entry.getKey();
			int score = entry.getValue();
			
			totalScore += score;
			
			if(score > maxScore) {
				maxScore = score;
				name = id;
			}
		}
		
		int avg = 0;
		avg = totalScore / map.size();
		System.out.println("평균: "+ avg);
		System.out.println("최고점수: "+maxScore);
		System.out.println("최고점수를 받은 id: "+name);
	}
}
