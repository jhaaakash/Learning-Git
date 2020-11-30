package Assignments;

/*Replace a substring inside a string by another one .

   Instructions :
   Create a method that takes String as an input parameter .
   Invoke the method and pass "Hello Cricket"  as the parameter 
   The method should replace 'Cricket'  with   'Football'  and print .
   Expected Output :  "Hello Football" 
 */
public class Assignmnet1 {
	
	public void InitialString(String First)
	{
		String pattern = First;
		String changed = pattern.replace("Cricket", "Football"); 
		
		System.out.println("orginal string: " + pattern);
		System.out.println("replaced string: " + changed);
	}
	
	public static void main(String[] args)
	{
		Assignmnet1 obj= new Assignmnet1();
		obj.InitialString("Hello Cricket");
	}
	

}
