package chap15.lecture.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
	//set과 list는 타입파라미터 하나씩
	//map은 타입파라미터 두개(왜냐면 키랑 value랑 쌍으로 저장)
	//순서가없고 중복되지 않는다.
	
	public static void main(String[] args) {
		//(Key, Value)-Entry 쌍으로 저장
		//dictionary
		
		Map<Integer, String>  map = new HashMap<>();
		
		//추가
		map.put(100, "kim");
		map.put(30, "hong");
		map.put(22,"lee");
		map.put(11, "choi");
		map.put(200,"jin");
		
		System.out.println(map.size());
		
		/*이미 가지고 있는 key이면 덮어씀*/
		
		//수정
		map.put(200, "park");
		System.out.println(map.size()); //덮어씀

		//검색
		String v1 = map.get(100);
		System.out.println(v1);
		System.out.println(map.get(200));
		
		
		//삭제
		map.remove(200);
		System.out.println(map.size());
		
		//전체 탐색
		System.out.println();
		System.out.println("향상된 for/keySet");
		Set<Integer> keys = map.keySet(); //keySet이 리턴하는 타입이 Set임(순서없고 중복되지 않음)
		for(Integer key : keys) {
			System.out.println(key+":"+map.get(key));
		}
		System.out.println("향상된 for/entrySet");
		Set<Map.Entry<Integer, String>> entrys = map.entrySet();
		for(Map.Entry<Integer, String> entry: entrys) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
}
