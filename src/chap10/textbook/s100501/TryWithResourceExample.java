package chap10.textbook.s100501;

public class TryWithResourceExample {
		public static void main(String[] args) {
			try(FileInputStream fis = new FileInputStream("file.txt")) {
				fis.read();

				//강제적으로 xception을 발생시키는 코드
				throw new Exception();
			} catch(Exception e) {
				System.out.println("예외 처리 코드가 실행되었습니다.");
			}
		}
		//exception이 발생하든 안하든 file을 잘 닫아줌
}
