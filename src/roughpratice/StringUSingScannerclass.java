package roughpratice;

import java.util.Scanner;

public class StringUSingScannerclass {

	public static void main(String[] args) {
	          Scanner sc =new Scanner(System.in);
	          System.out.println("Enter your String to reverse");
	          String st=sc.next();
	          StringBuffer sb = new StringBuffer(st);
	      StringBuffer   result= sb.reverse();
	      System.out.println(result);
	}
	

}
