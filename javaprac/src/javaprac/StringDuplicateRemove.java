package javaprac;

public class StringDuplicateRemove {

	public static void main(String[] args) {

		String str = "nitin";

		System.out.println(removeDuplicatechars(str));
	}

	private static  String removeDuplicatechars(String str) {

		StringBuilder sb = new StringBuilder();
		char[] chararray = str.toCharArray();

		for (char ch : chararray) {
			if (sb.indexOf(String.valueOf(ch)) != -1) {
				continue;
			} else {
				sb.append(ch);
			}
}
		return sb.toString();

	}
}
