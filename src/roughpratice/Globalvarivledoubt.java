package roughpratice;

public class Globalvarivledoubt {
	int a=5 ;
	int b=6;
	public  Globalvarivledoubt (int x,int y)
	  {
		 a=x; 
		 b =y;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Globalvarivledoubt k=new  Globalvarivledoubt (10, 15);
		 k.add();
	int f=5;
	int g=9;
	int h;
	System.out.println( h=f+g);
	
	}
public void add()
{
	
	int c =this.a+b;
	System.out.println(c);
	int d=this.a-b;
	System.out.println(d);
}
}
