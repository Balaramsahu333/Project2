package pettentProgrampratice;

public class Pyramid {

	public static void main(String[] args) {
	
	    int star=1;
	    int space=3;
	    for (int i=1;i<=4;i++)
	    {
	    	for(int j=1;j<=space;j++) {
	    		System.out.print(" ");
	    	}
	    	for (int k=1;k<=star;k++)
	    	{
	    		System.out.print("*");
	    	}System.out.println();
	    	star=star+2;
		    space--;
	    }
	   System.out.println("==============InvertPyramid==============");

	    int star1=7;
	    int space2=0;
	    for (int i=1;i<=4;i++)
	    {
	    	for(int j=1;j<=space2;j++) {
	    		System.out.print(" ");
	    	}
	    	for (int j=1;j<=star1;j++)
	    	{
	    		System.out.print("*");
	    	}System.out.println();
		    space2++;

	    	star1=star-2;
	    }
	   
	   
	   
	}

}
