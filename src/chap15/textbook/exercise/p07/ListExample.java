package chap15.textbook.exercise.p07;

import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		//getBoardList의 리턴값이 list이어야 함.
		for(Board board : list) {
			System.out.println(board.getTitle()+"-"+board.getContent());
		}
	}
}
