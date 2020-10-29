package chap15.textbook_exer.s150201;

import java.util.List;

import chap08.textbook.exercise.p04.DaoExample;

public class ListExample {
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for(Board board : list) {
			System.out.println(board.getTitle()+"-"+board.getContent());
		}
	}
}
