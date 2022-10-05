package arrayPractice;

public class ArrayCopy {
	public static void main(String[] args) {
		char[] source = {'a','T','u','t','o','r','i','a','l','r','i','d','e'};
		char[] dest = new char[12];
		
		System.arraycopy(source,1, dest,0,12);
		System.out.println(new String(dest));
	}


	}
