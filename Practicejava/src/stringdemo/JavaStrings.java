package stringdemo;

public class JavaStrings {

	public static void main(String[] args) {
		//String literals
		//stored in String constant pool
		//s and s1 reference variable pointing to the same literal "cjc"
		String s = "cjc";
		//String s1 ="cjc";
		s.concat("karve");
		//s=s.concat("karve");
		String s4 = s.concat("nagar");
		//== will compare hashcodes in s and s1 which will be same for string cjc
		if(s==s4)
		{
			System.out.println("s==s4");
		
		}
		else
		{
			System.out.println("s!==s4");
		}
		System.out.println(s);
		System.out.println(s4);
		//string object using new keyword
		//string object is constructed in heap area with cjc as its content
			
		String s2 = new String("cjc");
		s2.concat("class");
		//s2=s2.concat("class");
		String s3 = new String("cjcclass");
		
		//== will compare reference variable means hashCodes not the content
		if(s2==s3)
		{
			System.out.println("s2==s3");
		
		}
		else
		{
			System.out.println("s2!==s3");
		}
		
		
		//now compare the strings
		
		if(s2.equals(s3))
		{
			System.out.println("s2 equals to s3");
		}
		else
		{
			System.out.println("s2 not equals to s3");
		}

	}

}
