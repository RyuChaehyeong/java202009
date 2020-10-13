package chap06.textbook.s060703;

public class Korean {
	String nation;
	String name;
	String ssn;
	
	public Korean(String n, String s) {
		nation = "대한민국"; //인스턴스는 생성자 통해서 만들어야 하니까 여기에 써도댐
		name = n;
		ssn = s;
	}
	//파라미터 있는 생성자를 만들면 public Korean() {} 기본생성자가 자동으로 추가되지 않음
	// Korea k3 = new Korean(); 이렇게 쓰면 오류남
	
}
