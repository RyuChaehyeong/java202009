package chap08.textbook.exercise.p04;

public class DaoExample {
	
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
		//dbOWork method의 parameter는 DataAccessObject이므로 
		//이 interface를 구현하고 있는 OracleDao 객체랑
		//MySqlDao 객체가 parameter가 될 수 있고 
		//실행되는 메소드는 실제 인스턴스의 메소드가 실행이 된다. 

		
	}
}
