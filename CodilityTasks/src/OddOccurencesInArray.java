import java.util.*;
public class OddOccurencesInArray {
	static int result;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int N;
		System.out.println("Enter size of an array(Note it must be odd number only)");
		while(true)
		{
		
			N=sc.nextInt();
			if(N%2==0)
			{
				System.out.println("The array size is not an odd number. Please try again!");
			}
			else
				break;
		}
		int A[]=new int[N];
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<N;i++)
		{
			A[i]=sc.nextInt();
		}
		OddOccurencesInArray obj = new OddOccurencesInArray();
		System.out.println("The odd occurence in array is: " 
				+ obj.Solution(A));

	}
	public static int Solution(int A[])
	{
		int key,j;
		int count=0;
		/*Arrays.sort(A);
		for(int i=0;i<A.length;i=i+2)
		{
			for(int j=i+1;j<A.length;j=j+2)
			{
				if(A[i]==A[j])
					{continue;}
				else
				{result = A[i];}
			}
			
			 
		}*/
		for(int i=0;i<A.length;i++)
		{
			key=A[i];
			for(j=0;j<A.length;j++)
			{
				if(key==A[j])
					{count++;}
				
			}
			if(count<2)
			{
				result=key;
				break;
				
			}
			count=0;
			
		}
		return result;
		
	}

}
