package chap05.exercise;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		int max = 0;
		int sum = 0;
		double avg = 0.0;

		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("============================================================");
			System.out.println("| 1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 |");
			System.out.println("============================================================");
			System.out.print("선택> ");
			
			int selectNum = sc.nextInt();
			
			if(selectNum == 1) {
				System.out.print("학생수> ");
//				studentNum = scores.length;
//				System.out.println(studentNum);
				studentNum = sc.nextInt();
				scores = new int[studentNum]; //여기서 배열의 길이 결정
			} else if (selectNum == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores["+i+"]> ");
					scores[i] = sc.nextInt();
				}
			} else if (selectNum == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores["+i+"]: "+scores[i]+"점");
				}
			} else if (selectNum == 4) {
				for (int i = 0; i < scores.length; i++) {
					max = (max > scores[i])? max : scores[i];
					sum += scores[i];
				}
				avg = (double)sum / scores.length;
				System.out.println("최고 점수: "+max);
				System.out.println("평균 점수: "+avg);
			} else if (selectNum == 5) {
				run = false;
			}
			
		}
		System.out.println("프로그램 종료");
	}
}
