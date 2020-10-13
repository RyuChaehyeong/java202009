package chap03.textbook;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("==============================");
		x++; //x=11
		++x; //x=12
		System.out.println("x="+x);
		
		System.out.println("==============================");
		y--; //y=9
		--y; //y=8
		System.out.println("y="+y);
		
		System.out.println("==============================");
		z=x++; //x=12
		System.out.println("z="+z);
		System.out.println("x="+x); //x=13
		
		System.out.println("==============================");
		z= ++x; //x=14
		System.out.println("z="+z);
		System.out.println("x="+x); //x=14
		
		System.out.println("=============================");
		z = ++x + y++; //이때 x=15, y=8
		System.out.println("z="+z);
		System.out.println("x="+x);
		System.out.println("y="+y); //y=9
	}
}
