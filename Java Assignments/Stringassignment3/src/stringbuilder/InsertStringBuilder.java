package stringbuilder;

public class InsertStringBuilder {
	public static  void main(String[] args) {
		StringBuilder sb = new StringBuilder("It is used to  at the specified index position");
		sb.insert(13, " Insert text");
		System.out.println(sb);
	}
}
