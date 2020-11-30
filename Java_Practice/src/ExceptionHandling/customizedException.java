package ExceptionHandling;

public class customizedException {

	public static void main(String[] args) throws IncorrectNumberException {
		// TODO Auto-generated method stub
		
		int num= 7;
		if (num!=77)
		{
			throw new IncorrectNumberException();
			
		}

	}

}
