package dailytasks;

public class BubbleSort {

	public static void main(String[]args)
	{
		
		int ar[]= {5,7,8,2,9,1};
		int temp=0;
		
		for (int i = 0; i < ar.length-1; i++) {
			
			if(ar[i]>ar[i+1])
			{
				temp=ar[i];
				ar[i]=ar[i+1];
				ar[i+1]=temp;
				
			}
			}
		
		
			
		for (int i = 0; i < ar.length-1; i++) {
		
			System.out.println(ar[i]);
			
		}
              
	
		
		
	}
}
