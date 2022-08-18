package roughpratice;

public class Prcs1 {
	int a;
	int b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prcs1 pr=new Prcs1();
		pr.test1();
      Prcs1 pt =new Prcs1(100,300);
      pt.test1();
    
	}
	Prcs1 ()
	{
		a=10;
		b=15;
		System.out.println("zero parameterized");
	}
	 public Prcs1(int x,int y)
	{
		a=x;
		b=y;
	}
 public void test1()
 
 { 
	 int b=9;
	 int sum=a-this.b;
	 System.out.println(sum);
	 int minus=a+this.b;
	 System.out.println(minus);
 }
}
