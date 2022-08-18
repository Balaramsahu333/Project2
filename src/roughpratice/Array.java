package roughpratice;

public class Array {

	private static final int i = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array is the collections of elements which store similar type of data
		//There are two type of array One dimensional & two dimensional
		int a[]=new int [5];// array declaration with specific size 
		a[0]=100;
        a[1]=200;
        a[2]=300;
        a[3]=400;
        a[4]=500;
				
			System.out.println(a[2]);	
			Array f=new Array();
			f.test1();
			String b[]=new String[5];
			b[0]="Balaram";
			b[1]="hello";
			b[2]="my world";
			b[3]="title";
			b[4]="toys";
System.out.println("the writer "+ b[3]);
       int c[]= {100,222,333,444};//declaring and intializg
       System.out.println(c[0]);
       int d[][]=new int[3][4];
       d[0][0]=100;
       d[1][0]=400;
       d[1][1]=125;
       d[2][1]=152;
       System.out.println(d[1][1]);
       String g[][]= {{  "hari","nari"},{"tori","dory"}};
      System.out.println(g[0][1]);
       
       
	}
	
	public void test1()
	{
		int a[]=new int [5];// array declaration with specific size 
		a[0]=10;
        a[1]=20;
        a[2]=40;
        a[3]=30;
        a[4]=50;
        for(int i=0;i<=4;i++){
     	   
   
		System.out.println(a[i]);	

	}
      for (int i=0; i<=a.length-1;i++)
      {
    	  System.out.println(a[i]);
      }
	
	}
}
