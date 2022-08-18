package pettentProgrampratice;

public class ReverseString {

	public static void main(String[] args) {
	
		   
		       String str="welcome";
		        String rev="";
		        for(int i =str.length()-1;i>=0;i--)
		        {
		            rev=rev+str.charAt(i);
		        } System.out.println(rev);
		        StringBuffer str1=new StringBuffer(str);
		   System.out.println(str1.reverse());     
		        
		    }
		
	}


