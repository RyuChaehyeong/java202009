package chap15.textbook_exer.s150201;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); //key가 중복이면 맨 마지막에 저장한 value를 값으로 가짐
		System.out.println("총 Entry 수: "+map.size());
		
		System.out.println("\t홍길동: "+map.get("홍길동"));
		System.out.println();
		
		
		/*keySet 얻기@*/
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t"+key+":"+value);
		}

		
		/*entrySet 얻기@*/
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t"+key+":"+value);
		}
		System.out.println();
		
	}
}
