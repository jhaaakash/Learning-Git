package Collections;

public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,1,2,2,3,3};
		System.out.println(arr.length);
		for (int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if((arr[i] == arr[j]) && (i!=j) )
				{
					System.out.println("repeated element " + arr[j]);
				}
			}
			
		}
	}

}
