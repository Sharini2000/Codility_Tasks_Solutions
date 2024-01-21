//https://testing-fin.codility.net/programmers/lessons/3-time_complexity/frog_jmp/
import java.util.*;
public class FrogJump {
	public static void main(String A[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter X: ");
		int x=sc.nextInt();
		System.out.println("Enter Y: ");
		int y=sc.nextInt();
		System.out.println("Enter D: ");
		int d=sc.nextInt();
		int sum=x+d,count=1;
		while(true)
		{
			
			if(sum>=y)
				break;
			else
			{
				count++;
				sum=sum+d;
			}
		    
		}
		System.out.printf("The frog takes %d jumps to reach destination.",count);
		
				
	}

}
