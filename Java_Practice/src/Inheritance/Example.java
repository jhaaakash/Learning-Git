package Inheritance;

public class Example {

	public static void main(String []args)
	{
		Student s=new Student();
		s.setAge(25);
		s.setName("Aakash");
		s.setRollno(1);
		System.out.println("Name:"+s.getName());
		System.out.println("Age:"+s.getAge());
		System.out.println("RollNo:"+s.getRollno());
	}
	
}
