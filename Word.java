
public class Word {
	private String ans;
	private StringBuilder question=new StringBuilder();
	private char[] letter;
	
	public Word() {
		
	}
	
	public Word(String answer){
		ans=answer;
		letter=new char[ans.length()];
		for(int i=0;i<ans.length();i++) {
			letter[i]=ans.charAt(i);
			question.append("_");
		}
	}
	
	public String toString(){
		return question.toString();
	}
	
	public boolean update(char c) {
		int i=0;
		int ck=0;
		while(i<ans.length()) {
			if(c==letter[i]) {
				question.replace(i,i+1,String.valueOf(letter[i]));
				ck++;
			}
			i++;
		}
		if(ck==0) return false;
		return true;
	}
	
	public boolean isCorrect() {
		if(!ans.equals(question.toString())) return false;
		return true;
	}
	
	public String getAnswer() {
		return ans;
	}

}
