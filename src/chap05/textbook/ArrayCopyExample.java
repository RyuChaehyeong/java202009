package chap05.textbook;

public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];//참조값을 복사
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
						//원본배열       //카피본배열          복사할 개수
				       	  //원본의 시작인덱스      //카피본의 시작인덱스
		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i]+", ");
		}
		
	}//컴파일 결과: java, array, copy, null, null, 
}
