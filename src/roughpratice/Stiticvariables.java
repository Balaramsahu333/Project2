package roughpratice;

public class Stiticvariables {
	String name;
	int eml_id;
	static int  dept_no=60;
	int x;
	int y;
	int z;
	float wgt;
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 Stiticvariables sc= new  Stiticvariables (60, 78, 80);
		 sc.name="balaram";
		sc.empinfo();
	//titicvariables sb=new Stiticvariables();
		sc.name="ri";
		sc.eml_id=89;
	sc.emp2();
	Stiticvariables df =new Stiticvariables("baliram", 69, 56);
	sc.it();
	}
	public void empinfo()
	{
		System.out.println(name);
		System.out.println(eml_id);
		System.out.println(dept_no);
}
	public void emp2()
	{
		System.out.println(name);
		System.out.println(eml_id);
		System.out.println(dept_no);
}
	Stiticvariables(int a,int b,int c)
	{
		x=a;
		y=b;
		z=c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	Stiticvariables(String j,int k,float l)
	{
		name=j;
		x=k;
       wgt=l;
		
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
	}
	public  void it()
	{
		int h= x+y+z;
		System.out.println(h);
	}
	
	}
	


