package ExceptionHandling;

public class ExceptionHnadling_Learning1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=10;
			int b=0;
			try {
			int c=a/b;
			}
			catch(Exception ab)
			{
				System.out.println("Inside try nested");
			}
			System.out.println("Inside try block ");
		}
		catch (Exception ex)
		{
			System.out.println("Exception Handles" +ex.getLocalizedMessage() +ex.getCause());
		}
		finally {
			System.out.println("I am finally, i will run madatoryly");
		}
		System.out.println("Checking whether line gets print after finallyh method or not");

	}

}
