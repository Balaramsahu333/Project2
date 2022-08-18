package roughpratice;

public class NonstaticbyConstructor {

	public static void main(String[] args) {
		NonstaticbyConstructor t=new NonstaticbyConstructor();
		// TODO Auto-generated method stub

	}
	public NonstaticbyConstructor()
	{
		test(10,15);
		test1();
	}
	public void test(int a, int v)
	
	{
		int c=a+v;
		System.out.println("calling non static method by using constructor ");
		System.out.println(c);
	}
	public static void test1() {
		System.out.println(" im from static method by constructor");
	}

}
