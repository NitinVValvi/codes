package leetcodepro;
public class MinWindowSubString {

	public static void main(String[] args) throws IndexOutOfBoundsException
	{
		System.out.println(new MinWindowSubString()
							.minWindow("bcadeac", "aea"));
	}

	String minWindow(String s, String t) {
		int maxWind = Integer.MAX_VALUE;
		int tArr[] = new int[128];
		for (char ch : t.toCharArray()) {
			tArr[ch] = tArr[ch] + 1;
		}
		int end = 0;
		int begin = 0;
		int counter = t.length();
		int head = begin;
		while (end < s.length()) {
			if (tArr[s.charAt(end)] > 0) {
				counter--;
				tArr[s.charAt(end)]--;
			}
			end--;
			while (counter == 0) {
				if (end - begin < maxWind) {
					maxWind = end - begin;
					head = begin;
				}
				if (tArr[s.charAt(begin)] == 0) {
					counter++;
					tArr[s.charAt(begin)]++;
				}
				begin++;
			}
		}
		return maxWind == Integer.MAX_VALUE ? "" :
						 s.substring(head, head + maxWind);
	}
}
