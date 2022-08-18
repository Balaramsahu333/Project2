package roughpratice;

import java.util.ArrayList;

public class ArrayListStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr= new ArrayList();
		arr.add("Balaram");
		arr.add(10);
		arr.add(65.5);
		arr.add("Velocity");
		arr.add("pune");
		arr.add(" time");
		System.out.println(arr);
		System.out.println(arr.contains("pune"));
		System.out.println(arr.get(4));
	System.out.println(arr.size());
	System.out.println(arr.lastIndexOf("pune"));
	System.out.println(arr.indexOf("Balaram"));
	System.out.println(arr.add("null"));
	arr.add(2, "Sahu");
	System.out.println(arr);
	arr.remove("null");
	System.out.println(arr);
	arr.trimToSize();
	System.out.println(arr);
	for(int i=0;i<=arr.size()-1;i++) {
		System.out.println(arr.get(i));
	
		
		
		

	}

}
}
