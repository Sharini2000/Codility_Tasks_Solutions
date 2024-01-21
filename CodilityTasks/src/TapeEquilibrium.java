import java.util.Scanner;

public class TapeEquilibrium {
	static int firstPartSum,secondPartsum,AbsoluteDifference,Min;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N;
		System.out.println("Enter size of an array");
		N=sc.nextInt();
		int A[]=new int[N];
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<N;i++)
		{
			A[i]=sc.nextInt();
		}
		System.out.println("The min absolute diff is: "+Solution(A));

	}
	public static int Solution(int A[])
	{
		int FirstPart[]=new int[A.length];
		int SecondPart[]=new int[A.length];
		
		for(int P=1;P<A.length;P++)
		{
			for(int i=0;i<P;i++)
			{
				FirstPart[i]=A[i];
				
			}
			firstPartSum=SumofFirstPart(FirstPart);
			for(int i=P;i<A.length;i++)
			{
				for(int k=0;k<(A.length-P);k++)
				SecondPart[k]=A[i];
			}
			secondPartsum = SumofSecondPart(SecondPart);
			AbsoluteDifference = Math.abs(firstPartSum - secondPartsum);
			if (AbsoluteDifference < Min) {
		        Min = AbsoluteDifference;
		    }
			
		}
		return Min;
	
	}
	public static int SumofSecondPart(int temp[])
	{ 
		int sum=0;
		for(int i=0;i<temp.length;i++)
		{
			sum=sum+temp[i];
		}
		return sum;
	}
	public static int SumofFirstPart(int temp[])
	{ 
		int sum=0;
		for(int i=0;i<temp.length;i++)
		{
			sum=sum+temp[i];
		}
		return sum;
	}
	

}
