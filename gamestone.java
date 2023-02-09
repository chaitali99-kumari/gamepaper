import java.util.Scanner;
import java.util.*;
class gamestone
{
	public static void main(String arg[])
	{
		int n ,a,i=0,p=0,c=0;
		String st;
		String s;
		System.out.println("enter the player name");
		Scanner sn = new Scanner(System.in);
		st= sn.nextLine();
		System.out.println(" 0=scissors \n 1=paper \n 2=rock ");
		do{
			for(i=0;i<5;i++)
			{
				System.out.println("enter a no. between 0 to 3");
			
				n= sn.nextInt();
				System.out.println("enter a no. between 0 to 3 by computer");
				Random ran=new Random();
				a = ran.nextInt(3);
				System.out.println("the value input by computer is "+a);
				if(n==0 && a==1||n==1 && a==2 ||n==2 && a==0)
				{
					System.out.println(st +" is the winner");
					p++;
				}
				else if (n==0 && a==2||n==1 && a==0||n==1 && a==0 || n==2 && a==1)
				{
					System.out.println("computer is the winner");
					c++;
				}
				else if (n==0 && a==0 || n==1 && a==1 || n==2 && a==2)
				System.out.println("match draw");
				else
				System.out.println("invalid no");
			}
			if(p>c)
			System.out.println("At last " + st +" is the winner");
			else
			System.out.println("At last computer is the winner");
			System.out.println("Do you want to play again?");
			Scanner sp=new Scanner(System.in);
			s=sp.nextLine();
		}while(s.equals("yes"));
	}
}