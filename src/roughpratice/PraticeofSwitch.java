package roughpratice;
import java.util.Scanner;
public class PraticeofSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number which you want calculate");
             
         int a=sc.nextInt();
         int b=sc.nextInt();            
           int c;  
           System.out.println("enter 1 for adition /n"+" enter 2 for substration /n"+" enter 3 for multiplication4");
        int ch=sc.nextInt();
        switch(ch)
        {
        case 1:c=a+b;
        System.out.println("the addition is"+ c);
        break;
        case 2:c=a-b;
        System.out.println("the substration is"+ c);
        break;
        case 3:c=a*b;
        System.out.println("the multiplication  is"+ c);
        break;
        default :System.out.println("enter valid key5");

        }
	}

}
