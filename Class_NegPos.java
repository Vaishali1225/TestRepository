import java.util.Scanner;
public class Class_NegPos 
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Enter length of Array:");
	int len= sc.nextInt();
	
	int a[]=new int[len];
	  for(int i=0;i<len;i++)
	  {
		  a[i]= sc.nextInt();
	  }
	  
	  for(int i=0;i<len;i++)
	  {
		  for(int j=i+1;j<len;j++)
		  {
			  if((a[i]+a[j]==0)||(a[i]+a[j]==1)||(a[i]+a[j]==-1))
			  {
				  System.out.println("The Pair is ("+a[i]+","+a[j]+").");
			  }
		  }
	  }
	
}
}
