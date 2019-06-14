
public class Test_OddEven 
{

static void separate(int a[])
{
	
	int j=0,k=7;
	while(j<k)
	{
		while((a[j]%2==0)&& (j<k))
			j++;
		while((a[j]%2==1)&& (j<k))
			k--;
		if(j<k)
		{
			int temp=a[j];
			a[j]=a[k];
			a[k]=temp;
			j++;
			k--;
		}
		

	
	
}
}
public static void main(String[] args)

{
	int a[]= {12,17,70,15,22,65,21,90};
	separate(a);
	for(int i=0;i<8;i++)
		System.out.println(a[i]);
}
 
}
