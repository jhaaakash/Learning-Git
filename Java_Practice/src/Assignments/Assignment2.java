package Assignments;
/*
 * Search a character inside a string and print . .

      Instructions :
        Create a method that takes String as an input parameter .
        Invoke the method and pass "Data.xlsx"  as the parameter
        The method should print whatever is present after '.'  
	Expected Output :  "xlsx" 
*/
public class Assignment2 {
	
	public void InitialString(String First)
	{
		String pattern = First;
		String[] Changed=pattern.split(".",6);
		
		for (String a : Changed) 
            System.out.println(a);
		
	}
	
	public static void main(String[] args)
	{
		Assignment2 obj= new Assignment2();
		obj.InitialString("Data.xlsx");
	}

}
