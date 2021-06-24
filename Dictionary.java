import java.util.Random;

public class Dictionary {
	private static final String[] word = {"example"};
	
	private static final Random r=new Random();
	
	public static Word createWord(){
		return new Word(word[r.nextInt(word.length)]);
	}

}
