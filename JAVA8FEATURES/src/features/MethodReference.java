package features;

public class MethodReference {

	public static void main(String[] args) {
		/*
		 * FunctionalInterfaceDemo functionalInterfaceDemo = Test::testImpl;
		 * 
		 * functionalInterfaceDemo.singleAbstractMethod();
		 */
		
		
		FunctionalInterfaceDemo f =()->System.out.println("Implementation of SAM (Single Abstract method)");
		
		f.singleAbstractMethod();
	}
}

/*
 * class Test {
 * 
 * public static void testImpl() {
 * System.out.println("Test implementation abstract call"); } }
 */
