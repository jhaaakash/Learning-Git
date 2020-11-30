
public class callingBox {

	public static void main(String[] args) 
	{
		Box smallBox=new Box();
		smallBox.setDimension(5, 10, 15);
		smallBox.showDimension();
		smallBox=new Box();
		smallBox.showDimension();
	}

}
