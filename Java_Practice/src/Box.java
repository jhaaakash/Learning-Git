
class Box {
	
	private int length, breadth, height;
	public void setDimension(int l, int b, int h)
	{
		length=l;
		breadth=b;
		height=h;
	}
	public void showDimension()

	{
		System.out.println("L="+length);
		System.out.println("B="+breadth);
		System.out.println("H="+height);
	}

}
