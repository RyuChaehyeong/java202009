package chap15.textbook.s150403;

import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) throws IOException, Exception {
//		Map<String, String> map;
		Properties properties = new Properties(); //타입파라미터 쓸일없음
		//
		
		//파일을 읽어서 map에 설정 파일(.properties)의 정보를 저장하는 것이 목적
			// "=" 기준으로 key와 value로 저장
			//-> 이런 메소드를 가지고 있음
		
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		path = URLDecoder.decode(path, "utf-8"); //한글 경로 적절히 수정
		//load method가 properties 파일에서 읽어옴
		properties.load(new FileReader(path)); //error날 수 있는 code
		//이런일이 자주 일어나니까 Map의 <String, String> 타입을 만들어 놓은 것이 Properties class
		//Properties class 만들어지긴 Object, Object로 만들어졌지만 String이라고 생각하고 쓰면 됨.
		
		System.out.println(properties.size());
		
		//get method는 Object 타입으로 받음
		Object urlValue_obj = properties.get("url"); 
		
		//밑에서 형변환하기 불편하니까 getProperty method사용
		String urlValue_str = properties.getProperty("url");
		System.out.println(urlValue_str);
	}
}
