package roughpratice;

import java.util.Scanner;

public class CwHarry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your number");
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
	
		
		int mark1=sc.nextInt();
		int mark2=sc.nextInt();
		int mark3=sc.nextInt();
		int mark4=sc.nextInt();
		int mark5=sc.nextInt();
	 int percentage=mark1+mark2+mark3+mark4+mark5;
		System.out.println(percentage);
		float pre=((percentage/500f)*100);
		System.out.println("your percentage is "+ pre);

	}

}
