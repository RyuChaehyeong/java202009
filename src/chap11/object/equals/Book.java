package chap11.object.equals;
//각자 가지고 있는 책은 다른 책(객체)이지만 barCode를 비교하여 같으면 같은 책이라고 취급하고 싶은 경우
//Object의 equals()메소드를 재정의하여 바코드 필드값이 같음을 비교하면 된다. 
public class Book {
	private int barCode;
	public Book(int barCode) {
		this.barCode = barCode;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + barCode;
		return result;
		//barCode가 같으면 result가 같다.
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) //타입이 다르면
			return false;
		Book other = (Book) obj;
		if (barCode != other.barCode) 
			return false;
		return true;
	}
	
//	@Override
//	public int hashCode() {
//		return barCode;
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		//파라미터가 Object type이니까 book type으로 강제 캐스팅
//		Book o = (Book) obj;
//		
//		return this.barCode == o.barCode;
//	}
	
	
}
