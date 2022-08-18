package roughpratice;

public class Cnst {
	 static int a=5;
	int b=6;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cnst t= new Cnst();
		t.test();
		  
		  System.out.println(t.b);
		  Cnst h= new Cnst(10,20);
		  h.test();
		  
		
		 
		  
	}
	 public Cnst()
	 {
		System.out.println("im print the statement");
	 }
		public Cnst(int x,int y)
		{ a=x;
		  b=y;
			int sum=b+a;
			System.out.println("THe sum"+ sum);
		}
	
	 public void test()
	 {
		 int a=10;
		 int b=12;
		 int c= a+b;
		 System.out.println(c);
		 
	 }
	 public static void test2()
	 {
		 
	 }

}
