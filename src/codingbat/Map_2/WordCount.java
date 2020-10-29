package codingbat.Map_2;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
	public Map<String, Integer> wordCount(String[] strings) {
		  
		  Map<String, Integer> map = new HashMap<>();
		  
		  for(String str : strings) {
		    int cnt = 0;
		    for(int i = 0 ; i<strings.length;i++) {
		      if(str.equals(strings[i])) {
		        cnt ++;
		      }
		    }
		    map.put(str, cnt);
		  }
		  return map;
		}

}
