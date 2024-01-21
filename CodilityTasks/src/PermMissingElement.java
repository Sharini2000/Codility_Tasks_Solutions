import java.util.Scanner;
//https://testing-fin.codility.net/programmers/lessons/3-time_complexity/perm_missing_elem/
public class PermMissingElement {
static int result;
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
		System.out.println("The missing number in array is: "+Solution(A));
		

	}
	public static int Solution(int A[])
			{
		int key,count=0;
		for(int i=1;i<=A.length;i++)
		{
			
			for(int j=0;j<A.length;j++)
			{
				if(i==A[j])
				{
					count++;
				}
			}
			
			if(count==0)
			{
				result=i;
				break;
			}
			count=0;
		}
		return result;
			}

}
