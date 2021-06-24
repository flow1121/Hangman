import java.util.Scanner;

public class Hangman {
	private static final Scanner s=new Scanner(System.in);
	
	private static char inputLetter() {
		System.out.print("a-z?> ");
		return s.nextLine().charAt(0);
	}
	
	private static void play(Word word) {
		int life=5;
		do {
			System.out.println("["+life+"]"+word.toString());
			if(!word.update(inputLetter())) life--;
		}while(life>0 && !word.isCorrect());
		System.out.println("The answer is ["+word.getAnswer()+"].");
	}
	
	public static void main(String[] args) {
		play(Dictionary.createWord());
	}

}
