package newinetviewpratice;

public class SecondLargestNUmberARr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,35,20,40,56,55,70,65};
		int min=a[0];
		int max=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>min)
			{
				int result=a[i];
				if(a[i]==result)
				{
					System.out.println(a[i]);
				}
			}
			
//			else if(a[i]<max)
//			{
//				System.out.println(a[i]);
//			}
		}
	}

}
