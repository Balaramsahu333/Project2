package roughpratice;

public class UseImplement implements Intfacesss,Generilation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    UseImplement UI = new UseImplement();
		    UI.Modi();
		    UI.nabin();
		    UI.subject();
		    UI.Marks();
	}

	@Override
	public void Modi() {
		// TODO Auto-generated method stub
		System.out.println("modi is the prime minister of india");
		
	}

	@Override
	public void nabin() {
		// TODO Auto-generated method stubsys
		System.out.println("Nabin is the chief minister of india");
		
	}

	@Override
	public void Marks() {
		// TODO Auto-generated method stub
		System.out.println("marks are dicided as per name");
		
	}

	@Override
	public void subject() {
		// TODO Auto-generated method stub
		System.out.println("the mother name is tiger");
	}

}
