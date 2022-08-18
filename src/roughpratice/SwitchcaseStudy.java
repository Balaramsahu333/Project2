package roughpratice;
import java.util.Scanner;
public class SwitchcaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your months to know the place of the months \n");
		String months =sc.next();
		switch(months)
		{
		case "january":System.out.println("the position of the months is -1st month");
		break;
		case "february":System.out.println("the position of the months is -2nd months");
		break;
		case "march":System.out.println("the position of the months is -3rd month");
		break;
		case "april":System.out.println("the position of the months is -4th month");
		break;
		case "may":System.out.println("the position of the months is -5th months");
		break;
		case "june":System.out.println("the position of the months is -6th month");
		break;
		default:System.out.println("please enter valid months");
		break;
		}

	}

}
