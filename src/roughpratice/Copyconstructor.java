package roughpratice;

public class Copyconstructor {
	int a;
	String b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Copyconstructor cc= new Copyconstructor (60,"baalaram" );
		Copyconstructor cd= new Copyconstructor (cc);
		cd.display();
		cc.display();

	}
	Copyconstructor(int x,String y){
		a=x;
		b=y;
		//System.out.println(a);
		//.out.println(b);
	}
	Copyconstructor (Copyconstructor d){
		a=d.a;
		b=d.b;
		
	}
	void display()
	{
		System.out.println(a+" "+b);
	}

}
