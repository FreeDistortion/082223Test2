package additionalHW.six;

public class FindCharacters {

	
	public static void main(String[] args) {
		FindCharacters fc=new FindCharacters();
		int count=fc.countChar("Boys, be ambitious", 'b');
		System.out.println(count);

	}
	public int countChar(String str, char c) {
		// Method를 완성하세요...
		int count=0;
		char[] splitD=str.toCharArray();
		for(int i=0;i<splitD.length;i++) {
			if(splitD[i]==c) {
				count++;
			}
		}
		return count;
	}
}
