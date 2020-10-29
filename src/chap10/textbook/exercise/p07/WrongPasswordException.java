package chap10.textbook.exercise.p07;

public class WrongPasswordException extends Exception{
	public WrongPasswordException() {}
	public WrongPasswordException(String message) {
		super(message);
	}
}
