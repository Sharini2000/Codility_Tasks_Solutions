import java.util.Scanner;
//https://testing-fin.codility.net/programmers/lessons/4-counting_elements/perm_check/
public class PermCheck {

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
		System.out.println("The output is: "+Solution(A));

	}
	public static int Solution(int A[])
	{
		
		for(int i=1;i<=A.length;i++)
		{int count=0;
			int key = i;
			for(int j=0;j<A.length;j++)
			{
				if(key==A[j])
					count++;
			}
			if(count!=1)
			{
				return 0;
			
			}
			
		}
		
			return 1;
	}

}
